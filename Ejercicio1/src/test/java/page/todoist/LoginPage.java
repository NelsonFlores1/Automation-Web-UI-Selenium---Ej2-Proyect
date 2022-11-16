package page.todoist;

import control.Button;
import control.TextBox;
import org.openqa.selenium.By;

public class LoginPage {

    public TextBox emailtTxtBox = new TextBox(By.id("element-0"));
    public TextBox passwordtTxtBox = new TextBox(By.id("element-3"));
    public Button logintButton = new Button(By.xpath("//button[@type='submit']"));

}
