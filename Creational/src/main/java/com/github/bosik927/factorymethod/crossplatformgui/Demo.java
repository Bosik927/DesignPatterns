package com.github.bosik927.factorymethod.crossplatformgui;

import com.github.bosik927.factorymethod.crossplatformgui.dialog.boundary.Dialog;
import com.github.bosik927.factorymethod.crossplatformgui.dialog.control.HtmlDialog;
import com.github.bosik927.factorymethod.crossplatformgui.dialog.control.WindowsDialog;

public class Demo {

    private static Dialog dialog;

    public static void main(String[] args) {
        configure();
        runBusinessLogic();
    }

    static void configure() {
        /*CHANGE "Windows 10" to see the difference */
        if (System.getProperty("os.name").equals("Windows 10")) {
            dialog = new WindowsDialog();
        } else {
            dialog = new HtmlDialog();
        }
    }

    static void runBusinessLogic() {
        dialog.renderWindow();
    }
}