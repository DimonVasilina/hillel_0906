package ua.page.selenide;

import com.codeborne.selenide.CollectionCondition;

public class SearchPageLogic extends SearchPageLocators {

    public SearchPageLogic checkingQuantityProductOnPage(int size) {
        tittlesOfProducts.shouldHave(CollectionCondition.size(size));
        return this;
    }

}