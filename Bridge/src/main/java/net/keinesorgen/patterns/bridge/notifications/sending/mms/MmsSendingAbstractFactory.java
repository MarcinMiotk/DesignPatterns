package net.keinesorgen.patterns.bridge.notifications.sending.mms;

import net.keinesorgen.patterns.bridge.notifications.SendingAbstractFactory;
import net.keinesorgen.patterns.bridge.notifications.sending.SendingImplementor;
import net.keinesorgen.patterns.bridge.notifications.sending.SendingMessage;

/**
 *
 */
public class MmsSendingAbstractFactory implements SendingAbstractFactory {

    @Override
    public SendingMessage create(String phone, String text) {
        return new MmsSendingMessage();
    }

    @Override
    public String getType() {
        return "Mms";
    }

    @Override
    public SendingImplementor bridgeImplementor() {
        return new MmsSendingImplementor();
    }

}
