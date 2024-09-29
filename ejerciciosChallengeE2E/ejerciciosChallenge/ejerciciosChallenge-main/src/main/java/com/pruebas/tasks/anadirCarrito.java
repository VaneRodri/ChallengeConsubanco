package com.pruebas.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.actions.Click;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

import static com.pruebas.ui.PaginaProductos.BUTTON_ADD_TO_CART;
import static net.serenitybdd.screenplay.Tasks.instrumented;

public class anadirCarrito implements Task {

    public static anadirCarrito producto() {
        return instrumented(anadirCarrito.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(BUTTON_ADD_TO_CART)
        );
        acceptProduct(actor);

    }
    public void acceptProduct (Actor actor) {
        WebDriverWait wait = new WebDriverWait(BrowseTheWeb.as(actor).getDriver(), Duration.ofSeconds(10));
        wait.until(ExpectedConditions.alertIsPresent());
        BrowseTheWeb.as(actor).getDriver().switchTo().alert().accept();
    }
}