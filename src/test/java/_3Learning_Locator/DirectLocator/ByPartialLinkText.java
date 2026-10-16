package _3Learning_Locator.DirectLocator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ByPartialLinkText {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.selenium.dev/selenium/web/web-form.html");
        driver.manage().window().maximize();
        Thread.sleep(2000);
        WebElement forgotPassword=driver.findElement(By.partialLinkText("Return to"));
        forgotPassword.click();
        Thread.sleep(3000);
        String url =driver.getCurrentUrl();
        System.out.println(url);
        driver.quit();
    }
}
