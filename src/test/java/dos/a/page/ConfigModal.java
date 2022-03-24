package dos.a.page;

import dos.a.control.Button;
import dos.a.control.TextBox;
import org.openqa.selenium.By;

public class ConfigModal {
    public Button changePassButton= new Button(By.xpath("//div[@class='_2a8ae321 _6764f5bc _47f2ddb7 _210c1f9e _5695a5d5 _21d759bf']/a[@href='/app/settings/account/password']"));
    public TextBox passwordTxt=new TextBox(By.xpath("//div[@class='_460d581b dd9ffeab _2a8ae321 _6764f5bc _47f2ddb7 _5695a5d5']/input[@id='element-2']"));
    public TextBox newpassTxt=new TextBox(By.xpath("//div[@class='_460d581b dd9ffeab _2a8ae321 _6764f5bc _47f2ddb7 _5695a5d5']/input[@id='element-4']"));
    public TextBox confirmNewpassTxt=new TextBox(By.xpath("//div[@class='_460d581b dd9ffeab _2a8ae321 _6764f5bc _47f2ddb7 _5695a5d5']/input[@id='element-6']"));
    public Button confirmChangeButton= new Button(By.xpath("//button[@class='_623015f3 _7c95e162 _55e2a6a9 _2a8ae321']/span[@class='_1f20c88a']"));

    public Button closeModalButton=new Button(By.xpath("//div[@class='_91e05f0f _2a8ae321 _68ab48ca _25cae61d _99458759']/button[@class='_6sZi5fGPa6QQIZ3TD6CQfQ==']"));
    //*[@id="reactist-modal-box-6"]/section/div/form/header/div[3]/button
}
