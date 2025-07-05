package testng_01;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;

public class FirstTestCase {

    @Test
    public void testDoubleClick() throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.tutorialspoint.com/selenium/practice/buttons.php");
        driver.manage().timeouts().implicitlyWait(java.time.Duration.ofSeconds(30));

        new Actions(driver)
                .doubleClick(driver.findElement(By.cssSelector(".btn.btn-success"))).perform();
        String txt = driver.findElement(By.id("doublec")).getText().trim();
        Assert.assertEquals(txt, "You have Double clicked");

        driver.quit();

    }
    @Test
    public void checkPageTittle() throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.tutorialspoint.com/selenium/practice/buttons.php");
        driver.manage().timeouts().implicitlyWait(java.time.Duration.ofSeconds(30));

        String title = driver.getTitle().trim();


        Assert.assertEquals(title, "Selenium Practice - Buttons");

        driver.quit();
    }
    @Test
    public void validatePageUrl() throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.tutorialspoint.com/selenium/practice/buttons.php");
        driver.manage().timeouts().implicitlyWait(java.time.Duration.ofSeconds(30));

        String url = driver.getCurrentUrl().trim();


        Assert.assertEquals(url, "https://www.tutorialspoint.com/selenium/practice/buttons.php");

        driver.quit();
    }
}
