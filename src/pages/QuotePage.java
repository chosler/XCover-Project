package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class QuotePage {
	
	WebDriver driver;
	
	public QuotePage(WebDriver driver) {
		this.driver = driver;
	}
	
	By paymentButton = By.cssSelector("a[data-analytics='quoteProceedToPayment']");
	
	public String findPaymentButton() {
		return driver.findElement(paymentButton).getAttribute("innerText");
	}
	
}
