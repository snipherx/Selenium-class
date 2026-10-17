package _3Learning_Locator.ExpressionLocator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class XPath {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.automationwithpiyush.com/locatorsSignin.html");
        driver.manage().window().maximize();
        Thread.sleep(1000);
        // Syntax--> XPath=//tagname[@Attribute='value']
        WebElement password=driver.findElement(By.xpath("//input[@id='password']"));
        password.sendKeys("12345");
        Thread.sleep(3000);
        driver.quit();
    }
}
