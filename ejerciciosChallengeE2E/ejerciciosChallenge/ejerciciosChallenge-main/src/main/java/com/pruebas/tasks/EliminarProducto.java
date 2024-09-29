package com.pruebas.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;

import static com.pruebas.ui.CarritoCompra.BTN_ELIMINARPRODUCTO;

public class EliminarProducto implements Task {

    public static EliminarProducto carrito(){
        return Tasks.instrumented(EliminarProducto.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(BTN_ELIMINARPRODUCTO)
        );
    }
}
