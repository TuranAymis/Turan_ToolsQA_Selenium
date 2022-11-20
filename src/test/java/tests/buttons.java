package tests;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class buttons {

    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "Drivers/chromeDriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("https://demoqa.com/buttons");

        Actions actions = new Actions(driver);

        WebElement doubleClickButton = driver.findElement(By.cssSelector("button[id='doubleClickBtn']"));
        actions.doubleClick(doubleClickButton).perform();
        WebElement rightClickButton = driver.findElement(By.cssSelector("button[id='rightClickBtn']"));
        actions.contextClick(rightClickButton).perform();
        //aşağıdaki çalışmıyor sol tık yaptıramadım
        WebElement clickButton = driver.findElement(By.xpath("//*[@id='EfTRF']"));
        clickButton.click();

        WebElement textbox1 = driver.findElement(By.cssSelector("p[id='doubleClickMessage']"));
        WebElement textbox2 = driver.findElement(By.cssSelector("p[id='rightClickMessage']"));
        WebElement textbox3 = driver.findElement(By.cssSelector("p[id='dynamicClickMessage']"));

        String txt1 = textbox1.getText();
        String txt2 = textbox2.getText();
        String txt3 = textbox3.getText();

        System.out.println(txt1);
        System.out.println(txt2);
        System.out.println(txt3);

        driver.quit();
    }
}
