package net.keinesorgen.patterns.bridge.notifications.storing.file;

import java.util.Date;
import net.keinesorgen.patterns.bridge.notifications.StoringAbstractFactory;
import net.keinesorgen.patterns.bridge.notifications.storing.StoringImplementor;
import net.keinesorgen.patterns.bridge.notifications.storing.StoringRecord;

/**
 *
 */
public class FileStoringAbstractFactory implements StoringAbstractFactory {

    @Override
    public StoringRecord create(String phone, String text, Date when) {
        return new FileStoringRecord();
    }

    @Override
    public String getType() {
        return "File";
    }

    @Override
    public StoringImplementor bridgeImplementor() {
        return new FileStoredImplementor();
    }
}
