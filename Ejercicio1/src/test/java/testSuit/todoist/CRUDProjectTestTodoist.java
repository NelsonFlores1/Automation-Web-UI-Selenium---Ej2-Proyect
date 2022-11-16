package testSuit.todoist;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import session.Session;

public class CRUDProjectTestTodoist extends TestBaseTodoist{
    @Test
    public void VerifyCrudProjectTest() throws InterruptedException {

        // log in
        mainPage.logintButton.click();
        loginPage.emailtTxtBox.setText(user);
        loginPage.passwordtTxtBox.setText(pwd);
        loginPage.logintButton.click();

        // create a new project
        createProjectSection.addNewProjectButton.click();
        createProjectSection.nameProjectTxtBox.setText(proyecto);
        createProjectSection.addProjectButton.click();

        Assertions.assertTrue(createProjectSection.isProjectDisplayedInList(proyecto), "ERROR: The project was not created");


        // edit project
        Session.getInstance().leftClick(proyecto);
        action.contextClick(Session.getInstance().link).perform();
        menuProject.selectEditProjectButton.click();
        editProjectSection.nameUpdatedTxtBox.cleanSetText(update);
        editProjectSection.saveprojectButton.click();


        // delete project
        Session.getInstance().leftClick(update);
        action.contextClick(Session.getInstance().link).perform();
        menuProject.selectDeleteProjectButton.click();
        confirmProjectAlert.deleteProjectButton.click();

        Assertions.assertFalse(createProjectSection.isProjectDisplayedInList(update), "ERROR: The project was not deleted");


    }

}
