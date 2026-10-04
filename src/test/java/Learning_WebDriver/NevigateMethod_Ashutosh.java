package Learning_WebDriver;

import org.openqa.selenium.InvalidArgumentException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NevigateMethod_Ashutosh {
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

        WebDriver.Navigation nev= driver.navigate();

        //Navigate to another page
        try {
            nev.to("https://www.zomato.com/");
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

        //To navigate back
        nev.back();
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }


        driver.quit();
    }
}
