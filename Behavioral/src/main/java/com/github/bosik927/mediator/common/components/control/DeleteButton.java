package com.github.bosik927.mediator.common.components.control;

import com.github.bosik927.mediator.common.components.boundary.Component;
import com.github.bosik927.mediator.common.mediator.boundary.Mediator;

import javax.swing.JButton;
import java.awt.event.ActionEvent;

import static com.github.bosik927.mediator.common.components.entity.SingleComponent.DELETE_BUTTON;

public class DeleteButton extends JButton implements Component {

    private Mediator mediator;

    public DeleteButton() {
        super("Del");
    }

    @Override
    public void setMediator(Mediator mediator) {
        this.mediator = mediator;
    }

    @Override
    protected void fireActionPerformed(ActionEvent actionEvent) {
        mediator.deleteNote();
    }

    @Override
    public String getName() {
        return DELETE_BUTTON.getName();
    }
}