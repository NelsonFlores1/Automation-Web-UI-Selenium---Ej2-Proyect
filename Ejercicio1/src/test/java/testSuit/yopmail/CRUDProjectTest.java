package testSuit.yopmail;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import session.Session;

public class CRUDProjectTest extends TestBase{

    @Test
    public void VerifyCRUDProject() throws InterruptedException {
        // log in
        mainPage.emailTextBox.setText(user);
        mainPage.loginButton.click();
        // verify
        Assertions.assertTrue(menuSection.homebutton.isControlDisplayed(), "ERROR! the log in failed");

        // send email
        sendEmailSection.newMessageButton.click();

        Session.getInstance().chooseFrame("ifmail");
        writeEmailSection.emailToTxtBox.setText(emailTo);
        writeEmailSection.emailSubjectTxtBox.setText(emailSubject);
        writeEmailSection.emailBodyTxtBox.setText(emailBody);
        writeEmailSection.sendEmailButton.click();

        Thread.sleep(1000);
        //verify whether the email was sent
        Session.getInstance().refreshPage();
        Thread.sleep(3000);

        Session.getInstance().chooseFrame("ifinbox");
        Assertions.assertTrue(Session.getInstance().msgSubjectShowed(), "ERROR! the mail was not sent");

        Thread.sleep(3000);
    }
}
