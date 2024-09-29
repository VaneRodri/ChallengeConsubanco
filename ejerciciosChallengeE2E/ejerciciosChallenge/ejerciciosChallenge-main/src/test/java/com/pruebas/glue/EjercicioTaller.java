package com.pruebas.glue;

import com.pruebas.tasks.*;
import com.pruebas.ui.CarritoCompra;
import com.pruebas.ui.PaginaPrincipal;
import com.pruebas.ui.PaginaProductos;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.actions.Open;
import static net.serenitybdd.screenplay.GivenWhenThen.*;
import  static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;
import com.pruebas.questions.QuesGetText;
import net.serenitybdd.screenplay.waits.WaitUntil;
import net.serenitybdd.screenplay.matchers.WebElementStateMatchers;
import java.util.concurrent.TimeUnit;


import java.util.concurrent.TimeUnit;

import  static org.hamcrest.CoreMatchers.containsString;
import static com.pruebas.ui.PaginaPrincipal.*;

public class EjercicioTaller {
    @Given("que el {actor} ingresa a la url demoblaze")
    public void queElUsuarioIngresaALaUrlDemoblaze(Actor actor) {
        givenThat(actor).attemptsTo(Open.browserOn().the(PaginaPrincipal.class));
    }

    @When("ingresa a la opcion signup e ingresa los datos {string} y {string}")
    public void ingresaALaOpcionSignupEIngresaLosDatosY(String user, String password) {
        when(theActorInTheSpotlight()).wasAbleTo(
                registrarCliente.llenarDatos(user, password));
    }

    @Then("el sistema le debe dejar registrase correctamente")
    public void elSistemaLeDebeDejarRegistraseCorrectamente() {
    }

    @Given("que el {actor} con una cuenta creada ingresa a demoblaze")
    public void queElUsuarioConUnaCuentaCreadaIngresaADemoblaze(Actor actor) {
        givenThat(actor).attemptsTo(Open.browserOn().the(PaginaPrincipal.class));
    }

    @When("ingresa a la opcion login e ingresa {string} y {string}")
    public void ingresaALaOpcionLoginEIngresaY(String user, String password) {
        when(theActorInTheSpotlight()).wasAbleTo(
                logguerase.llenarDatos(user, password)
        );
    }


    @Then("se puede visualizar el {string} en la esquina derecha")
    public void sePuedeVisualizarElEnLaEsquinaDerecha(String user) {
        theActorInTheSpotlight().attemptsTo(
                WaitUntil.the(PaginaPrincipal.LABEL_USER, WebElementStateMatchers.isVisible())
                        .forNoMoreThan(10).seconds()
        );

        theActorInTheSpotlight().should(
                seeThat("Usuario Logueado", QuesGetText.getText(PaginaPrincipal.LABEL_USER), containsString(user))
        );
    }

    @Given("que el {actor} ingresa a la pagina de demoblaze para  comprar")
    public void queElUsuarioIngresaALaPaginaDeDemoblazeParaComprar(Actor actor) {
        givenThat(actor).attemptsTo(Open.browserOn().the(PaginaPrincipal.class));
    }

    @When("da clic en categoria phone")
    public void daClicEnCategoriaPhone() {
        when(theActorInTheSpotlight()).wasAbleTo(
                listarPhones.visualizar()
        );
    }

    @Then("el sistema le debe presentar la lista de phone")
    public void elSistemaLeDebePresentarLaListaDePhone() {
        theActorInTheSpotlight().attemptsTo(
                WaitUntil.the(PaginaProductos.LABEL_SAMSUNG, WebElementStateMatchers.isVisible())
                        .forNoMoreThan(5).seconds()
        );

        theActorInTheSpotlight().should(
                seeThat("Visualizar Samsung", QuesGetText.getText(PaginaProductos.LABEL_SAMSUNG), containsString("Samsung galaxy s6"))
        );
    }

    @Given("que el {actor} ingresa a la lista de telefonos")
    public void queElUsuarioIngresaALaListaDeTelefonos(Actor actor) {
        givenThat(actor).attemptsTo(Open.browserOn().the(PaginaPrincipal.class));

    }


    @Then("el sistema le debe presentar el label Product description")
    public void elSistemaLeDebePresentarElLabelProductDescription() {
        then(theActorInTheSpotlight()).should(
                seeThat("Visualizar Descripcion telefonos",QuesGetText.getText(PaginaProductos.LABEL_DESCRIPCION), containsString("Product description"))
        );
    }

    @And("da clic en add to cart")
    public void daClicEnAddToCart() {
        andThat(theActorInTheSpotlight()).attemptsTo(
                (Performable) anadirCarrito.producto()
        );
    }

    @Then("el sistema le debe presentar el modal con el mensaje Product added")
    public void elSistemaLeDebePresentarElModalConElMensajeProductAdded() {
    }

    @And("da clic en ver carrito")
    public void daClicEnVerCarrito() {
        visualizarCarrito.producto();
    }

    @Then("el sistema le debe presentar el producto en el carrito de compras")
    public void elSistemaLeDebePresentarElProductoEnElCarritoDeCompras() {
        then(theActorInTheSpotlight()).should(
                seeThat("Visualizar Descripcion telefonos",QuesGetText.getText(CarritoCompra.LABEL_PRODUCTO),containsString("Samsung galaxy s6"))
        );
    }

    @And("da clic en borrar producto")
    public void daClicEnBorrarProducto() {
        and(theActorInTheSpotlight()).attemptsTo(
            EliminarProducto.carrito());

    }

    @Then("el sistema debe permitir borrar el producto")
    public void elSistemaDebePermitirBorrarElProducto() {
    }

    @Given("que el {actor} se encuentra en el carrito de compras")
    public void queElUsuarioSeEncuentraEnElCarritoDeCompras(Actor actor) {
    }

    @When("da clic en LogOut")
    public void daClicEnLogOut() {
    }

    @Then("el sistema debe cerrar sesion")
    public void elSistemaDebeCerrarSesion() {
    }

    @And("redirecciona a la página principal")
    public void redireccionaALaPáginaPrincipal() {
    }


    @And("da clic en Samsug galaxy Sseis")
    public void daClicEnSamsugGalaxySseis() {
        when(theActorInTheSpotlight()).wasAbleTo(
                listarPhones.visualizar(),
                verTelefono.conDetalles());
    }
    }