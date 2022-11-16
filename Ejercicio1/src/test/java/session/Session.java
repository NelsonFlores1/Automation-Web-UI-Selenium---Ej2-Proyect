package session;

import browser.FactoryBrowser;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import util.GetPropertiesYopmail;

// singleton dessign pattern
public class Session {
    private static Session instance = null; // atribute

    public WebElement link;

    private WebDriver browser;
    //constructor
    private Session(){
        //browser = FactoryBrowser.make("chrome").create();
        browser = FactoryBrowser.make(GetPropertiesYopmail.getInstance().getBrowser()).create();
    }

    public static Session getInstance(){
        if (instance == null)
            instance = new Session();
        return instance;
    }


    public void closeSession(){
        browser.quit();
        instance = null; // it must be killed
    }

    public WebDriver getBrowser() { // getter
        return browser;
    }

    public void chooseFrame(String frameName) {
        browser.switchTo().frame(frameName);
    }

    public void refreshPage() {
        browser.navigate().refresh();
    }


    public boolean msgSubjectShowed() {
        try{
            browser.findElement(By.xpath("//div[text()='test message']")).isDisplayed();
            return true;
        } catch (Exception e){
            return false;
        }

    }

    public void leftClick(String name) {
        link = browser.findElement(By.xpath("//a/span[text()='"+name+"']"));
    }

    public void leftClickOnTask(String task) {
        link = browser.findElement(By.xpath("//div[text()='"+task+"']"));
    }
}
