package net.keinesorgen.patterns.bridge.notifications.sending.sms;

import net.keinesorgen.patterns.bridge.notifications.SendingAbstractFactory;
import net.keinesorgen.patterns.bridge.notifications.sending.SendingImplementor;
import net.keinesorgen.patterns.bridge.notifications.sending.SendingMessage;

/**
 *
 */
public class SmsSendingAbstractFactory implements SendingAbstractFactory {

    @Override
    public SendingMessage create(String phone, String text) {
        return new SmsSendingMessage();
    }

    @Override
    public String getType() {
        return "Sms";
    }

    @Override
    public SendingImplementor bridgeImplementor() {
        return new SmsSendingImplementor();
    }
}
