package dos.b.page;

import dos.b.control.Button;
import dos.b.control.Label;
import dos.b.control.TextBox;
import org.openqa.selenium.By;

public class PersonalProjectSection {
    public TextBox itemNameTxt=new TextBox(By.xpath("//*[@id=\"NewItemContentInput\"]"));
    public Button addItemButton=new Button(By.xpath("//*[@id=\"NewItemAddButton\"]"));
    public Label nameItem = new Label(By.xpath("//li[last()]//td[@class='ItemContent']"));
    public Label doneItemButton=new Label(By.xpath("//li[last()]//input[@id='ItemCheckBox']"));
    public Label nameItemDone= new Label(By.xpath("//li[last()]//div[@class='ItemContentDiv DoneItem']"));



}
