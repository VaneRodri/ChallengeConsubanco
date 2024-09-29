package com.pruebas.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import static com.pruebas.ui.PaginaProductos.LABEL_SAMSUNG;

public class elegirProducto implements Task {

        public static elegirProducto telefonos(){
            return Tasks.instrumented(elegirProducto.class);
        }
        @Override
        public <T extends Actor> void performAs(T actor) {
            actor.attemptsTo(
                    Click.on(LABEL_SAMSUNG)
            );
        }
    }

