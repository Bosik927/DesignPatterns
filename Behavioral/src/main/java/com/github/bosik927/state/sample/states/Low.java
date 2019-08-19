package com.github.bosik927.state.sample.states;

import com.github.bosik927.state.sample.CeilingFanPullChain;

public class Low implements State {

    @Override
    public void pull(CeilingFanPullChain wrapper) {
        wrapper.set_state(new Medium());
        System.out.println("medium speed");
    }
}