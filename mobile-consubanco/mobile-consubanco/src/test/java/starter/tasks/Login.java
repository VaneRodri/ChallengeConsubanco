package starter.tasks;

import starter.ui.LoginPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.SendKeys;

public class Login implements Task {
    private String usuario;
    private String password;

    public Login (String usuario,String password) {
        this.usuario = usuario;
        this.password = password;
    }

    public static Login credenciales(String usuario,String password) {
        return Tasks.instrumented(Login.class,usuario,password);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                SendKeys.of(usuario).into(LoginPage.txt_username),
                SendKeys.of(password).into(LoginPage.txt_password),
                Click.on (LoginPage.Btn_login)
        );
    }
}
