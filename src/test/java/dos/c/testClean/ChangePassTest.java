package dos.c.testClean;

import dos.c.page.LoginModal;
import dos.c.page.MainPage;
import dos.c.page.MenuSection;
import dos.c.page.SettingsModal;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;


public class ChangePassTest extends BaseTodoLy{
MainPage mainPage=new MainPage();
LoginModal loginModal =new LoginModal();
MenuSection menuSection=new MenuSection();
SettingsModal settingsModal=new SettingsModal();
@Test
    public void verifyChangePassTodoLy() throws InterruptedException {
    //Ingresar
    String email="denissePyV@gmail.com";
    String pass="12345";
    String newPass="123456";
    mainPage.loginButton.click();
    loginModal.emailTxt.setText(email);
    loginModal.passTxt.setText(pass);
    Thread.sleep(2000);
    loginModal.loginButton.click();
    Thread.sleep(2000);
    Assertions.assertTrue(menuSection.logout.isControlDisplayed(),"ERROR: no se hizo el login");

    //Cambiar Password
    menuSection.settings.click();
    Thread.sleep(2000);
    Assertions.assertTrue(settingsModal.settingsLabel.isControlDisplayed(),"ERROR: no se abrio settings");
    settingsModal.oldPassTxt.setText(pass);
    settingsModal.newPassTxt.setText(newPass);
    settingsModal.okButton.click();
    Assertions.assertTrue(menuSection.logout.isControlDisplayed(),"ERROR: no se cambio la contraseña");
    //Logout
    menuSection.logout.click();
    Thread.sleep(2000);
    Assertions.assertTrue(mainPage.loginButton.isControlDisplayed(),"ERROR:no se hizo el logout");
    //Ingresar con nuevo Password
    mainPage.loginButton.click();
    loginModal.emailTxt.setText(email);
    loginModal.passTxt.setText(newPass);
    Thread.sleep(2000);
    loginModal.loginButton.click();
    Thread.sleep(2000);
    Assertions.assertTrue(menuSection.logout.isControlDisplayed(),"ERROR: no se hizo el login con nuevo pass");
}
}
