package dos.a.testClean;

import dos.a.page.*;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;


public class ChangePassTest extends BaseTodoist {
MainPage mainPage=new MainPage();
SigninPage signinPage =new SigninPage();
MenuSection menuSection=new MenuSection();
ProfileModal profileModal=new ProfileModal();
ConfigModal configModal=new ConfigModal();
@Test
    public void verifyChangePassTodoist() throws InterruptedException {

    String email="denisse@gmail.com";
    String pass="VeriPru12345";
    String newPass="VeriPru12345";
    //Ingresar
    mainPage.signinButton.click();
    signinPage.emailTxt.setText(email);
    signinPage.passTxt.setText(pass);
    Thread.sleep(2000);
    signinPage.loginButton.click();
    Thread.sleep(2000);
    menuSection.profileButton.click();
    Thread.sleep(2000);
    Assertions.assertTrue(profileModal.logoutButton.isControlDisplayed(),"ERROR no se pudo hacer el login");

    //Cambiar Contraseña

    profileModal.configButton.click();
    Thread.sleep(2000);
    configModal.changePassButton.click();
    configModal.passwordTxt.setText(pass);
    configModal.newpassTxt.setText(newPass);
    configModal.confirmNewpassTxt.setText(newPass);
    configModal.confirmChangeButton.click();
    Thread.sleep(2000);
    Assertions.assertTrue(configModal.changePassButton.isControlDisplayed(),"ERROR:no se actualizo la contraseña");
    configModal.closeModalButton.click();
    Thread.sleep(2000);

    //Ingresar con la nueva contraseña
    menuSection.profileButton.click();
    profileModal.logoutButton.click();
    Thread.sleep(2000);
    Assertions.assertTrue(mainPage.signinButton.isControlDisplayed(),"ERROR:no se hizo el logout");
    mainPage.signinButton.click();
    signinPage.emailTxt.setText(email);
    signinPage.passTxt.setText(newPass);
    Thread.sleep(2000);
    signinPage.loginButton.click();
    Thread.sleep(2000);
    menuSection.profileButton.click();
    Thread.sleep(2000);
    Assertions.assertTrue(profileModal.logoutButton.isControlDisplayed(),"ERROR no se pudo hacer el login");

}
}
