package basicSelenium;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class BasicSeleniumTest {

    WebDriver driver;

    @BeforeEach
    public void setUp() {
        System.setProperty("webdriver.chrome.driver", "src/test/resources/driver/chromedriver");
        driver = new ChromeDriver();

        // implict wait
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        // page load wait
        driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(10));
        driver.manage().window().maximize();
        driver.get("https://yopmail.com/");
    }

    @AfterEach
    public void cleanup() {
        driver.quit();
    }

    @Test
    public void verifyCRUDProject() throws InterruptedException {

        // login
        //driver.findElement(By.id("login")).click();
        driver.findElement(By.id("login")).sendKeys("nelo@gmail.com");
        driver.findElement(By.className("f36")).click();

        // verify if you are login
        Assertions.assertTrue(driver.findElement(By.xpath("//a[@class='hlink bl']")).isDisplayed()
                ,"ERROR login was incorrect");

        // send the email
        driver.findElement(By.xpath("//button[@id='newmail']/i[@class='material-icons-outlined']")).click();

        driver.switchTo().frame("ifmail");
        driver.findElement(By.id("msgto")).sendKeys("nelo");
        driver.findElement(By.id("msgsubject")).sendKeys("test message");
        driver.findElement(By.id("msgbody")).sendKeys("cuerpo del mensaje");
        driver.findElement(By.id("msgsend")).click();

        Thread.sleep(1000);
        // verify if you sent the email

        driver.navigate().refresh();

        Thread.sleep(3000);
        driver.switchTo().frame("ifinbox");

        //int actualResult2 = driver.findElements(By.xpath("//div[text()='test message']")).size();
        //Assertions.assertTrue(actualResult2 >= 1, "Error, you sent the email");
        Assertions.assertTrue(driver.findElement(By.xpath("//div[text()='test message']")).isDisplayed()
                ,"ERROR message wa not sent");

        Thread.sleep(3000);

    }
}
