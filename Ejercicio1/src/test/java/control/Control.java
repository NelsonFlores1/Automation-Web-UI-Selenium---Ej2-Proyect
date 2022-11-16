package control;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import session.Session;

import java.time.Duration;

public class Control {
    // WebElement always has a locator
    protected WebElement control;
    protected By locator;

    public Control(By locator){
        this.locator = locator;
    }

    protected void find(){
        control = Session.getInstance().getBrowser().findElement(this.locator);
        // explicit wait
    }

    public void click(){
        this.find();
        control.click();
    }

    public boolean isControlDisplayed(){
        try {
            this.find();
            return control.isDisplayed();
        } catch (Exception e){
            return false;
        }
    }

    public String getText(){ // class: Label
        this.find();
        return control.getText();
    }

    public void waitControlIsClickable(){
        WebDriverWait explicitWait = new WebDriverWait(Session.getInstance().getBrowser(), Duration.ofSeconds(15));
        //explicitWait.until(ExpectedConditions.not(ExpectedConditions.visibilityOfElementLocated(this.locator)));
        explicitWait.until(ExpectedConditions.elementToBeClickable(this.locator));
    }


}
