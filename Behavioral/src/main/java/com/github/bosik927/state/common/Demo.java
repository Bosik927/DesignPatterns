package com.github.bosik927.state.common;

import com.github.bosik927.state.common.player.control.Player;
import com.github.bosik927.state.common.gui.control.UI;

public class Demo {

    public static void main(String... args) {
        new UI(new Player()).init();
    }
}