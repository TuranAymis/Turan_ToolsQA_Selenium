package tests;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class checkBox {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "Drivers/chromeDriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("https://demoqa.com/checkbox");

        WebElement expandAll = driver.findElement(By.cssSelector("button[aria-label='Expand all']"));
        expandAll.click();

        WebElement Notes = driver.findElement(By.cssSelector("label[for='tree-node-notes']"));
        Notes.click();

        WebElement Commands = driver.findElement(By.cssSelector("label[for='tree-node-commands']"));
        Commands.click();

        WebElement React = driver.findElement(By.cssSelector("label[for='tree-node-react']"));
        React.click();

        WebElement Angular = driver.findElement(By.cssSelector("label[for='tree-node-angular']"));
        Angular.click();

        WebElement Veu = driver.findElement(By.cssSelector("label[for='tree-node-veu']"));
        Veu.click();

        JavascriptExecutor jse = (JavascriptExecutor)driver;
        jse.executeScript("window.scrollBy(0,250)");

        WebElement Public = driver.findElement(By.cssSelector("label[for='tree-node-public']"));
        Public.click();

        WebElement Private = driver.findElement(By.cssSelector("label[for='tree-node-private']"));
        Private.click();

        WebElement Classified = driver.findElement(By.cssSelector("label[for='tree-node-classified']"));
        Classified.click();

        WebElement General = driver.findElement(By.cssSelector("label[for='tree-node-general']"));
        General.click();

        WebElement WordFile = driver.findElement(By.cssSelector("label[for='tree-node-wordFile']"));
        WordFile.click();

        WebElement ExcelFile = driver.findElement(By.cssSelector("label[for='tree-node-excelFile']"));
        ExcelFile.click();

        driver.quit();

    }
}
