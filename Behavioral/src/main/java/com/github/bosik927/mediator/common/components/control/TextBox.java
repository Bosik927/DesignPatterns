package com.github.bosik927.mediator.common.components.control;

import com.github.bosik927.mediator.common.components.boundary.Component;
import com.github.bosik927.mediator.common.mediator.boundary.Mediator;

import javax.swing.JTextArea;
import java.awt.event.KeyEvent;

public class TextBox extends JTextArea implements Component {

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
        return "TextBox";
    }
}