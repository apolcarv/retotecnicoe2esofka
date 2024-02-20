package co.com.sofka.project.stepdefinition;

import co.com.sofka.project.question.ValidateTheProductToCart;
import co.com.sofka.project.task.ChooseProducts;
import co.com.sofka.project.task.YourCart;
import io.cucumber.java.Before;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;

import static co.com.sofka.project.utils.Constant.ACTOR;
import static co.com.sofka.project.utils.Constant.TWO;
import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.theActorCalled;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

public class ViewCartStep {


    @Before
    public void setTheStage() {
        OnStage.setTheStage(new OnlineCast());
    }

    @When("se autentica de forma exitosa y va hasta el carrito de compras")
    public void isSuccessfullyAuthenticatedAndGoesToTheShoppingCart() {
        theActorCalled(ACTOR).attemptsTo(
                ChooseProducts.withParams(TWO),
                YourCart.access());
    }

    @Then("visualizara los productos que anteriormente agrego")
    public void willDisplayTheProductsYouPreviouslyAdded() {
        theActorInTheSpotlight().should(
                seeThat(ValidateTheProductToCart.success(TWO))
        );
    }
}