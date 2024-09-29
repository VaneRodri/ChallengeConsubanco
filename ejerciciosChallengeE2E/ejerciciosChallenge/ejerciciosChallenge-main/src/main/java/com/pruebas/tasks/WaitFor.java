package com.pruebas.tasks;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;

public class WaitFor implements Task{
    private final int milliseconds;

    public WaitFor(int milliseconds) {
        this.milliseconds = milliseconds;
    }

    public static WaitFor milliseconds(int milliseconds) {
        return Tasks.instrumented(WaitFor.class, milliseconds);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        try {
            Thread.sleep(milliseconds);
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
    }
}

