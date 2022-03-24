package dos.c.page;

import dos.c.control.TextBox;
import dos.c.control.Button;
import dos.c.control.Label;
import org.openqa.selenium.By;

public class SettingsModal {
    public Label settingsLabel=new Label(By.xpath("//*[@id=\"settings_Profile\"]/table/tbody/tr[1]/td/div"));
    public TextBox oldPassTxt=new TextBox(By.xpath("//*[@id=\"TextPwOld\"]"));
    public TextBox newPassTxt=new TextBox(By.xpath("//*[@id=\"TextPwNew\"]"));
    public Button okButton=new Button(By.xpath("//div[@class='ui-dialog-buttonpane ui-widget-content ui-helper-clearfix']//span[text()='Ok']"));
}
