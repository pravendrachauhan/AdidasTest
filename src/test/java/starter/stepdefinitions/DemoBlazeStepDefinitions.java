package starter.stepdefinitions;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.thucydides.core.annotations.Steps;
import starter.matchers.TextMatcher;
import starter.navigation.HomePage;
import starter.search.ProductPage;
import starter.search.CartPage;

import static org.assertj.core.api.Assertions.assertThat;

public class DemoBlazeStepDefinitions {

    @Steps
    HomePage homePage;

    @Steps
    ProductPage productPage;

    @Steps
    CartPage cartPage;

    @Given("^User is on the Demo Blaze home page$")
    public void i_am_on_the_DemoBlaze_home_page() {
    	homePage.demoBlazeHomePage();
    }
    
    @When("^Navigate to \"(.*)\" → \"(.*)\"$")
    public void i_navigate_to_page(String productCategory, String product) {
    	homePage.clickOnProductCategory(productCategory);
    	homePage.clickOnProduct(product);
    }
    
    @When("^click on \"(.*)\"$")
    public void click_on_add_cart(String locatorText) {
    	productPage.clickOnButton(locatorText);
    }
    
    @When("^Accept pop up confirmation$")
    public void i_accept_popup() {
    	productPage.acceptAlert();
    	productPage.clickOnHomeLink();
    }
    
    @When("^Delete \"(.*)\" from cart$")
    public void delete_from_cart(String locatorText) {
    	cartPage.clickOnDeleteButtonForGivenProduct(locatorText);
    }
    
    @When("^Fill in all web form fields$")
    public void fiil_form_alert() {
    	cartPage.fillAllFieldsInForm();
    }
    
    @When("^Capture and log purchase Id and Amount$")
    public void getText_field() {
    	cartPage.getTextAfterFormSubmitted();
    }
    
    @Then("^Assert purchase amount equals expected$")
    public void assert_result() {
    	cartPage.verifyAmountOnPopup();
    }
//    

    

//    @When("s?he searches for \"(.*)\"")
//    public void i_search_for(String term) {
//    	//productPage.term(term);
//    }
//
//    @Then("all the result titles should contain the word \"(.*)\"")
//    public void all_the_result_titles_should_contain_the_word(String term) {
//        assertThat(cartPage.titles())
//                .matches(results -> results.size() > 0)
//                .allMatch(title -> new TextMatcher(title).containsIgnoringCase(term));
//    }
}
