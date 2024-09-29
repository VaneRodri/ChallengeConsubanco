package com.pruebas.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.JavaScriptClick;
import net.serenitybdd.screenplay.waits.WaitUntil;
import net.serenitybdd.screenplay.matchers.WebElementStateMatchers;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isClickable;


import static com.pruebas.ui.UserInterfaceCarrito.BUTTON_COMPRAS;

public class visualizarCarrito implements Task {

    public static visualizarCarrito producto(){
        return Tasks.instrumented(visualizarCarrito.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                WaitUntil.the(BUTTON_COMPRAS, isVisible()).forNoMoreThan(5).seconds(),
                JavaScriptClick.on(BUTTON_COMPRAS));
    }
}
