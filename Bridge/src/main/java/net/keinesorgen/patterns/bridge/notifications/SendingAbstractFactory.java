package net.keinesorgen.patterns.bridge.notifications;

import net.keinesorgen.patterns.bridge.notifications.sending.SendingImplementor;
import net.keinesorgen.patterns.bridge.notifications.sending.SendingMessage;

/**
 *
 */
public interface SendingAbstractFactory {

    SendingMessage create(String phone, String text);
    
    String getType();
    
    SendingImplementor bridgeImplementor();
}
