package net.keinesorgen.patterns.bridge.notifications.storing.file;

import net.keinesorgen.patterns.bridge.notifications.storing.StoredIdentifier;
import net.keinesorgen.patterns.bridge.notifications.storing.StoringImplementor;
import net.keinesorgen.patterns.bridge.notifications.storing.StoringRecord;

/**
 *
 */
public class FileStoredImplementor implements StoringImplementor {

    @Override
    public StoredIdentifier save(StoringRecord record) {
        System.out.println("Record " + record + " is saved into file");
        return new FileStoredIdentifier();
    }

    @Override
    public void delete(StoredIdentifier id) {
        System.out.println("Record with id " + id + " is removed from file");
    }

}
