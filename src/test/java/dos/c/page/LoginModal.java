package dos.c.page;

import dos.c.control.Image;
import dos.c.control.TextBox;
import org.openqa.selenium.By;


public class LoginModal {
    public TextBox emailTxt=new TextBox(By.xpath("//*[@id=\"ctl00_MainContent_LoginControl1_TextBoxEmail\"]"));
    public TextBox passTxt=new TextBox(By.xpath("//*[@id=\"ctl00_MainContent_LoginControl1_TextBoxPassword\"]"));

    public Image loginButton =new Image(By.xpath("//*[@id=\"ctl00_MainContent_LoginControl1_ButtonLogin\"]"));
}
