package com.pooja.utils;

import com.pooja.models.User;

public class UserUtils {
    private static User loggedInUser;

    public static User getLoggedInUser() {
        return loggedInUser;
    }

    public static void setLoggedInUser(User loggedInUser) {
        UserUtils.loggedInUser = loggedInUser;
    }
}
