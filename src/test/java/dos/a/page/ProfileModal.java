package dos.a.page;

import dos.a.control.Button;
import org.openqa.selenium.By;

public class ProfileModal {
    public Button logoutButton= new Button(By.xpath("/html/body/div[1]/div/div[1]/div/div[2]/div/div/button[2]"));
    public Button configButton= new Button(By.xpath("//*[@id=\"user_menu_settings_menuitem\"]/div/div[2]/span"));
}
