package co.com.sofka.project.task;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;

import static co.com.sofka.project.ui.YourCartUI.BTN_YOUR_CART;

public class YourCart implements Task {
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Click.on(BTN_YOUR_CART));
    }

    public static YourCart access() {
        return Tasks.instrumented(YourCart.class);
    }
}