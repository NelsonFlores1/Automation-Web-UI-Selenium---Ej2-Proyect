package testSuit.yopmail;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.openqa.selenium.interactions.Actions;
import page.yopmail.MainPage;
import page.yopmail.MenuSection;
import page.yopmail.SendEmailSection;
import page.yopmail.WriteEmailSection;
import session.Session;
import util.GetPropertiesYopmail;

public class TestBase {

    String user = GetPropertiesYopmail.getInstance().getUser();
    String emailTo = GetPropertiesYopmail.getInstance().getEmailTo();
    String emailSubject = GetPropertiesYopmail.getInstance().getEmailSubject();
    String emailBody = GetPropertiesYopmail.getInstance().getEmailBody();
    MainPage mainPage = new MainPage();
    MenuSection menuSection = new MenuSection();
    SendEmailSection sendEmailSection = new SendEmailSection();
    WriteEmailSection writeEmailSection = new WriteEmailSection();

    @BeforeEach
    public  void openBrowser(){
        Actions action = new Actions(Session.getInstance().getBrowser());
        // todo create property file
        Session.getInstance().getBrowser().get(GetPropertiesYopmail.getInstance().getHost());
    }

    @AfterEach
    public void closeBrowser(){
        Session.getInstance().closeSession();
    }
}
