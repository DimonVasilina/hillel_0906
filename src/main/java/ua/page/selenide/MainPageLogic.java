package ua.page.selenide;

import com.codeborne.selenide.CollectionCondition;

import static com.codeborne.selenide.Selenide.page;

public class MainPageLogic extends MainPageLocators {

    public MainPageLogic checkCategoryQuantity(int size) {
        categoriesSideBar.shouldHave(CollectionCondition.size(size));
        return this;
    }

    public CategoryPageLogic clickOnCategoryInSideBar(int category) {
        categoriesSideBar.get(category).click();
        return page(CategoryPageLogic.class);
    }

}