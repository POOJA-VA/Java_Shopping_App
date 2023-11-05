package com.pooja.view;

import com.pooja.utils.StringUtils;

import static com.pooja.utils.Utils.println;

public class WelcomePage {
    public void welcome() {
        try {
            println(StringUtils.WELCOME_MESSAGE);
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

}
