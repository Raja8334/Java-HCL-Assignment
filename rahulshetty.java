package SeleniumTest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class rahulshetty {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("https://rahulshettyacademy.com/AutomationPractice/");
        
        driver.findElement(By.xpath("//input[@value = 'radio2']")).click();
        //driver.findElement(By.name("radioButton")).click();

        driver.findElement(By.id("checkBoxOption1")).click();
        driver.findElement(By.id("checkBoxOption3")).click();
        
       
    }
}
