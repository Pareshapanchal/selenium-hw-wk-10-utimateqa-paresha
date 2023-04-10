package browsertesting;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class ChromeBrowser {
    public static void main(String[] args) {
        String baseUrl = "https://courses.ultimateqa.com/users/sign_in";
        //launch the Chrome browser
        WebDriver driver = new ChromeDriver();
        //Open URL
        driver.get(baseUrl);
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
       // driver.close();
    }
}
