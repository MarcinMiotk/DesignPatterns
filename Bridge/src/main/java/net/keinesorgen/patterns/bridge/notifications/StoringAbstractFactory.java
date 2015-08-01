package net.keinesorgen.patterns.bridge.notifications;

import java.util.Date;
import net.keinesorgen.patterns.bridge.notifications.storing.StoringImplementor;
import net.keinesorgen.patterns.bridge.notifications.storing.StoringRecord;

/**
 *
 */
public interface StoringAbstractFactory {

    StoringRecord create(String phone, String text, Date when);

    String getType();

    StoringImplementor bridgeImplementor();
}
