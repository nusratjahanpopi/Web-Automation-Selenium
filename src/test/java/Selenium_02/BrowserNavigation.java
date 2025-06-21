package Selenium_02;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrowserNavigation {
    public static void main(String[] args) throws InterruptedException {

        WebDriver driver = new ChromeDriver();
        Thread.sleep(3000);
        driver.manage().window().maximize();
        driver.get("https://www.saucedemo.com/");

        driver.manage().timeouts().implicitlyWait(java.time.Duration.ofSeconds(30));
        System.out.println("Title of the page is: " + driver.getTitle());
        System.out.println("Current URL is: " + driver.getCurrentUrl());
        Thread.sleep(3000);

        // Navigate to another page
        WebDriver.Navigation nv = driver .navigate();

        nv.to("https://www.google.com");
        System.out.println("Title after navigating back: " + driver.getTitle());
        System.out.println("Current URL after navigating back: " + driver.getCurrentUrl());

        nv.back();
        Thread.sleep(3000);

        nv.forward();
        Thread.sleep(3000);

        nv.refresh();

        System.out.println("Title after refresh: " + driver.getTitle());
        System.out.println("Current URL after refresh: " + driver.getCurrentUrl());
        Thread.sleep(3000);

        driver.quit();


    }
}
