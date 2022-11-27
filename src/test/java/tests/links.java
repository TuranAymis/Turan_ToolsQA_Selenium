package tests;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

public class links {

    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "Drivers/chromeDriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();


        driver.get("https://demoqa.com/links");
        String mainWindow = driver.getWindowHandle();
        Thread.sleep(1000);

        driver.findElement(By.cssSelector("a[id='simpleLink']")).click();
        Thread.sleep(2000);
        driver.switchTo().window(mainWindow);


        driver.findElement(By.cssSelector("a[id='dynamicLink']")).click();
        Thread.sleep(3000);
        driver.switchTo().window(mainWindow);


        JavascriptExecutor jse = (JavascriptExecutor)driver;
        jse.executeScript("window.scrollBy(0,250)");

        driver.findElement(By.cssSelector("a[id='created']")).click();
        System.out.println(driver.findElement(By.cssSelector("p[id='linkResponse']")).getText());
        Thread.sleep(4000);

        driver.findElement(By.cssSelector("a[id='no-content']")).click();
        System.out.println(driver.findElement(By.cssSelector("p[id='linkResponse']")).getText());
        Thread.sleep(5000);

        driver.findElement(By.cssSelector("a[id='moved']")).click();
        System.out.println(driver.findElement(By.cssSelector("p[id='linkResponse']")).getText());
        Thread.sleep(6000);

        driver.findElement(By.cssSelector("a[id='bad-request']")).click();
        System.out.println(driver.findElement(By.cssSelector("p[id='linkResponse']")).getText());
        Thread.sleep(7000);

        driver.findElement(By.cssSelector("a[id='unauthorized']")).click();
        System.out.println(driver.findElement(By.cssSelector("p[id='linkResponse']")).getText());
        Thread.sleep(8000);

        driver.findElement(By.cssSelector("a[id='forbidden']")).click();
        System.out.println(driver.findElement(By.cssSelector("p[id='linkResponse']")).getText());
        Thread.sleep(9000);

        driver.findElement(By.cssSelector("a[id='invalid-url']")).click();
        System.out.println(driver.findElement(By.cssSelector("p[id='linkResponse']")).getText());
        Thread.sleep(1000);

        Set<String> allWindows = driver.getWindowHandles();
        List<String> listOfAllWindows=new ArrayList<String>();
        listOfAllWindows.addAll(allWindows);
        driver.switchTo().window(listOfAllWindows.get(2));
        driver.close();

        //driver.quit();
    }
}