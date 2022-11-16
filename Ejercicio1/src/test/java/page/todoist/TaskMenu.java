package page.todoist;

import control.Button;
import org.openqa.selenium.By;

public class TaskMenu {
    public Button selectEditTaskButton = new Button(By.xpath("//div[text()='Editar tarea']"));
    public Button selectDeleteTaskButton = new Button(By.xpath("//span[text()='Eliminar']"));
}
