package com.github.bosik927.state.common.player.boundary;

import com.github.bosik927.state.common.player.control.Player;

public abstract class State {

    protected Player player;

    public State(Player player) {
        this.player = player;
    }

    public abstract String onLock();

    public abstract String onPlay();

    public abstract String onNext();

    public abstract String onPrevious();
}