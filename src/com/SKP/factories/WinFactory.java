package com.SKP.factories;

import com.SKP.buttons.Button;
import com.SKP.buttons.WinButton;
import com.SKP.checkboxes.Checkbox;
import com.SKP.checkboxes.WindowsCheckbox;

public class WinFactory implements GUIFactory{
    @Override
    public Button createButton() {
        return new WinButton();
    }

    @Override
    public Checkbox createCheckbox() {
        return new WindowsCheckbox();
    }
}
