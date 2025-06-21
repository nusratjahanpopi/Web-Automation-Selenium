package Selenium_02;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class FindElements {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://the-internet.herokuapp.com/dynamic_content");
        driver.manage().timeouts().implicitlyWait(java.time.Duration.ofSeconds(30));

        List<WebElement> images = driver.findElements(By.cssSelector("img[src$='.jpg']"));

        for (WebElement el : images) {
            System.out.println("Image Source: " + el.getAttribute("src"));
        }

        driver.quit();


    }


}
