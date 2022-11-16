package page.todoist;

import control.Button;
import control.TextBox;
import org.openqa.selenium.By;

public class EditTaskSection {
    public TextBox editTaskNameTxtBox = new TextBox(By.xpath("//div[@data-offset-key]"));
    public Button saveTaskButton = new Button(By.xpath("//span[text()='Guardar']"));

}
