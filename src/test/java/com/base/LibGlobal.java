package com.base;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LibGlobal {

	static public WebDriver driver;

	public WebDriver getDriver() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		return driver;
	}

	public String getCurrentUrl() {
		return driver.getCurrentUrl();
	}

	public String getTitle() {
		return driver.getTitle();
	}

	public boolean isDisplayed(WebElement element) {
		return element.isDisplayed();
	}

	public boolean isEnabled(WebElement element) {
		return element.isEnabled();
	}

	public String getText(WebElement element) {
		return element.getText();
	}

	public String getAttributeValue(WebElement element) {
		return element.getAttribute("value");
	}

	public void clickJs(WebElement element) {
		((JavascriptExecutor) driver).executeScript("argument[0].click()", element);
	}

	public void typeJs(WebElement element, String data) {
		((JavascriptExecutor) driver).executeScript("argument[0].setAttribute('value','" + data + "')", element);
	}

	public void selectDataByAttribute(WebElement element, String data) {
		new Select(element).selectByValue(data);
	}

	public void selectDataByIndex(WebElement element, int index) {
		new Select(element).selectByIndex(index);
	}

	public void selectDataBytext(WebElement element, String data) {
		new Select(element).selectByVisibleText(data);
	}

	public void quitBrowser() {
		driver.quit();
	}

	public void closeBrowser() {
		driver.close();
	}

	public void click(WebElement element) {
		if (isDisplayed(element) && isEnabled(element)) {
			element.click();
		}
	}

	public void type(WebElement element, String data) {
		if (isDisplayed(element) && isEnabled(element) && data != null) {
			element.sendKeys(data);
		}
	}

	public void maximize() {
		driver.manage().window().maximize();
	}

	public void implicitWait() {
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	}

	public void loadUrl(String url) {
		driver.get(url);
		maximize();
		implicitWait();
	}

}
