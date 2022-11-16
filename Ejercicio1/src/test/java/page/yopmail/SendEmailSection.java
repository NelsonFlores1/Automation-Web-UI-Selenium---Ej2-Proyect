package page.yopmail;

import control.Button;
import org.openqa.selenium.By;

public class SendEmailSection {
    public Button newMessageButton = new Button(By.xpath("//button[@id='newmail']/i[@class='material-icons-outlined']"));
    //public Button refreshButton = new Button(By.xpath("")); // does not work

    public SendEmailSection() {}

    public void clickOnEmail(String messageSubject) {
        Button emailSentButton = new Button(By.xpath("//div[text()='"+messageSubject+"']"));
        emailSentButton.click();
    }
}

