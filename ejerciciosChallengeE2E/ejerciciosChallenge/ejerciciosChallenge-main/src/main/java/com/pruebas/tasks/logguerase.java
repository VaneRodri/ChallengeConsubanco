package com.pruebas.tasks;

import net.serenitybdd.screenplay.Actor;
        import net.serenitybdd.screenplay.Performable;
        import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

import static net.serenitybdd.screenplay.Tasks.instrumented;
        import static com.pruebas.ui.PaginaPrincipal.*;
public class logguerase implements Task {
    private final String user;
    private final String password;
    public logguerase(String user, String password){
        this.user = user;
        this.password = password;
    }
    public static Performable llenarDatos(String user, String password){
        return instrumented(logguerase.class,user,password);
    }
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(BUTTON_LOGIN),
                Enter.theValue(user).into(TXT_LOGIN_USUARIO),
                Enter.theValue(password).into(TXT_LOGIN_PASS),
                Click.on(BUTTON_INGRESAR));
    }
}
