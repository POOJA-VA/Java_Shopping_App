package com.pooja.controller;

import com.pooja.controller.impl.IAppController;
import com.pooja.view.WelcomePage;

public class AppController implements IAppController {

    private final WelcomePage welcomePage;
    private final AuthController authController;

    public AppController() {
        welcomePage = new WelcomePage();
        authController = new AuthController();
    }

    @Override
    public void init() {
        welcomePage.welcome();
        authController.authMenu();
    }

}
