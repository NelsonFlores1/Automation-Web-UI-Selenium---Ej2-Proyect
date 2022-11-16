package page.todoist;

import control.Button;
import control.TextBox;
import org.openqa.selenium.By;
import util.GetPropertiesTodoist;

public class DeleteTaskSection {
    String tarea = GetPropertiesTodoist.getInstance().getNameTask();
    String update = GetPropertiesTodoist.getInstance().getNametaskUpdated();
    public Button taskUpdatedButton = new Button(By.xpath("//div[text()='"+tarea+update+"']"));
    public Button moreOptionsButton = new Button(By.xpath("//button[@aria-label='Más acciones']"));
    public Button deleteTaskButton = new Button(By.xpath("//div[text()='Eliminar tarea…']"));

}
