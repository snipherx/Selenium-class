package Learning_WebDriver;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.InvalidArgumentException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ManageMethodSize_Ashutosh {
    public static void main(String[] args) {
        WebDriver driver=new ChromeDriver();
        try {
            driver.get("https://www.instagram.com/?hl=en");
        }
        catch (InvalidArgumentException e)
        {
            System.out.println("Wrong URL/Path");
        }
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        WebDriver.Window win=driver.manage().window();
        Dimension dim= win.getSize();
        int width=dim.getWidth();
        int height=dim.getHeight();
        System.out.println("Dimension: "+dim);
        System.out.println("Width: "+width);
        System.out.println("Height: "+height);
        driver.quit();
    }
}
