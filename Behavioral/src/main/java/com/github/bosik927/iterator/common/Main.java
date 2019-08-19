package com.github.bosik927.iterator.common;

import com.github.bosik927.iterator.common.collections.NotificationBar;
import com.github.bosik927.iterator.common.collections.NotificationCollection;

public class Main {

    public static void main(String... args) {
        NotificationCollection nc = new NotificationCollection();
        NotificationBar nb = new NotificationBar(nc);
        nb.printNotifications();
    }
}