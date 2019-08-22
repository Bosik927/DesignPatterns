package com.github.bosik927.mediator.common.components.boundary;

import com.github.bosik927.mediator.common.mediator.boundary.Mediator;

public interface Component {

    void setMediator(Mediator mediator);

    String getName();
}