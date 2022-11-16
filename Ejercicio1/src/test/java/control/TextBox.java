package control;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;

public class TextBox extends Control{
    public TextBox(By locator) {
        super(locator);
    }

    // set data
    public void setText(String value){
        this.find();
        this.control.sendKeys(value);
    }

    // set and clean
    public void cleanSetText(String value){
        this.find();
        this.control.clear();
        //this.control.sendKeys(value + Keys.ENTER);
        this.control.sendKeys(value);
    }
}
