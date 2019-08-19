package com.github.bosik927.state.sample.states;

import com.github.bosik927.state.sample.CeilingFanPullChain;

class High implements State {

    public void pull(CeilingFanPullChain wrapper) {
        wrapper.set_state(new Off());
        System.out.println("turning off");
    }
}