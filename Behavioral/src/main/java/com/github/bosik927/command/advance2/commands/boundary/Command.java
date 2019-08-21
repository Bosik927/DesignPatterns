package com.github.bosik927.command.advance2.commands.boundary;

import com.github.bosik927.command.advance2.editor.control.Editor;

public abstract class Command {

    public Editor editor;
    private String backup;

    public Command(Editor editor) {
        this.editor = editor;
    }

    public void backup() {
        backup = editor.textField.getText();
    }

    public void undo() {
        editor.textField.setText(backup);
    }

    public abstract boolean execute();
}