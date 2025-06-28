package Selenium_03;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionApi {

    public static void main(String[] args) throws InterruptedException {

        WebDriver driver = new ChromeDriver();
        Thread.sleep(3000);
        driver.get("https://demoqa.com/buttons");
        driver.manage().window().maximize();
        // Set implicit wait for 30 seconds
        driver.manage().timeouts().implicitlyWait(java.time.Duration.ofSeconds(30));

      //  driver.findElement(By.id("Xtk1k")).click(); // Click on the first button
      //  Thread.sleep(3000);

        Actions act = new Actions(driver);
        // Right-click on the button
        act.contextClick(driver.findElement(By.id("rightClickBtn"))).perform();


        Thread.sleep(3000);
        // Double-click on the button
        act.doubleClick(driver.findElement(By.id("doubleClickBtn"))).perform();
        Thread.sleep(3000);

        driver.quit();



    }
}
