package definition;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

//import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class step_definition
{
	public static String van="https://opensource-demo.orangehrmlive.com/web/index.php/auth/login";
    WebDriver driver;
    
    @Given("Open the browser and navigate to the login page")
    public void open_the_browser_and_navigate_to_the_login_page() {
    	WebDriverManager.chromedriver().setup();
	    driver=new ChromeDriver();
	    driver.get(van);
    }
    @When("Enter the username {string}")
    public void enter_the_username(String string) throws InterruptedException {
    	Thread.sleep(9000);
  	  driver.findElement(By.name("username")).sendKeys(string);

    }
    @When("Enter the password {string}")
    public void enter_the_password(String string) throws InterruptedException {
    	Thread.sleep(9000);
		driver.findElement(By.name("password")).sendKeys(string);
    }
    @When("Click on login")
    public void click_on_login() throws InterruptedException {
    	Thread.sleep(9000);
    	driver.findElement(By.xpath("//*[@type='submit']")).click();
    }
    @Then("I should not see the login page")
    public void i_should_not_see_the_login_page()  throws InterruptedException {
    	Thread.sleep(9000);
	    String bb=driver.getTitle();
	   System.out.println(bb);
	   driver.close();
    }
    }
