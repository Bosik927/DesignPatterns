package com.github.bosik927.state.sample.states;

import com.github.bosik927.state.sample.CeilingFanPullChain;

public class Medium implements State {

    @Override
    public void pull(CeilingFanPullChain wrapper) {
        wrapper.set_state(new High());
        System.out.println("high speed");
    }
}