package com.github.bosik927.iterator.common.iterators;

import com.github.bosik927.iterator.common.Notification;

public class NotificationIterator implements Iterator {

    private Notification[] notifications;
    private int pos = 0;

    public  NotificationIterator (Notification[] notificationList) {
        this.notifications = notificationList;
    }

    public Object next() {
        Notification notification =  notifications[pos];
        pos += 1;
        return notification;
    }

    public boolean hasNext() {
        return pos < notifications.length &&
                notifications[pos] != null;
    }
}