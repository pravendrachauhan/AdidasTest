package starter.search;

import org.fluentlenium.core.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.support.ui.ExpectedConditions;

import net.serenitybdd.core.steps.UIInteractionSteps;
import net.thucydides.core.annotations.Step;

public class ProductPage extends UIInteractionSteps {


    @Step("Add To Cart Step {0}")
	public void clickOnButton(String text) {
		$(By.xpath("//*[text()='"+text+"']")).click();
		
		
	}

    @Step("click on home link")
	public void clickOnHomeLink() {
    	$(ProductUI.Home_Link).click();
		
	}
    
    @Step("Accept Popup")
   	public void acceptAlert() {
    	waitForCondition().until(
	            ExpectedConditions.alertIsPresent()
	    );
    	getAlert().accept();	
    }
    
    
}
