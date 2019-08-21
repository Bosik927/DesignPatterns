package com.github.bosik927.iterator.common.iterators.control;

import com.github.bosik927.iterator.common.iterators.entity.Notification;
import com.github.bosik927.iterator.common.iterators.boundary.Iterator;

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