package testSuit.todoist;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import session.Session;

public class CRUDTaskTestTodoist extends TestBaseTodoist{

    @Test
    public void VerifyCrudTaskTest() throws InterruptedException {

        // log in
        mainPage.logintButton.click();
        loginPage.emailtTxtBox.setText(user);
        loginPage.passwordtTxtBox.setText(pwd);
        loginPage.logintButton.click();

        Assertions.assertTrue(createTaskSection.createTaskButton.isControlDisplayed(), "ERROR: The log in was not successful");

        // create task
        createTaskSection.createTaskButton.click();
        createTaskSection.taskNameTxtBox.setText(tarea);
        createTaskSection.descriptionNameTxtBox.setText(description);
        createTaskSection.addTaskButton.click();
        Assertions.assertTrue(createTaskSection.isTaskDisplayedInList(tarea), "ERROR: The task was not created");

        // update
        Session.getInstance().leftClickOnTask(tarea);
        action.contextClick(Session.getInstance().link).perform();

        taskMenu.selectEditTaskButton.click();
        Thread.sleep(1000);
        editTaskSection.editTaskNameTxtBox.setText(updatetask);
        Thread.sleep(1000);
        editTaskSection.saveTaskButton.click();
        Assertions.assertTrue(createTaskSection.isTaskUpdatedDisplayedInList(tarea,updatetask), "ERROR: The task was not updated");

        // delete task
        deleteTaskSection.taskUpdatedButton.click();
        deleteTaskSection.moreOptionsButton.click();
        deleteTaskSection.deleteTaskButton.click();
        confirmTaskAlert.deleteTaskButton.click();
        Assertions.assertFalse(createTaskSection.isTaskDisplayedInList(updatetask), "ERROR: The task was not deleted");

    }
}
