package com.github.bosik927.state.sample;

import com.github.bosik927.state.sample.states.Off;
import com.github.bosik927.state.sample.states.State;

public class CeilingFanPullChain {

    private State currentState;

    public CeilingFanPullChain() {
        currentState = new Off();
    }

    public void set_state(State s) {
        currentState = s;
    }

    public void pull() {
        currentState.pull(this);
    }
}