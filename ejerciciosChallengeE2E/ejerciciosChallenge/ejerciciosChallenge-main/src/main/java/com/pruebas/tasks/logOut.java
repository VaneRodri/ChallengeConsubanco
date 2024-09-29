package com.pruebas.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;

import static com.pruebas.ui.PaginaPrincipal.BUTTON_LOGOUT;
import static net.serenitybdd.screenplay.Tasks.instrumented;

public class logOut implements Task {

    // Método estático para crear una instancia de la tarea
    public static logOut realizar() {
        return instrumented(logOut.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(BUTTON_LOGOUT)
        );
    }
}
