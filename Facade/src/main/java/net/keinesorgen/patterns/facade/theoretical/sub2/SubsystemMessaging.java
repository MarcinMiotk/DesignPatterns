package net.keinesorgen.patterns.facade.theoretical.sub2;

import java.util.Date;

/**
 *
 */
public class SubsystemMessaging {

    public void sendMessage(String phoneNumber, String title, String body, Date when, Priority priority) {
        System.out.println("Sending of message to " + phoneNumber + " with title " + title + " body " + body + " and priority " + priority + " at " + when);
    }
}
