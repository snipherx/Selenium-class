package _3Learning_Locator.DirectLocator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ByLinkText {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.automationwithpiyush.com/locatorsSignin.html");
        driver.manage().window().maximize();
        Thread.sleep(1000);
        WebElement register=driver.findElement(By.linkText("Register"));
        register.click();
        Thread.sleep(3000);
        driver.quit();
    }
}
