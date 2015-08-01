package net.keinesorgen.patterns.bridge.notifications.storing;

/**
 *
 */
public interface StoringImplementor {

    StoredIdentifier save(StoringRecord record);

    void delete(StoredIdentifier id);
}
