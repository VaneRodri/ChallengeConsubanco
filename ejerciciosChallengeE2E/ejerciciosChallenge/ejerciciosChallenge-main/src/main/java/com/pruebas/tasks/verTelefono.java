package com.pruebas.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;

import static com.pruebas.ui.PaginaProductos.BUTTON_ADD_TO_CART;
import static com.pruebas.ui.PaginaProductos.LABEL_SAMSUNG;
import static net.serenitybdd.screenplay.Tasks.instrumented;

public class verTelefono implements Task {


    public static verTelefono conDetalles() {
        return instrumented(verTelefono.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(LABEL_SAMSUNG));
    }
}
