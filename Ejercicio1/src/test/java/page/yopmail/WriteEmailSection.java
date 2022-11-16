package page.yopmail;

import control.Button;
import control.TextBox;
import org.openqa.selenium.By;

public class WriteEmailSection {
    public TextBox emailToTxtBox = new TextBox(By.id("msgto"));
    public TextBox emailSubjectTxtBox = new TextBox(By.id("msgsubject"));
    public TextBox emailBodyTxtBox = new TextBox(By.id("msgbody"));
    public Button sendEmailButton = new Button(By.id("msgsend"));
}
