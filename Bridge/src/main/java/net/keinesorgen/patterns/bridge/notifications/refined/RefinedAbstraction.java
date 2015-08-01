package net.keinesorgen.patterns.bridge.notifications.refined;

import java.util.Date;
import net.keinesorgen.patterns.bridge.notifications.Abstraction;
import net.keinesorgen.patterns.bridge.notifications.SendingAbstractFactory;
import net.keinesorgen.patterns.bridge.notifications.StoringAbstractFactory;
import net.keinesorgen.patterns.bridge.notifications.sending.SendingMessage;
import net.keinesorgen.patterns.bridge.notifications.storing.StoringRecord;

/**
 *
 */
public class RefinedAbstraction extends Abstraction {

    private final SendingAbstractFactory sending;
    private final StoringAbstractFactory storing;

    public RefinedAbstraction(SendingAbstractFactory sending, StoringAbstractFactory storing) {
        super(sending.bridgeImplementor(), storing.bridgeImplementor());
        this.sending = sending;
        this.storing = storing;
    }

    @Override
    public String send(String phone, String message) {
        perform(phone, message);
        return storing.getType() + "+" + sending.getType();
    }

    @Override
    protected StoringRecord record(String phone, String text) {
        return storing.create(phone, text, new Date());
    }

    @Override
    protected SendingMessage message(String phone, String text) {
        return sending.create(phone, text);
    }

}
