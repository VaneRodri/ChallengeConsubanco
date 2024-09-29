package com.pruebas.tasks;

import net.serenitybdd.screenplay.Actor;
        import net.serenitybdd.screenplay.Performable;
        import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;

import static net.serenitybdd.screenplay.Tasks.instrumented;
        import static com.pruebas.ui.PaginaPrincipal.*;
public class listarPhones implements Task {

    public static listarPhones visualizar(){
        return Tasks.instrumented(listarPhones.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(SELECT_TYPE_PRODUCT)
        );
    }
}