package testSuit.todoist;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;

import org.openqa.selenium.interactions.Actions;
import page.todoist.*;
import session.Session;
import util.GetPropertiesTodoist;

public class TestBaseTodoist {
    String user = GetPropertiesTodoist.getInstance().getUser();
    String pwd = GetPropertiesTodoist.getInstance().getPassword();

    String proyecto = GetPropertiesTodoist.getInstance().getNameProject();
    String update = GetPropertiesTodoist.getInstance().getNameProjectUpdated();

    String tarea = GetPropertiesTodoist.getInstance().getNameTask();
    String description = GetPropertiesTodoist.getInstance().getDescriptionTask();
    String updatetask = GetPropertiesTodoist.getInstance().getNametaskUpdated();


    Actions action = new Actions(Session.getInstance().getBrowser());
    MainPage mainPage = new MainPage();
    ConfirmProjectAlert confirmProjectAlert = new ConfirmProjectAlert();
    ConfirmTaskAlert confirmTaskAlert = new ConfirmTaskAlert();
    CreateProjectSection createProjectSection = new CreateProjectSection();
    DeleteTaskSection deleteTaskSection = new DeleteTaskSection();
    EditProjectSection editProjectSection = new EditProjectSection();
    EditTaskSection editTaskSection = new EditTaskSection();
    LoginPage loginPage = new LoginPage();
    MenuProject menuProject = new MenuProject();
    ProjectSection projectSection = new ProjectSection();
    TaskMenu taskMenu = new TaskMenu();
    CreateTaskSection createTaskSection = new CreateTaskSection();
    //LeftClickOnProject leftClickOnProject = new LeftClickOnProject();

    @BeforeEach
    public  void openBrowser(){
        // todo create property file
        Session.getInstance().getBrowser().get(GetPropertiesTodoist.getInstance().getHost());
    }

    @AfterEach
    public void closeBrowser(){
        Session.getInstance().closeSession();
    }
}
