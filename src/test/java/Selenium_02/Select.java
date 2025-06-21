package Selenium_02;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class Select {
    public static void main(String[] args) throws InterruptedException {

        WebDriver driver = new ChromeDriver();
        Thread.sleep(3000);

        driver.manage().window().maximize();
        driver.get("https://demo.guru99.com/test/newtours/register.php?authuser=0");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
        Thread.sleep(3000);

        //fill Contact Information
        driver.findElement(By.name("firstName")).sendKeys("Nusrat");
        Thread.sleep(3000);
        driver.findElement(By.name("lastName")).sendKeys("Jahan");
        Thread.sleep(3000);
        driver.findElement(By.name("phone")).sendKeys("01753084538");
        Thread.sleep(3000);
        driver.findElement(By.id("userName")).sendKeys("nj7771074@gmail.com");
        Thread.sleep(3000);

        //fill Mailing Address
        driver.findElement(By.name("address1")).sendKeys("Gulshan-2");
        Thread.sleep(3000);
        driver.findElement(By.name("city")).sendKeys("Dhaka");
        Thread.sleep(3000);
        driver.findElement(By.name("state")).sendKeys("Dhaka");
        Thread.sleep(3000);
        driver.findElement(By.name("postalCode")).sendKeys("1212");
        Thread.sleep(3000);

        //select 19th country from the dropdown
        WebElement countryDropdown = driver.findElement(By.name("country"));
        org.openqa.selenium.support.ui.Select sel = new org.openqa.selenium.support.ui.Select(countryDropdown);
        sel.selectByIndex(18);
        Thread.sleep(3000);

        //show selected country name
        String selectedCountry = sel.getFirstSelectedOption().getText();
        System.out.println("Selected Country: " + selectedCountry);
        Thread.sleep(3000);


        //fill User Information
        driver.findElement(By.id("email")).sendKeys("nj7771074@gmail.com");
        Thread.sleep(3000);
        driver.findElement(By.name("password")).sendKeys("12345678");
        Thread.sleep(3000);
        driver.findElement(By.name("confirmPassword")).sendKeys("12345678");
        Thread.sleep(3000);

        // Submit the form
        driver.findElement(By.name("submit")).click();
        Thread.sleep(3000);

        String bodyText = driver.findElement(By.tagName("body")).getText();

        if (bodyText.contains("Thank you for registering")) {
            System.out.println("✅ Registration Successful!");
        } else {
            System.out.println("❌ Registration Failed or message not found.");
        }

        driver.quit();
    }


}
