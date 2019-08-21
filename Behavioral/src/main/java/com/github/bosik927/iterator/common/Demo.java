package com.github.bosik927.iterator.common;

import com.github.bosik927.iterator.common.collections.control.NotificationBar;
import com.github.bosik927.iterator.common.collections.control.NotificationCollection;

public class Demo {

    public static void main(String... args) {
        NotificationCollection nc = new NotificationCollection();
        NotificationBar nb = new NotificationBar(nc);
        nb.printNotifications();
    }
}