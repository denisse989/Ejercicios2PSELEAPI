package dos.a.page;

import dos.a.control.Button;
import dos.a.control.TextBox;
import org.openqa.selenium.By;


public class SigninPage {
    public TextBox emailTxt=new TextBox(By.xpath("//*[@id=\"email\"]"));
    public TextBox passTxt=new TextBox(By.xpath("//*[@id=\"password\"]"));

    public Button loginButton =new Button(By.xpath("//*[@id=\"login_form\"]/button"));
}
