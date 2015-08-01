package net.keinesorgen.patterns.bridge.notifications;

import net.keinesorgen.patterns.bridge.notifications.sending.SendingImplementor;
import net.keinesorgen.patterns.bridge.notifications.sending.SendingMessage;
import net.keinesorgen.patterns.bridge.notifications.storing.StoredIdentifier;
import net.keinesorgen.patterns.bridge.notifications.storing.StoringImplementor;
import net.keinesorgen.patterns.bridge.notifications.storing.StoringRecord;

/**
 *
 */
public abstract class Abstraction {

    private final SendingImplementor sendingBridging;
    private final StoringImplementor storingBridging;

    public Abstraction(SendingImplementor sendingBridging, StoringImplementor storingBridging) {
        this.sendingBridging = sendingBridging;
        this.storingBridging = storingBridging;
    }
    
    

    public abstract String send(String phone, String message);

    protected void perform(String phone, String text) {

        // to keep abstraction, I should use any creational design
        // pattern to create instances of StoringRecord class
        StoredIdentifier id = storingBridging.save(record(phone, text));

        // to keep abstraction, I should use any creational design
        // pattern to create instances of SendingMessage class
        sendingBridging.send(message(phone, text));

        storingBridging.delete(id);
    }

    protected abstract StoringRecord record(String phone, String text);

    protected abstract SendingMessage message(String phone, String text);
}
