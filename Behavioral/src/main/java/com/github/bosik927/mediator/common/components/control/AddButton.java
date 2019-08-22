package com.github.bosik927.mediator.common.components.control;

import com.github.bosik927.mediator.common.components.entity.Note;
import com.github.bosik927.mediator.common.components.boundary.Component;
import com.github.bosik927.mediator.common.mediator.boundary.Mediator;

import javax.swing.JButton;
import java.awt.event.ActionEvent;

public class AddButton extends JButton implements Component {

    private Mediator mediator;

    public AddButton() {
        super("Add");
    }

    @Override
    public void setMediator(Mediator mediator) {
        this.mediator = mediator;
    }

    @Override
    protected void fireActionPerformed(ActionEvent actionEvent) {
        mediator.addNewNote(new Note());
    }

    @Override
    public String getName() {
        return "AddButton";
    }
}