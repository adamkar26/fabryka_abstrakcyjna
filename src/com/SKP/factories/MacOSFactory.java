package com.SKP.factories;

import com.SKP.buttons.Button;
import com.SKP.buttons.MacOSButton;
import com.SKP.checkboxes.Checkbox;
import com.SKP.checkboxes.MacOSCheckbox;

public class MacOSFactory implements GUIFactory{

    @Override
    public Button createButton() {
        return new MacOSButton();
    }

    @Override
    public Checkbox createCheckbox() {
        return new MacOSCheckbox();
    }
}
