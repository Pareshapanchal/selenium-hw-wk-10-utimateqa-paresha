package browsertesting;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.time.Duration;

public class MultiBrowser {
    //static variable delcare and initialised
    static String baseurl = "https://courses.ultimateqa.com/users/sign_in";
    static WebDriver driver;
    static String browser = "Firefox";

    public static void main(String[] args) {
        //if used to give option to open a different browser
        if(browser.equalsIgnoreCase("Chrome")){
            driver = new ChromeDriver();
        } else if (browser.equalsIgnoreCase("Firefox")) {
            driver = new FirefoxDriver();
        } else if (browser.equalsIgnoreCase("Edge")) {
            driver = new EdgeDriver();
        }else {
            System.out.println("Wrong Browser Name");
        }
        //Open the URL
        driver.get(baseurl);
        //Maximise the window
        driver.manage().window().maximize();
        //we give implicit wait to driver
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
        //print the page title
        System.out.println(driver.getTitle());
        //print the current URL
        System.out.println(driver.getCurrentUrl());
        //print the page source
        System.out.println(driver.getPageSource());
        //find email field and send the values to email field
        driver.findElement(By.id("user[email]")).sendKeys("prime123@gmail.com");
        //find password field and send the values to password field
        driver.findElement(By.id("user[password]")).sendKeys("prime123");
        //closing the browser
        driver.close();

    }
}
