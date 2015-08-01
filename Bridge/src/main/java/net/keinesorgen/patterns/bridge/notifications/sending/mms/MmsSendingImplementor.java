package net.keinesorgen.patterns.bridge.notifications.sending.mms;

import net.keinesorgen.patterns.bridge.notifications.sending.SendingImplementor;
import net.keinesorgen.patterns.bridge.notifications.sending.SendingMessage;
import net.keinesorgen.patterns.bridge.notifications.sending.SendingResult;

/**
 *
 */
public class MmsSendingImplementor implements SendingImplementor {

    @Override
    public SendingResult send(SendingMessage message) {
        System.out.println("Send of MMS message");
        return new MmsSendingResult();
    }
}
