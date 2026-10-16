package _3Learning_Locator.ExpressionLocator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class cssSelector {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.automationwithpiyush.com/locatorsSignin.html");
        driver.manage().window().maximize();
        Thread.sleep(1000);
        WebElement username= driver.findElement(By.cssSelector("[placeholder='enter username']"));
        username.sendKeys("ashutosh");
        Thread.sleep(3000);
        driver.quit();
    }
}
