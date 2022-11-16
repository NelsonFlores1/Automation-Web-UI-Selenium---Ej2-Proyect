package page.todoist;

import control.Button;
import control.Label;
import control.TextBox;
import org.openqa.selenium.By;

public class CreateProjectSection {
    public Button addNewProjectButton = new Button(By.xpath("//button[@aria-label='Añadir proyecto']"));

    public TextBox nameProjectTxtBox = new TextBox(By.id("edit_project_modal_field_name"));
    public Button addProjectButton = new Button(By.xpath("//button[text()='Añadir']"));
    public Button homeButton = new Button(By.xpath("//button[@data-gtm-id='burger-home-button']"));

    public boolean isProjectDisplayedInList(String name) {
        Label projectCreated = new Label(By.xpath("//a/span[text()='"+name+"']"));
        return projectCreated.isControlDisplayed();
    }

    public boolean isProjectUpdatedDisplayedInList(String update) {
        Label projectupdated = new Label(By.xpath("//a/span[text()='"+update+"']"));
        return projectupdated.isControlDisplayed();
    }
}
