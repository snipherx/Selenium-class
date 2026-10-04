package Learning_WebDriver;

import org.openqa.selenium.InvalidArgumentException;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ManageMethodPosition_Ashutosh {
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
        //To see the position of page on our window/screen
        Point p=win.getPosition();
        System.out.println("Position: "+p);
        int x=p.getX();
        int y=p.getY();
        System.out.println("X-axis: "+x);
        System.out.println("Y-axis: "+y);

        //To set position of page
        win.setPosition(new Point(1000,4000));
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        Point p1=win.getPosition();
        System.out.println("New set position: "+p1);

        driver.quit();
    }
}
