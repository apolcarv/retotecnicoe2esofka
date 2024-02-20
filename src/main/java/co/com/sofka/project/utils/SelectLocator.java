package co.com.sofka.project.utils;

import com.github.javafaker.Faker;

import java.util.Locale;
import java.util.Random;

import static co.com.sofka.project.ui.ProductsUI.getLocatorListProducts;
import static co.com.sofka.project.ui.YourCartUI.getLocatorListProductsInYourCart;
import static co.com.sofka.project.utils.Constant.ONE;
import static co.com.sofka.project.utils.WebActions.click;

public class SelectLocator {

    private SelectLocator() {
    }

    private static Faker faker = Faker.instance(new Locale("es", "CO"), new Random());

    private static int getProductsRandom() {
        return faker.number().numberBetween(ONE, getLocatorListProducts().size());
    }

    public static void selectRandomProducts() {
        click(getLocatorListProducts().get(getProductsRandom()));
    }

    public static int getAmountYourCart() {
        return getLocatorListProductsInYourCart().size();
    }
}