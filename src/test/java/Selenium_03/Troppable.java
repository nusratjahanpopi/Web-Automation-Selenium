package Selenium_03;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Troppable {
    public static void main(String[] args) throws InterruptedException {


    WebDriver driver = new ChromeDriver();
        Thread.sleep(3000);
        driver.get("https://www.tutorialspoint.com/selenium/practice/droppable.php");
        driver.manage().window().maximize();
    // Set implicit wait for 30 seconds
        driver.manage().timeouts().implicitlyWait(java.time.Duration.ofSeconds(30));

        Actions act = new Actions(driver);
        WebElement source = driver.findElement(By.id("draggable")); // Locate the draggable element
        WebElement target = driver.findElement(By.id("droppable")); // Locate the droppable element

        act.dragAndDrop(source, target).perform(); // Perform drag and drop action
        Thread.sleep(3000);


        driver.quit();

}
}