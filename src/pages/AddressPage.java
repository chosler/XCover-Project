package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

public class AddressPage {

	WebDriver driver;

	public AddressPage(WebDriver driver) {
		
		this.driver = driver;

	}
	
	By addressBox = By.cssSelector("input[class='geosuggest__input']");
	By nextButton = By.cssSelector("button[class*='fJDiUv']");
	
	public void enterAddress(String address) throws InterruptedException {
		driver.findElement(addressBox).sendKeys(address);
		Thread.sleep(500);
		driver.findElement(addressBox).sendKeys(Keys.RETURN);
		Thread.sleep(500);
	}
	
}
