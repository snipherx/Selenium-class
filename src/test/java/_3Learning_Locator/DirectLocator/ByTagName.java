package _3Learning_Locator.DirectLocator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ByTagName {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.selenium.dev/selenium/web/web-form.html");
        driver.manage().window().maximize();
        Thread.sleep(2000);
        WebElement textinput=driver.findElement(By.tagName("input")); //only work with 1st input tag
        textinput.sendKeys("Automation test");
        Thread.sleep(3000);
        driver.quit();
    }
}
