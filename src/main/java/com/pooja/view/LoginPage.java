package com.pooja.view;

import com.pooja.utils.StringUtils;

import static com.pooja.utils.Utils.println;

public class LoginPage {
    public void printInvalidCredentials() {
        try {
            println("#---------------------#");
            println(StringUtils.INVALID_CREDENTIALS);
            println("#---------------------#");
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
