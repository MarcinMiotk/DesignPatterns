package net.keinesorgen.patterns.facade.theoretical;

import java.util.Date;
import net.keinesorgen.patterns.facade.theoretical.sub1.Person;
import net.keinesorgen.patterns.facade.theoretical.sub1.SubsystemStoring;
import net.keinesorgen.patterns.facade.theoretical.sub2.Priority;
import net.keinesorgen.patterns.facade.theoretical.sub2.SubsystemMessaging;

/**
 *
 */
public class Facade {

    private final SubsystemStoring storing;
    private final SubsystemMessaging messaging;

    public Facade(SubsystemStoring storing, SubsystemMessaging messaging) {
        this.storing = storing;
        this.messaging = messaging;
    }

    public void easySend(String login, String title, String body) {
        Person where = storing.get(login);
        messaging.sendMessage(where.getPhoneNumber(), title, body, new Date(), Priority.MEDIUM);
    }
}
