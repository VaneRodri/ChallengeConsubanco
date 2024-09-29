package com.pruebas.tasks;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

import static net.serenitybdd.screenplay.Tasks.instrumented;
import static com.pruebas.ui.PaginaPrincipal.*;
public class registrarCliente implements Task {
    private final String user;
    private final String password;
    public registrarCliente(String user, String password){
        this.user = user;
        this.password = password;
    }
    public static Performable llenarDatos(String user, String password){
        return instrumented(registrarCliente.class,user,password);
    }
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(BUTTON_REGISTRE),
                Enter.theValue(user).into(TXT_USER),
                Enter.theValue(password).into(TXT_PASS),
                Click.on(BUTTON_REGISTREUSER));
    }
}
