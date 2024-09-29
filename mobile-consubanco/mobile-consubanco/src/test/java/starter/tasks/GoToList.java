package starter.tasks;


import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import starter.ui.HomePage;

public class GoToList implements Task {

    public static GoToList verClouds() {
        return Tasks.instrumented(GoToList.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on (HomePage.label_ListDemo)
        );
    }
}


