package com.pooja;

import com.pooja.controller.AppController;
import com.pooja.utils.LoadUtils;

public class App {
    public static void main(String[] args) {
        AppController appController = new AppController();
        LoadUtils.load();
        appController.init();
    }
}