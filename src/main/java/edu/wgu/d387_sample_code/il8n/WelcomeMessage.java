package edu.wgu.d387_sample_code.il8n;

import java.util.Locale;
import java.util.ResourceBundle;

public class WelcomeMessage implements Runnable {

    private Locale locale;
    private String message;

    public WelcomeMessage(Locale locale) {
        this.locale = locale;
    }

    public String getWelcomeMessage () {

            ResourceBundle bundle = ResourceBundle.getBundle("translation", locale);
            return bundle.getString("welcome");

    }

    @Override
    public void run() {
        System.out.println(getWelcomeMessage());
    }

}
