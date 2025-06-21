package Selenium_02;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.List;

public class LoginUsingIdLocator {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.saucedemo.com/");
        Thread.sleep(3000); // Wait for the page to load
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));

        driver.findElement(By.id("user-name")).clear();
        driver.findElement(By.id("user-name")).sendKeys("standard_user");
        Thread.sleep(3000); // Wait for 3 seconds to observe the input

        driver.findElement(By.id("password")).clear();
        driver.findElement(By.id("password")).sendKeys("secret_sauce");


        Thread.sleep(3000); // Wait for 3 seconds to observe the input
        driver.findElement(By.id("login-button")).click();
        Thread.sleep(3000); // Wait for the login to complete


        List<WebElement> titles= driver.findElements(By.cssSelector("a[id*='_title_link'] div[class='inventory_item_name ']"));
        for (WebElement tl : titles) {
            System.out.println("Product Title: " + tl.getText());
        }
        driver.quit();



    }
}
