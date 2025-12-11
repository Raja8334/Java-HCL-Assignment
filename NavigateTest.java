package SeleniumTest;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class NavigateTest {
  @Test
  public void PerformTest() throws InterruptedException {
	  
	  WebDriver driver = new ChromeDriver();

     
      driver.navigate().to("https://www.google.com/");
      System.out.println("Opened Website 1: " + driver.getTitle());
      Thread.sleep(2000);

     
      driver.navigate().to("https://www.saucedemo.com/");
      System.out.println("Opened Website 2: " + driver.getTitle());
      Thread.sleep(2000);

      
      driver.navigate().back();
      System.out.println("Navigated Back: " + driver.getTitle());
      Thread.sleep(2000);

      
      driver.navigate().forward();
      System.out.println("Navigated Forward: " + driver.getTitle());
      Thread.sleep(2000);

     
      driver.navigate().to("https://www.google.com/");
      System.out.println("Again Navigated to Website1");
      Thread.sleep(2000);

     
      driver.navigate().refresh();
      System.out.println("Website1 Refreshed!");

   
      driver.quit();
  


  }
}
