package com.github.bosik927.command.advance2.commands.control;

import com.github.bosik927.command.advance2.editor.control.Editor;
import com.github.bosik927.command.advance2.commands.boundary.Command;

public class CopyCommand extends Command {

    public CopyCommand(Editor editor) {
        super(editor);
    }

    @Override
    public boolean execute() {
        editor.clipboard = editor.textField.getSelectedText();
        return false;
    }
}