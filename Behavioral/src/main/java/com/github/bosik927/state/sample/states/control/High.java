package com.github.bosik927.state.sample.states.control;

import com.github.bosik927.state.sample.states.boundary.State;

class High implements State {

    @Override
    public void pull(CeilingFanPullChain wrapper) {
        wrapper.set_state(new Off());
        System.out.println("turning off");
    }
}