package net.keinesorgen.patterns.bridge.notifications.storing.database;

import java.util.Date;
import net.keinesorgen.patterns.bridge.notifications.StoringAbstractFactory;
import net.keinesorgen.patterns.bridge.notifications.storing.StoringImplementor;
import net.keinesorgen.patterns.bridge.notifications.storing.StoringRecord;

/**
 *
 */
public class DatabaseStoringAbstractFactory implements StoringAbstractFactory {

    @Override
    public StoringRecord create(String phone, String text, Date when) {
        return new DatabaseStoringRecord();
    }

    @Override
    public String getType() {
        return "Database";
    }

    @Override
    public StoringImplementor bridgeImplementor() {
        return new DatabaseStoredImplementor();
    }

}
