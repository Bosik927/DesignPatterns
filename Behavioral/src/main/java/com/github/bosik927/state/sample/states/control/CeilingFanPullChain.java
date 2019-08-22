package com.github.bosik927.state.sample.states.control;

import com.github.bosik927.state.sample.states.boundary.State;

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