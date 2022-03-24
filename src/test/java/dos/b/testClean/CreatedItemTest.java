package dos.b.testClean;

import dos.b.page.*;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;


public class CreatedItemTest extends BaseTodoLy{
MainPage mainPage=new MainPage();
LoginModal loginModal =new LoginModal();
MenuSection menuSection=new MenuSection();
ProjectsSections projectsSections=new ProjectsSections();
PersonalProjectSection personalProjectSection=new PersonalProjectSection();
@Test
    public void verifyItemTodoLy() throws InterruptedException {
    //Ingresar
    String item="Item1";
    String email="deni@gmail.com";
    String pass="12345";
    mainPage.loginButton.click();
    loginModal.emailTxt.setText(email);
    loginModal.passTxt.setText(pass);
    Thread.sleep(2000);
    loginModal.loginButton.click();
    Thread.sleep(2000);
    Assertions.assertTrue(menuSection.logout.isControlDisplayed(),"ERROR: no se hizo el login");
    //Crear Item
    projectsSections.personalProjectButton.click();
    Thread.sleep(2000);
    personalProjectSection.itemNameTxt.setText(item);
    personalProjectSection.addItemButton.click();
    Assertions.assertTrue(personalProjectSection.nameItem.isControlDisplayed(),"ERROR: no se creo el item");
    Thread.sleep(2000);
    //seleccionar Item como completado
    personalProjectSection.doneItemButton.click();
    Assertions.assertTrue(personalProjectSection.nameItemDone.isControlDisplayed());
    Thread.sleep(2000);
}
}
