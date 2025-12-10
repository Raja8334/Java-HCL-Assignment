package SeleniumTest;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FlipkartTest {

	public static void main(String[] args) {
		WebDriver drive = new ChromeDriver();
		drive.manage().window().maximize();
		drive.get("https://www.flipkart.com/");
		drive.findElement(By.name("q")).sendKeys("laptop",Keys.ENTER);
        drive.findElement(By.xpath("//*[@id=\"container\"]/div/div[3]/div[1]/div[2]/div[8]")).click();
        System.out.println(drive.getTitle());
        drive.navigate().back();
        drive.findElement(By.name("q")).sendKeys("TV",Keys.ENTER);
        drive.findElement(By.xpath("//*[@id=\"container\"]/div/div[3]/div[1]/div[2]/div[14]/div/div/div")).click();
        System.out.println(drive.getTitle());
        drive.navigate().back();
        drive.findElement(By.name("q")).sendKeys("Smart Phones",Keys.ENTER);
        drive.findElement(By.xpath("//*[@id=\"container\"]/div/div[3]/div[1]/div[2]/div[3]/div/div/div")).click();
        System.out.println(drive.getTitle());
	}

}
