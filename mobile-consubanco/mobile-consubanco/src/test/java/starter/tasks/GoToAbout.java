package starter.tasks;


import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import starter.ui.CloudsPage;

public class GoToAbout implements Task {

    public static GoToAbout verAlert() {
        return Tasks.instrumented(GoToAbout.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on (CloudsPage.label_AboutFog)
        );
    }
}
