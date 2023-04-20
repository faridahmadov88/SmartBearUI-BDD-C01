package step_definitions;

import io.cucumber.java.bs.A;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import utils.Driver;

import java.util.concurrent.TimeUnit;

public class Homework11 {
    @Given(": Navigate to: https:\\/\\/testautomationpractice.blogspot.com")
    public void navigate_to_https_testautomationpractice_blogspot_com() {

        Driver.getDriver().get("https://testautomationpractice.blogspot.com");
    }
    @When(": Double click on the Copy Text button")
    public void double_click_on_the_copy_text_button() {
        Driver.getDriver().manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        WebElement copytextButton= Driver.getDriver().findElement(By.xpath("//button[text()='Copy Text']"));
        WebElement dragMe = Driver.getDriver().findElement(By.id("draggable"));
        WebElement drophere = Driver.getDriver().findElement(By.id("droppable"));

        Actions action = new Actions(Driver.getDriver());
        action.doubleClick(copytextButton).perform();
        action.dragAndDrop(dragMe,drophere).perform();


    }
    @When(": Get text from the dropdown {int}")
    public void get_text_from_the_dropdown(Integer int1) {
        WebElement gettext = Driver.getDriver().findElement(By.id("field2"));

    }
    @Then(": Navigate to: http:\\/\\/api.jquery.com\\/dblclick\\/")
    public void navigate_to_http_api_jquery_com_dblclick() {
        Driver.getDriver().get("http://api.jquery.com/dblclick/");

    }
    @Then(": Switch to the frame that has blue box")
    public void switch_to_the_frame_that_has_blue_box() {
        WebElement iframe= Driver.getDriver().findElement(By.xpath("//div[@class='demo code-demo']/iframe"));
        Driver.getDriver().switchTo().frame(iframe);

      WebElement doubleclick = Driver.getDriver().findElement(By.xpath("//*[span='Double click the block']"));

      Actions action= new Actions(Driver.getDriver());
      action.doubleClick(doubleclick).perform();
    }
    @Then(": Double click the box to turn it into yellow")
    public void double_click_the_box_to_turn_it_into_yellow() {

    }
    @Then(": Verify the box is y")
    public void verify_the_box_is_y() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }



}
