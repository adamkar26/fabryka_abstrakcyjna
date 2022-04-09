package com.SKP.app;

import com.SKP.buttons.Button;
import com.SKP.checkboxes.Checkbox;
import com.SKP.factories.GUIFactory;

public class Application {
    private Button button;
    private Checkbox checkbox;

    public Application(GUIFactory factory){
        button = factory.createButton();
        checkbox = factory.createCheckbox();
    }

    public void paint(){
        button.paint();
        checkbox.paint();
    }

}
