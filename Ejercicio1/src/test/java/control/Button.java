package control;

import org.openqa.selenium.By;

public class Button extends Control{
    public Button(By locator) {
        super(locator);
    }
    // it does not have the method click(). because it inherits from Control.


}
