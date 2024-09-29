package com.pruebas.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.time.Duration;

import static com.pruebas.ui.PaginaProductos.BUTTON_ADD_TO_CART;
import static com.pruebas.ui.PaginaProductos.LABEL_DESCRIPCION;
import static net.serenitybdd.screenplay.Tasks.instrumented;

public class agregarProducto implements Task {

    public static agregarProducto productos() {
        return instrumented(agregarProducto.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(LABEL_DESCRIPCION)
        );
        acceptProduct(actor);
    }

    public void acceptProduct(Actor actor) {
        WebDriverWait wait = new WebDriverWait(BrowseTheWeb.as(actor).getDriver(), Duration.ofSeconds(10));
        wait.until(ExpectedConditions.alertIsPresent());
        BrowseTheWeb.as(actor).getDriver().switchTo().alert().accept();
    }
}
