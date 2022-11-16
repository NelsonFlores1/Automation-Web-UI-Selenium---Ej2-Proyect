package page.todoist;

import control.Button;
import org.openqa.selenium.By;

public class ConfirmTaskAlert {
    public Button deleteTaskButton = new Button(By.xpath("//span[text()='Eliminar']"));
}
