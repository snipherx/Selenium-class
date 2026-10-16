package _3Learning_Locator.DirectLocator;

import org.openqa.selenium.By;
import org.openqa.selenium.InvalidArgumentException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ById {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        try {
            driver.get("https://www.automationwithpiyush.com/locatorsSignin.html");
        }
        catch (InvalidArgumentException e)
        {
            System.out.println("Invalid Path");
        }
        WebDriver.Window win=driver.manage().window();
        win.maximize();
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        WebElement username=driver.findElement(By.id("email"));
        username.sendKeys("ashutosh");
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }


        driver.quit();

    }
}
