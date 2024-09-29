package starter.stepdefinitions;

import io.cucumber.java.Before;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import net.thucydides.core.annotations.Managed;
import org.openqa.selenium.WebDriver;
import starter.tasks.*;
import starter.ui.CloudsPage;
import starter.ui.HomePage;
import starter.questions.QuesGetText;
import static org.hamcrest.CoreMatchers.containsString;
import static net.serenitybdd.screenplay.GivenWhenThen.*;

import starter.ui.LoginPage;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;
import static net.serenitybdd.screenplay.actors.OnStage.theActorCalled;

public class ConsubancoStepDefinitions {


    @Managed(driver = "Appium")
    public WebDriver hisMobileDevice;

    @Before
    public void set_the_stage() {OnStage.setTheStage(new OnlineCast());}

    @Given("que el usuario abre el apk")
    public void queElUsuarioAbreElApk() {
        theActorCalled("usuario").attemptsTo(
            NavigateTo.login()
        );
    }

    @When("ingresamos usuario y contrasena")
    public void ingresamosUsuarioYContrasena() {
        theActorInTheSpotlight().attemptsTo(
                Login.credenciales("alice","mypassword")
        );
    }

    @Then("sistema debe de permitir ingresar")
    public void sistemaDebeDePermitirIngresar() {
        theActorInTheSpotlight().should(
                seeThat("Usuario Logueado",QuesGetText.getText(LoginPage.label_login), containsString("Secret Area"))
        );
    }

    @And("damos clic en logout")
    public void damosClicEnLogout() {
        theActorInTheSpotlight().attemptsTo(
                Logout.sistema()
        );
    }

    @When("estamos en la pantalla de login damos clic en la flecha superior")
    public void estamosEnLaPantallaDeLoginDamosClicEnLaFlechaSuperior() {
        theActorInTheSpotlight().attemptsTo(
                BackHome.regresar(),
                BackHome.regresar(),
                BackHome.regresar()
        );
    }

    @Then("el sistema debe presentar la pagina de home")
    public void elSistemaDebePresentarLaPaginaDeHome() {
        theActorInTheSpotlight().should(
                seeThat("Usuario en Home",QuesGetText.getText(HomePage.label_app), containsString("The App")),
                seeThat("Usuario en Home",QuesGetText.getText(HomePage.label_choose), containsString("Choose An Awesome View"))

        );
    }

    @Given("que el usuario da clic en List Demo")
    public void queElUsuarioDaClicEnListDemo() {
        theActorCalled("usuario").attemptsTo(
                GoToList.verClouds()
        );
    }

    @And("despues da clic en Fog")
    public void despuesDaClicEnFog() {
        theActorInTheSpotlight().attemptsTo(
                GoToFog.verList()
        );
    }

    @When("despues da clic en Learn More About Fog")
    public void despuesDaClicEnLearnMoreAboutFog() {
        theActorInTheSpotlight().attemptsTo(
                GoToAbout.verAlert()
        );
    }

    @Then("el sistema muestra un mensaje con la palabra Fog")
    public void elSistemaMuestraUnMensajeConLaPalabraFog() {
        theActorInTheSpotlight().should(
                seeThat("Visualizar Fog",QuesGetText.getText(CloudsPage.label_VisibleFog), containsString("Fog"))
        );
    }
}
