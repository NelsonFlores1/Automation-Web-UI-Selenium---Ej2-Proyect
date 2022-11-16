package page.todoist;

import control.Button;
import control.Label;
import control.TextBox;
import org.openqa.selenium.By;

public class CreateTaskSection {
    public Button createTaskButton = new Button(By.className("plus_add_button"));
    public TextBox taskNameTxtBox = new TextBox(By.className("public-DraftStyleDefault-block"));
    public TextBox descriptionNameTxtBox = new TextBox(By.className("task_editor__description_field"));
    public Button addTaskButton = new Button(By.xpath("//span[text()='Añadir tarea']"));

    public boolean isTaskDisplayedInList(String tarea) {
        Label projectCreated = new Label(By.xpath("//div[text()='"+tarea+"']"));
        return projectCreated.isControlDisplayed();
    }

    public boolean isTaskUpdatedDisplayedInList(String tarea, String update) {
        String conc = tarea+update;
        Label taskCreated = new Label(By.xpath("//div[text()='"+conc+"']"));
        return taskCreated.isControlDisplayed();
    }


}
