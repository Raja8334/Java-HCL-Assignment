package SeleniumTest;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class  AmazonTest{
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        // New website
        driver.get("https://www.amazon.in/");
       //driver.findElement(By.xpath("//a[@data-csa-c-slot-id='nav_cs_5']")).click();


        driver.findElement(By.cssSelector("#twotabsearchtextbox")).sendKeys("Selenium WebDriver book",Keys.ENTER);

        // 2) CSS selector with class (search button)
        // HTML: <input class="nav-input nav-progressive-attribute" ...>
        driver.findElement(By.cssSelector("input.nav-input")).click();

        
        driver.quit();
    }
}
