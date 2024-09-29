package starter.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import starter.ui.LoginPage;

public class BackHome implements Task {

    public static BackHome regresar() {
        return Tasks.instrumented(BackHome.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on (LoginPage.Icono_Flecha)
        );
    }
}