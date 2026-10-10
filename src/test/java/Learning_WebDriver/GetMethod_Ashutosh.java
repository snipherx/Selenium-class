package Learning_WebDriver;

import org.openqa.selenium.InvalidArgumentException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetMethod_Ashutosh {
    public static void main(String[] args) {
        WebDriver driver=new ChromeDriver();
        try {
            driver.get("https://www.instagram.com/?hl=en"); //InvalidArgumentException
        /*
        *wrong fqp(full qualified path)
        * InvalidArgumentException- An invalid argument is passed to a WebDriver command
                                    or method.
         */
        }
        catch (InvalidArgumentException e)
        {
            System.out.println("Wrong URL/Path!!!");
        }

        String title=driver.getTitle();
        String url=driver.getCurrentUrl();
//        String sourceCode=driver.getPageSource();

        try {
            Thread.sleep(5000); //2000 milli second= 2sec
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        System.out.println("Title: "+title);
        System.out.println("URL: "+url);
        //System.out.println("SourceCode: "+sourceCode);

        //driver.close(); //close does not stop the server
        driver.quit(); // stops server as well
    }
}
