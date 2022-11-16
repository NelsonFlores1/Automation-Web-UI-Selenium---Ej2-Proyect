package page.todoist;

import control.Button;
import org.openqa.selenium.By;

public class MenuProject {
    public Button selectEditProjectButton = new Button(By.xpath("//div[text()='Editar proyecto']"));
    public Button selectDeleteProjectButton = new Button(By.xpath("//div[text()='Eliminar proyecto']"));

}
