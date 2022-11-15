package tests;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class webTables {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "Drivers/chromeDriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("https://demoqa.com/webtables");

        WebElement addButton = driver.findElement(By.cssSelector("button[id='addNewRecordButton']"));
        addButton.click();

        WebElement firstName = driver.findElement(By.cssSelector("input[id='firstName']"));
        firstName.sendKeys("Turan");

        WebElement lastName = driver.findElement(By.cssSelector("input[id='lastName']"));
        lastName.sendKeys("Aymış");

        WebElement userEmail = driver.findElement(By.cssSelector("input[id='userEmail']"));
        userEmail.sendKeys("turanaymis@hotmail.com");

        WebElement userAge = driver.findElement(By.cssSelector("input[id='age']"));
        userAge.sendKeys("33");

        WebElement userSalary = driver.findElement(By.cssSelector("input[id='salary']"));
        userSalary.sendKeys("10000");

        WebElement userDepartment = driver.findElement(By.cssSelector("input[id='department']"));
        userDepartment.sendKeys("IT");

        WebElement submitButton = driver.findElement(By.cssSelector("button[id='submit']"));
        submitButton.click();

        WebElement searchBox = driver.findElement(By.cssSelector("input[id='searchBox']"));
        searchBox.click();
        searchBox.sendKeys("Turan");

        WebElement deleteButton = driver.findElement(By.cssSelector("span[title='Delete']"));
        deleteButton.click();

        Thread.sleep(2000);

        driver.quit();
    }
}