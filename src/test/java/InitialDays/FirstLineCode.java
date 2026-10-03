package InitialDays;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

public class FirstLineCode {
    public static void main(String[] args) {
//        ChromeDriver cd=new ChromeDriver();
//        EdgeDriver ed=new EdgeDriver();
//        FirefoxDriver fd=new FirefoxDriver();

//        RemoteWebDriver cd=new ChromeDriver();
//        RemoteWebDriver ed=new EdgeDriver();
//        RemoteWebDriver fd=new FirefoxDriver();

//        WebDriver cd=new ChromeDriver();
//        WebDriver ed=new EdgeDriver();
//        WebDriver fd=new FirefoxDriver();
        WebDriver driver=new ChromeDriver();
        /*
        * WebDriver is a type
        * driver is the ref. variable
        * new is a keyword => which will create the random memory space in heap area
        * ChromeDriver()  is the cons. call which will do 3 jobs
        *   1>it will launch the empty chrome browser.
        *   2>It will start the server.
        *   3>it will load, register and re-initialize the non-static members.
        * */
    }

}
