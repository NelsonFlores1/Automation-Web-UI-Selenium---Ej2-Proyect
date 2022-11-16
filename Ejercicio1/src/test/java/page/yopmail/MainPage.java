package page.yopmail;

import control.Button;
import control.Label;
import control.TextBox;
import org.openqa.selenium.By;

public class MainPage {
    public TextBox emailTextBox = new TextBox(By.id("login"));
    public Button loginButton = new Button(By.className("f36"));
}
