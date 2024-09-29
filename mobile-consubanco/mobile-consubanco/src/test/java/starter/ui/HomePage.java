package starter.ui;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class HomePage  {
    public static final Target label_app = Target.the("label APP").located(By.xpath("//android.widget.TextView[@text=\"The App\"]\n"));
    public static final Target label_choose = Target.the("label Choose").located(By.xpath("//android.widget.TextView[@text=\"Choose An Awesome View\"]\n"));
    public static final Target label_Login = Target.the("label Login").located(By.xpath("(//android.widget.TextView[@text=\"\uE5CC\"])[2]\n"));
    public static final Target label_ListDemo = Target.the("label ListFog").located(By.xpath("(//android.widget.TextView[@text=\"\uE5CC\"])[6]\n"));
}
