package net.keinesorgen.patterns.bridge.notifications.sending;

/**
 *
 */
public interface SendingImplementor {

    SendingResult send(SendingMessage message);
}
