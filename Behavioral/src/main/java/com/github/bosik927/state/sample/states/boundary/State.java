package com.github.bosik927.state.sample.states.boundary;

import com.github.bosik927.state.sample.states.control.CeilingFanPullChain;

public interface State {

    void pull(CeilingFanPullChain wrapper);
}