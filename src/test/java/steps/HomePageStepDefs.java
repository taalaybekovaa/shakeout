package steps;

import com.pages.HomePage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import java.sql.Driver;

public class HomePageStepDefs {

 WebDriver driver;
 HomePage homePage;

 @Given("I navigate to MC Home Page")
 public void i_navigate_to_mc_home_page() {
  // Write code here that turns the phrase above into concrete actions
  WebDriverManager.chromedriver().setup();
  driver = new ChromeDriver();
  driver.get("https://www.amazon.com");
 }

 @When("I click on All Services and Treatments page")
 public void i_click_on_all_services_and_treatments_page() {
  // Write code here that turns the phrase above into concrete actions
  homePage.clickOnAllServiesButton();
 }

 @Then("I should land on Services Main page")
 public void i_should_land_on_services_main_page() {
  // Write code here that turns the phrase above into concrete actions
  String actualTitle = driver.findElement(By.tagName("//h1")).getText();
  String expectedTitle = "Services & Treatment";
  Assert.assertEquals(actualTitle, expectedTitle);
 }
}

