package com.github.bosik927.state.sample.states.control;

import com.github.bosik927.state.sample.states.boundary.State;

public class Low implements State {

    @Override
    public void pull(CeilingFanPullChain wrapper) {
        wrapper.set_state(new Medium());
        System.out.println("medium speed");
    }
}