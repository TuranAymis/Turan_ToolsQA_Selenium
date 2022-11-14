package tests;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
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

        JavascriptExecutor jse = (JavascriptExecutor)driver;
        jse.executeScript("window.scrollBy(0,250)");

        WebElement permanentAddress = driver.findElement(By.cssSelector("textarea[id='permanentAddress']"));
        permanentAddress.click();
        permanentAddress.sendKeys("Kadikoy");

        WebElement submitButton = driver.findElement(By.cssSelector("button[id='submit']"));
        submitButton.click();

        WebElement textbox1 = driver.findElement(By.cssSelector("p[id='name']"));
        WebElement textbox2 = driver.findElement(By.cssSelector("p[id='email']"));
        WebElement textbox3 = driver.findElement(By.cssSelector("p[id='currentAddress']"));
        WebElement textbox4 = driver.findElement(By.cssSelector("p[id='permanentAddress']"));

        String txt1 =textbox1.getText();
        String txt2 =textbox2.getText();
        String txt3 =textbox3.getText();
        String txt4 =textbox4.getText();

        System.out.println(txt1);
        System.out.println(txt2);
        System.out.println(txt3);
        System.out.println(txt4);

        driver.quit();
    }


}
