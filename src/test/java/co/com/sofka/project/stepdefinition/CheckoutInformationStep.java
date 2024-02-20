package co.com.sofka.project.stepdefinition;

import co.com.sofka.project.question.ValidatePageCheckoutOverview;
import co.com.sofka.project.task.ChooseProducts;
import co.com.sofka.project.task.PurchasindInformationForm;
import co.com.sofka.project.task.YouCartCheckout;
import co.com.sofka.project.task.YourCart;
import io.cucumber.java.Before;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;

import static co.com.sofka.project.utils.Constant.*;
import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.theActorCalled;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

public class CheckoutInformationStep {

    public static final String userDirectoryPath = System.getProperty("user.dir");

    @Before
    public void setTheStage() {
        OnStage.setTheStage(new OnlineCast());
    }


    @When("se autentica de forma exitosa, elige los productos de preferencia y llena el formulario con datos basicos {string}")
    public void beSuccessfullyAuthenticatedChooseYourPreferredProductsAndFillOutTheFormWithBasicData(String data) {
        theActorCalled(ACTOR).attemptsTo(
                ChooseProducts.withParams(TWO),
                YourCart.access(),
                YouCartCheckout.access(),
                PurchasindInformationForm.withParams
                        (userDirectoryPath + PATH_JSON + data)
        );
    }

    @Then("visualizara la descripcion general {string}")
    public void willDisplayTheGeneralDescription(String checkoutText) {
        theActorInTheSpotlight().should(
                seeThat(ValidatePageCheckoutOverview.withParams(checkoutText))
        );
    }
}