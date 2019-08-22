package com.github.bosik927.mediator.common.components.control;

import com.github.bosik927.mediator.common.components.boundary.Component;
import com.github.bosik927.mediator.common.mediator.boundary.Mediator;

import javax.swing.JButton;
import java.awt.event.ActionEvent;

public class SaveButton extends JButton implements Component {

    private Mediator mediator;

    public SaveButton() {
        super("Save");
    }

    @Override
    public void setMediator(Mediator mediator) {
        this.mediator = mediator;
    }

    @Override
    protected void fireActionPerformed(ActionEvent actionEvent) {
        mediator.saveChanges();
    }

    @Override
    public String getName() {
        return "SaveButton";
    }
}