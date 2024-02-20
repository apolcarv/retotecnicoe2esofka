package co.com.sofka.project.stepdefinition;

import co.com.sofka.project.hook.OpenWeb;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;

import static co.com.sofka.project.utils.Constant.*;
import static co.com.sofka.project.utils.Time.waiting;

public class Hook {

    @Before
    public void setTheStage() {
        OnStage.setTheStage(new OnlineCast());
    }

    @Given("{string} abre el sitio web")
    public void openTheTestWebsite(String actor) {
        OnStage.theActorCalled(actor).attemptsTo(
                OpenWeb.browserURL(WEB_URL)
        );
        waiting(TIME_SHORT);
    }
}