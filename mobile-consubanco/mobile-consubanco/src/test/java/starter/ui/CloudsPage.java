package starter.ui;

import io.appium.java_client.AppiumBy;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class CloudsPage {
    public static final Target label_Fog = Target.the("label Fog").located(By.xpath("(//android.widget.TextView[@text=\"\uE5CC\"])[10]\n"));
    public static final Target label_AboutFog = Target.the("label AboutFog").located(By.xpath("//android.widget.Button[@resource-id=\"android:id/button3\"]\n"));
    public static final Target label_VisibleFog = Target.the("label AboutFog").located(By.xpath("//android.widget.TextView[@resource-id=\"android:id/alertTitle\"]\n"));
}