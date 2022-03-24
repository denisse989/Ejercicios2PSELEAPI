package dos.c.page;

import dos.c.control.Button;
import org.openqa.selenium.By;

public class MenuSection {
    public Button logout=new Button(By.id("ctl00_HeaderTopControl1_LinkButtonLogout"));
    public Button settings=new Button(By.xpath("//div[@id='ctl00_HeaderTopControl1_PanelHeaderButtons']//a[text()='Settings']"));
}
