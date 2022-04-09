package com.SKP.factories;

import com.SKP.buttons.Button;
import com.SKP.checkboxes.Checkbox;

public interface GUIFactory {
    Button createButton();
    Checkbox createCheckbox();
}
