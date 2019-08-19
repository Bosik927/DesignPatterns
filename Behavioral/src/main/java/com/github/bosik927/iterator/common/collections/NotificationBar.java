package com.github.bosik927.iterator.common.collections;

import com.github.bosik927.iterator.common.iterators.Iterator;
import com.github.bosik927.iterator.common.Notification;

public class NotificationBar {

    private NotificationCollection notifications;

    public NotificationBar(NotificationCollection notifications) {
        this.notifications = notifications;
    }

    public void printNotifications() {
        Iterator iterator = notifications.createIterator();
        System.out.println("-------NOTIFICATION BAR------------");
        while (iterator.hasNext()) {
            Notification n = (Notification) iterator.next();
            System.out.println(n.getNotification());
        }
    }
}