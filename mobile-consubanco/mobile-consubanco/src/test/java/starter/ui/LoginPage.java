package starter.ui;

import io.appium.java_client.AppiumBy;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class LoginPage {
    public static final Target txt_username = Target.the("username").located(AppiumBy.accessibilityId("username"));
    public static final Target txt_password = Target.the("password").located(AppiumBy.accessibilityId("password"));
    public static final Target Btn_login = Target.the("btn_login").located(By.xpath("(//android.widget.TextView[@text=\"Login\"])[2]\n"));
    public static final Target label_login = Target.the("label_login").located(By.xpath("//android.widget.TextView[@text=\"Secret Area\"]\n"));
    public static final Target Btn_logout = Target.the("btn_logout").located(By.xpath("//android.widget.TextView[@text=\"Logout\"]\n"));
    public static final Target Icono_Flecha = Target.the("icono_flecha").located(By.xpath("//android.widget.ImageButton\n"));
}