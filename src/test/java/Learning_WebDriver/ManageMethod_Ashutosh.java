package Learning_WebDriver;

import org.openqa.selenium.InvalidArgumentException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ManageMethod_Ashutosh {
    public static void main(String[] args) {
        WebDriver driver=new ChromeDriver();
        WebDriver.Window win=driver.manage().window();

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

        //TO maximize screen
        win.maximize();
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        //To minimize screen
        win.minimize();
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        win.maximize();
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        //To full screen
        win.fullscreen();
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        driver.quit();

    }
}
