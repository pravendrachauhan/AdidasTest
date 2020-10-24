package starter.navigation;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import static java.time.temporal.ChronoUnit.SECONDS;
import net.serenitybdd.core.steps.UIInteractionSteps;
import net.thucydides.core.annotations.Step;

public class HomePage extends UIInteractionSteps {

	DemoHomePage demoHomePage;

    @Step("Open the Google home page")
    public void demoBlazeHomePage() {
    	demoHomePage.open();
    	setImplicitTimeout(15, SECONDS);

    }

	public void clickOnProductCategory(String productCategory) {
		$(By.xpath("//a[@id='itemc'][text()='"+productCategory+"']")).click();
		
	}

	public void clickOnProduct(String product) {
		$(By.xpath("//h4[@class='card-title']/a[text()='"+product+"']")).click();
		
	}
	
	public void waitUntilButtonClickable(By locator) {
		waitForCondition().until(
	            ExpectedConditions.elementToBeClickable(locator)
	    );
	}
}
