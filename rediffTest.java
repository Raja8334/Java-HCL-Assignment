package SeleniumTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class rediffTest {

	public static void main(String[] args) {
	     WebDriver drive = (WebDriver) new ChromeDriver();
	     drive.manage().window().maximize();
	     drive.get("https://money.rediff.com/index.html");
	     drive.findElement(By.linkText("Money")).click(); 
	     drive.findElement(By.partialLinkText("Gainers")).click(); 
	     //drive.findElement(By.xpath("//*[@id=\"leftcontainer\"]/table/tbody/tr[2]/td[1]/a']")).click();
	     }

}
