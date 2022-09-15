package tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class textBox {

    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "Drivers/chromeDriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("https://demoqa.com/text-box");

        WebElement userName = driver.findElement(By.cssSelector("input[id='userName']"));
        userName.click();
        userName.sendKeys("Turan Aymis");

        WebElement userMail = driver.findElement(By.cssSelector("input[id='userEmail']"));
        userMail.click();
        userMail.sendKeys("turanaymis@hotmail.com");

        WebElement currentAddress = driver.findElement(By.cssSelector("textarea[id='currentAddress']"));
        currentAddress.click();
        currentAddress.sendKeys("Maltepe");

        WebElement permanentAddress = driver.findElement(By.cssSelector("textarea[id='permanentAddress']"));
        permanentAddress.click();
        permanentAddress.sendKeys("Kadikoy");

        WebElement submitButton = driver.findElement(By.cssSelector("button[id='submit']"));
        submitButton.click();

        driver.wait(3000);
        driver.quit();
    }


}
