package tests;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class radioButton {

    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "Drivers/chromeDriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("https://demoqa.com/radio-button");

        WebElement yesButton = driver.findElement(By.cssSelector("label[for='yesRadio']"));
        yesButton.click();

        String textSuccess1 = driver.findElement(By.cssSelector("span[class='text-success']")).getText();
        System.out.println(textSuccess1);

        WebElement impressiveButton = driver.findElement(By.cssSelector("label[for='impressiveRadio']"));
        impressiveButton.click();

        String textSuccess2 = driver.findElement(By.cssSelector("span[class='text-success']")).getText();
        System.out.println(textSuccess2);

        driver.quit();



    }
}