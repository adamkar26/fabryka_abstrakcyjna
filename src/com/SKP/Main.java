package com.SKP;

import com.SKP.app.Application;
import com.SKP.factories.GUIFactory;
import com.SKP.factories.MacOSFactory;
import com.SKP.factories.WinFactory;

public class Main {

    private static Application configure(){
        Application app;
        GUIFactory factory;

        // nazwa systemu operacyjnego
        String osName = System.getProperty("os.name").toLowerCase();
        if(osName.contains("mac")){
            factory = new MacOSFactory();
            app = new Application(factory);
        }else{
            factory = new WinFactory();
            app = new Application(factory);
        }

        return app;
    }


    public static void main(String[] args) {
	    Application application = configure();
        application.paint();
    }
}
