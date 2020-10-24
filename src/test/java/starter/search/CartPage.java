package starter.search;

import net.serenitybdd.core.steps.UIInteractionSteps;

import static org.junit.Assert.assertTrue;
import org.openqa.selenium.By;

public class CartPage extends UIInteractionSteps {
    
	public void clickOnDeleteButtonForGivenProduct(String locatorText) {
		$(By.xpath("//td[text()='"+locatorText+"']//ancestor::tr/td[4]/a")).click();
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	String expectedTotal;

	public void fillAllFieldsInForm() {
	
		$(By.id("country")).sendKeys("india");
		$(By.id("city")).sendKeys("noida");
		$(By.id("card")).sendKeys("visa");
		$(By.id("month")).sendKeys("12");
		$(By.id("year")).sendKeys("20");
		$(By.id("name")).sendKeys("pravendra");
		expectedTotal=$(By.id("totalm")).getText().split(":")[1].trim();
	}
	
	String actualTotal;
	public void getTextAfterFormSubmitted() {
		actualTotal = $(By.xpath("//p[@class='lead text-muted ']")).getText();
		System.out.println(actualTotal);
	}

	public void verifyAmountOnPopup() {
		assertTrue(actualTotal.contains(expectedTotal));
		
	}
	
	
}
