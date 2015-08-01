package net.keinesorgen.patterns.bridge.notifications.sending.sms;

import net.keinesorgen.patterns.bridge.notifications.sending.SendingImplementor;
import net.keinesorgen.patterns.bridge.notifications.sending.SendingMessage;
import net.keinesorgen.patterns.bridge.notifications.sending.SendingResult;

/**
 *
 */
public class SmsSendingImplementor implements SendingImplementor {

    @Override
    public SendingResult send(SendingMessage message) {
        System.out.println("Send of SMS message");
        return new SmsSendingResult();
    }

}
