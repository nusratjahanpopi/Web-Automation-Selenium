package Selenium_03;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MoveToElement {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        Thread.sleep(1000);
        driver.get("https://www.tutorialspoint.com/selenium/practice/register.php");
        driver.manage().window().maximize();
        // Set implicit wait for 30 seconds
        driver.manage().timeouts().implicitlyWait(java.time.Duration.ofSeconds(30));

        Thread.sleep(1000);
        Actions act = new Actions(driver);

        WebElement firstNameField = driver.findElement(By.id("firstname"));
        act.moveToElement(firstNameField).perform();
        firstNameField.sendKeys("Nusrat");
        Thread.sleep(1000);

        WebElement lastNameField = driver.findElement(By.id("lastName"));
        act.moveToElement(lastNameField).perform();
        lastNameField.sendKeys("Jahan");
        Thread.sleep(1000);

        WebElement usernameField = driver.findElement(By.id("username"));
        act.moveToElement(usernameField).perform();
        usernameField.sendKeys("nusrat");
        Thread.sleep(1000);

        WebElement passwordField = driver.findElement(By.id("password"));
        act.moveToElement(passwordField).perform();
        passwordField.sendKeys("password123");
        Thread.sleep(1000);

        WebElement registerButton = driver.findElement(By.cssSelector("input[value='Register']"));
        act.moveToElement(registerButton).click().perform(); // Click the submit button
        Thread.sleep(1000);

        driver.quit();


    }
}
