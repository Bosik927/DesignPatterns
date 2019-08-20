package com.github.bosik927.abstractfactory.common.checkbox.control;

import com.github.bosik927.abstractfactory.common.checkbox.boundary.Checkbox;

public class WindowsCheckbox implements Checkbox {

    @Override
    public void paint() {
        System.out.println("You have created WindowsCheckbox.");
    }
}