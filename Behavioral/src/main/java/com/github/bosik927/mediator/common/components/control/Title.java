package com.github.bosik927.mediator.common.components.control;

import com.github.bosik927.mediator.common.components.boundary.Component;
import com.github.bosik927.mediator.common.mediator.boundary.Mediator;

import javax.swing.JTextField;
import java.awt.event.KeyEvent;

import static com.github.bosik927.mediator.common.components.entity.SingleComponent.TITLE;

public class Title extends JTextField implements Component {

    private Mediator mediator;

    @Override
    public void setMediator(Mediator mediator) {
        this.mediator = mediator;
    }

    @Override
    protected void processComponentKeyEvent(KeyEvent keyEvent) {
        mediator.markNote();
    }

    @Override
    public String getName() {
        return TITLE.getName();
    }
}