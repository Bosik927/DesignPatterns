package com.github.bosik927.state.sample.states;

import com.github.bosik927.state.sample.CeilingFanPullChain;

public interface State {
    void pull(CeilingFanPullChain wrapper);
}