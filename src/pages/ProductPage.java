package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

public class ProductPage {
	
	WebDriver driver;
	
	public ProductPage(WebDriver driver) {
		this.driver = driver;
	}
	
	By productBox = By.cssSelector("input[name='brand']");
	By nextButton = By.cssSelector("button[class*='fJDiUv']");

	public void fillProduct(String product) {
		driver.findElement(productBox).sendKeys(product);
		driver.findElement(productBox).sendKeys(Keys.RETURN);
		
	}
	
}
