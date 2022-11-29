package definition;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class step_definition {
	public static String url ="https://www.mxplayer.in/";
	WebDriver driver;
	@Given("I should go to the home page of mx player")
	public void i_should_go_to_the_home_page_of_mx_player() {
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		driver.get(url);
	}
	@When("I click on login button")
	public void i_click_on_login_button() {
		driver.findElement(By.xpath("//*[@class='inline-top login-button']")).click();
		driver.manage().window().maximize();
	}
	@Then("I should see the various methods of login in to mxplayer")
	public void i_should_see_the_various_methods_of_login_in_to_mxplayer() {
	   driver.close();
	}



}
