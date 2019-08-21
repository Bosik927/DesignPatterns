package com.github.bosik927.iterator.common.collections.control;

import com.github.bosik927.iterator.common.iterators.boundary.Iterator;
import com.github.bosik927.iterator.common.iterators.entity.Notification;

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