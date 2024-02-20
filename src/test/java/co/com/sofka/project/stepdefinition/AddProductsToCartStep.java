package co.com.sofka.project.stepdefinition;

import co.com.sofka.project.question.ValidateProductAmountToCart;
import co.com.sofka.project.task.ChooseProducts;
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

public class AddProductsToCartStep {

    @Before
    public void setTheStage() {
        OnStage.setTheStage(new OnlineCast());
    }


    @When("se autentica de forma exitosa y agrega dos productos")
    public void successfullyAuthenticatesAndAddsTwoProducts() {
        theActorCalled(ACTOR).attemptsTo(
                ChooseProducts.withParams(TWO)
        );
    }

    @Then("visualizara que se agregaron al carrito de compras {int} productos")
    public void visualizaraQueSeAgregaronAlCarritoDeComprasProductos(int productsQuantity) {
        theActorInTheSpotlight().should(
                seeThat(
                        ValidateProductAmountToCart.success(
                                productsQuantity))
        );
    }
}