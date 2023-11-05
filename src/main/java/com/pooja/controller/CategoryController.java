package com.pooja.controller;

import com.pooja.controller.impl.ICategoryController;
import com.pooja.models.Category;
import com.pooja.utils.AppException;
import com.pooja.utils.StringUtils;
import com.pooja.view.CategoryPage;

import java.util.ArrayList;

import static com.pooja.utils.AppInput.enterInt;
import static com.pooja.utils.LoadUtils.getCategories;
import static com.pooja.utils.Utils.println;

public class CategoryController implements ICategoryController {

    private final CategoryPage categoryPage;
    private final ProductController productController;
    private final HomeController homeController;

    public CategoryController(HomeController homeController) {
        categoryPage = new CategoryPage();
        productController = new ProductController(homeController);
        this.homeController = homeController;
    }

    @Override
    public void printMenu() {
        ArrayList<Category> categories = getCategories();
        categoryPage.printMenu(categories);

        try {
            int choice = enterInt(StringUtils.ENTER_CHOICE);
            if (choice == 99) {
                homeController.printMenu();
            } else {
                int validCategoryId = 0;
                for (Category category : categories) {
                    if (category.getId() == choice) {
                        validCategoryId = category.getId();
                        break;
                    }
                }

                if (validCategoryId != 0) {
                    productController.showProducts(validCategoryId);
                } else {
                    invalidChoice(new AppException(StringUtils.INVALID_CHOICE));
                }
            }
        } catch (AppException appException) {
            invalidChoice(appException);
        }
    }

    private void invalidChoice(AppException appException) {
        println(appException.getMessage());
        printMenu();
    }
}
