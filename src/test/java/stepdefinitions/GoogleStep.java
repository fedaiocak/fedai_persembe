package stepdefinitions;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import pages.GooglePage;
import utilities.Driver;

public class GoogleStep {

    GooglePage googlePage = new GooglePage();

    @Given("user on the google page")
    public void user_on_the_google_page() {
        Driver.getDriver().get("https://www.google.com");
    }
    @Given("user searcehs for iphone")
    public void user_searcehs_for_iphone() {
        googlePage.searchBox.sendKeys("iphone");
        googlePage.searchBox.submit();
    }
    @Then("verify user example has iphone")
    public void verify_user_example_has_iphone() throws InterruptedException {
        Thread.sleep(2000);
        Assert.assertTrue(Driver.getDriver().getTitle().toLowerCase().contains("iphone"));
    }

}