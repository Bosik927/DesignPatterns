package com.github.bosik927.iterator.common.collections.control;

import com.github.bosik927.iterator.common.collections.boundary.Collection;
import com.github.bosik927.iterator.common.iterators.boundary.Iterator;
import com.github.bosik927.iterator.common.iterators.entity.Notification;
import com.github.bosik927.iterator.common.iterators.control.NotificationIterator;

public class NotificationCollection implements Collection {

    private static final int MAX_ITEMS = 6;
    private int numberOfItems = 0;
    private Notification[] notificationList;

    public NotificationCollection() {
        notificationList = new Notification[MAX_ITEMS];

        addItem("Notification 1");
        addItem("Notification 2");
        addItem("Notification 3");
    }

    public void addItem(String str) {
        Notification notification = new Notification(str);
        if (numberOfItems >= MAX_ITEMS){
            System.err.println("Full");
        }
        else {
            notificationList[numberOfItems] = notification;
            numberOfItems = numberOfItems + 1;
        }
    }

    public Iterator createIterator() {
        return new NotificationIterator(notificationList);
    }
}