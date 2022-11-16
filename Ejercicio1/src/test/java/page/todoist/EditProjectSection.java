package page.todoist;

import control.Button;
import control.TextBox;
import org.openqa.selenium.By;

public class EditProjectSection {
    public TextBox nameUpdatedTxtBox = new TextBox(By.id("edit_project_modal_field_name"));
    public Button saveprojectButton = new Button(By.xpath("//button[text()='Guardar']"));
}
