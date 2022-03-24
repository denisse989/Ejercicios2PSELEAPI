package dos.a.testClean;


import dos.a.singleton.Session;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;



public class BaseTodoist {
    @BeforeEach
    public void openBrowser(){
        Session.getInstance().getDriver().get("https://todoist.com/es");
    }

    @AfterEach
    public void closeBrowser(){
        Session.getInstance().closeSession();
    }
}

