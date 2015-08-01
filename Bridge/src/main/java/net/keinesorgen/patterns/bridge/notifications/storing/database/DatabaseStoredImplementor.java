package net.keinesorgen.patterns.bridge.notifications.storing.database;

import net.keinesorgen.patterns.bridge.notifications.storing.StoredIdentifier;
import net.keinesorgen.patterns.bridge.notifications.storing.StoringImplementor;
import net.keinesorgen.patterns.bridge.notifications.storing.StoringRecord;

/**
 *
 */
public class DatabaseStoredImplementor implements StoringImplementor {

    @Override
    public StoredIdentifier save(StoringRecord record) {
        System.out.println("Record " + record + " is saved into database");
        return new DatabaseStoredIdentifier();
    }

    @Override
    public void delete(StoredIdentifier id) {
        System.out.println("Record with id " + id + " is removed from database");
    }

}
