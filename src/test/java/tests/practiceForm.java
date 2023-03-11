package tests;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class practiceForm {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "Drivers/chromeDriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("https://demoqa.com/automation-practice-form");

        WebElement firstName = driver.findElement(By.cssSelector("input[id='firstName']"));
        firstName.sendKeys("Turan");

        WebElement lastName = driver.findElement(By.cssSelector("input[id='lastName']"));
        lastName.sendKeys("Aymış");

        WebElement userEmail = driver.findElement(By.cssSelector("input[id='userEmail']"));
        userEmail.sendKeys("turan@aymis.com");

        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,250)", "");

        WebElement genderSelect = driver.findElement(By.cssSelector("label[for='gender-radio-1']"));
        genderSelect.click();

        WebElement phoneNumber = driver.findElement(By.cssSelector("input[id='userNumber']"));
        phoneNumber.sendKeys("1231231231");

        WebElement birthDate = driver.findElement(By.cssSelector("input[id='dateOfBirthInput']"));
        birthDate.click();

        WebElement year = driver.findElement(By.cssSelector("select[class='react-datepicker__year-select']"));
        year.sendKeys("1987");

        WebElement month = driver.findElement(By.cssSelector("select[class='react-datepicker__month-select']"));
        month.sendKeys("April");

        WebElement day = driver.findElement(By.cssSelector("div[class='react-datepicker__day react-datepicker__day--015']"));
        day.click();

        //WebElement subjectsText = driver.findElement(By.cssSelector("div[id='subjectsContainer']"));
        //subjectsText.sendKeys("Computer Science");

        WebElement hobbies1 = driver.findElement(By.xpath("//input[@id='hobbies-checkbox-1']"));
        hobbies1.click();

        WebElement hobbies2 = driver.findElement(By.cssSelector("input[id='hobbies-checkbox-2']"));
        hobbies2.click();

        WebElement hobbies3 = driver.findElement(By.cssSelector("input[id='hobbies-checkbox-3']"));
        hobbies3.click();

        js.executeScript("window.scrollBy(0,250)", "");

        Thread.sleep(2000);

        driver.quit();

    }
}
