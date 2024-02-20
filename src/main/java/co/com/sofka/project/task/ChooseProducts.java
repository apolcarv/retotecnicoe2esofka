package co.com.sofka.project.task;

import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Scroll;
import net.thucydides.core.annotations.Step;

import static co.com.sofka.project.ui.ProductsUI.BTN_SHOPPING_CART;
import static co.com.sofka.project.utils.SelectLocator.selectRandomProducts;

@AllArgsConstructor
@Slf4j
public class ChooseProducts implements Task {

    private int numberProduct;

    @Step("{0} elige #numberProduct productos")
    @Override
    public <T extends Actor> void performAs(T actor) {
        for (int i = 0; i < numberProduct; i++){
            selectRandomProducts();
        }
        actor.attemptsTo(Scroll.to(BTN_SHOPPING_CART));
    }
    public static ChooseProducts withParams(int numberProduct){
        return Tasks.instrumented(ChooseProducts.class,numberProduct);
    }
}