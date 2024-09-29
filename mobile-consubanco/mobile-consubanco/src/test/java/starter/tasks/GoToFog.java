package starter.tasks;


import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import starter.ui.CloudsPage;
import java.time.Duration;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;
import net.serenitybdd.screenplay.waits.WaitUntil;

public class GoToFog implements Task {

    public static GoToFog verList() {
        return Tasks.instrumented(GoToFog.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                WaitUntil.the(CloudsPage.label_Fog, isVisible()).forNoMoreThan(Duration.ofSeconds(10)),
                Click.on(CloudsPage.label_Fog)
        );
    }
}
