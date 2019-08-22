package com.github.bosik927.mediator.common;

import com.github.bosik927.mediator.common.components.control.*;
import com.github.bosik927.mediator.common.mediator.control.Editor;
import com.github.bosik927.mediator.common.mediator.boundary.Mediator;

import javax.swing.*;

public class MediatorDemo {
    public static void main(String[] args) {
        Mediator mediator = new Editor();

        mediator.registerComponent(new Title());
        mediator.registerComponent(new TextBox());
        mediator.registerComponent(new AddButton());
        mediator.registerComponent(new DeleteButton());
        mediator.registerComponent(new SaveButton());
        mediator.registerComponent(new List(new DefaultListModel()));
        mediator.registerComponent(new Filter());

        mediator.createGUI();
    }
}