package dos.b.page;

import dos.b.control.Image;
import org.openqa.selenium.By;


public class MainPage {
    public Image loginButton =new Image(By.xpath("//*[@id=\"ctl00_MainContent_PanelNotAuth\"]/div[2]/div[1]/div[2]/a/img"));
}