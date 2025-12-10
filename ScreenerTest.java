package SeleniumTest;

import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScreenerTest {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        // Stock screener website
        driver.get("https://www.screener.in/");

        // Get all <a> (anchor) tags
        List<WebElement> links = driver.findElements(By.tagName("a"));

        // Print total number of anchor tags
        System.out.println("Total <a> tags on page: " + links.size());

        // Print text and href of each link
        for (WebElement link : links) {
            String text = link.getText();
            String href = link.getAttribute("href");
            System.out.println(text + " --> " + href);
        }

        driver.quit();
    }
}
