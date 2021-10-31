package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

public class PurchasePricePage {
	
	WebDriver driver;
	
	public PurchasePricePage(WebDriver driver) {
		this.driver = driver;
	}
	
	By priceBox = By.cssSelector("input[name='retail_value']");
	
	public void fillPriceBox(String price) {
		driver.findElement(priceBox).sendKeys(price);
		driver.findElement(priceBox).sendKeys(Keys.RETURN);
		
	}

}
