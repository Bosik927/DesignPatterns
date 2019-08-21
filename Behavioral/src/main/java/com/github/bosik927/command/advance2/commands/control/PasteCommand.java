package com.github.bosik927.command.advance2.commands.control;

import com.github.bosik927.command.advance2.editor.control.Editor;
import com.github.bosik927.command.advance2.commands.boundary.Command;

public class PasteCommand extends Command {

    public PasteCommand(Editor editor) {
        super(editor);
    }

    @Override
    public boolean execute() {
        if (editor.clipboard == null || editor.clipboard.isEmpty()) {
            return false;
        }

        backup();
        editor.textField.insert(editor.clipboard, editor.textField.getCaretPosition());
        return true;
    }
}