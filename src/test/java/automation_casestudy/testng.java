package automation_casestudy;

import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

import io.github.bonigarcia.wdm.WebDriverManager;

public class testng {
	ExtentHtmlReporter  htmlReporter;
	ExtentReports extent;
	ExtentTest test;
public static String url ="https://www.mxplayer.in/";
WebDriver driver;
@Test
public void tc() {
	WebDriverManager.chromedriver().setup();
	driver=new ChromeDriver();
	driver.get(url);
	 htmlReporter = new ExtentHtmlReporter("extent.html");
	 extent = new ExtentReports();
	extent.attachReporter(htmlReporter);

}
@Test
public void tc1() throws InterruptedException {


	test=extent.createTest("this is my first test");
	
	
	
	
	
	driver.findElement(By.xpath("//*[@class='inline-top login-button']")).click();
	test.pass("you have clicked on login ");
	driver.manage().window().maximize();
	driver.findElement(By.xpath("//*[@class='google-text']")).click();
	test.pass("you have clicked on login ");
	//driver.navigate().back();
    ArrayList<String>	al=new ArrayList<String>(driver.getWindowHandles());
    int i=al.size();
    System.out.print(i);
    driver.switchTo().window(al.get(0));
    
    driver.findElement(By.xpath("//*[@class='fb-text']")).click();
    test.pass("you have clicked on continue with facebook ");
    driver.switchTo().window(al.get(0));
    
    driver.findElement(By.xpath("//*[@class='skip-now']")).click();
    test.pass("you have clicked on skip for now ");
    driver.findElement(By.xpath("//*[@class='ht_title ']")).click();
    test.pass("you have clicked on shows ");
	driver.findElement(By.xpath("//*[@class='ht_menu']/li/a")).click();
	test.pass("you have clicked on drama ");
	driver.findElement(By.xpath("//*[@class='ht_menu']/li[2]/a")).click();
	test.pass("you have clicked on thriller ");
	driver.findElement(By.xpath("//*[@class='ht_menu']/li[3]/a")).click();
	test.pass("you have clicked on reality ");
	driver.findElement(By.xpath("//*[@class='ht_menu']/li[4]/a")).click();
	test.pass("you have clicked on crime ");
	driver.findElement(By.xpath("//*[@class='ht_menu']/li[5]/a")).click();
	test.pass("you have clicked on comedy ");
	driver.quit();
	extent.flush();
}
}
