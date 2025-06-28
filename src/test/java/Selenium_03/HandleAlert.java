package Selenium_03;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandleAlert {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        Thread.sleep(3000); // Sleep for 3 seconds to allow the browser to open
        driver.manage().window().maximize();
        driver.get("https://demoqa.com/alerts");

        driver.manage().timeouts().implicitlyWait(java.time.Duration.ofSeconds(30));// Set implicit wait for 30 seconds

        driver.findElement(By.id("alertButton")).click(); // Click on the alert button
        Thread.sleep(3000); // Sleep for 3 seconds to allow the alert to appear
        driver.switchTo().alert().accept(); // Accept the alert
        Thread.sleep(3000); // Sleep for 3 seconds after accepting the alert

        driver.findElement(By.id("confirmButton")).click(); // Click on the confirm button
        Thread.sleep(3000); // Sleep for 3 seconds to allow the confirm dialog to appear
        driver.switchTo().alert().dismiss(); // Dismiss the confirm dialog
        Thread.sleep(3000); // Sleep for 3 seconds after dismissing the confirm dialog

        driver.findElement(By.id("promtButton")).click(); // Click on the prompt button
        Thread.sleep(3000); // Sleep for 3 seconds to allow the prompt dialog to appear


        //use selenium alert interface
       org.openqa.selenium.Alert alt = driver.switchTo().alert();
        alt.sendKeys("Hello,this is a prompt alert!");// Send text to the prompt dialog
        System.out.println("Prompt alert text sent."+driver.switchTo().alert().getText());
        // Accept the prompt dialog
        alt.accept();
        Thread.sleep(3000); // Sleep for 3 seconds after accepting the prompt dialog

        driver.quit(); // Close the browser



    }

}
