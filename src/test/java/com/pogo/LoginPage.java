package com.pogo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import com.base.LibGlobal;

public class LoginPage extends LibGlobal {
	public LoginPage() {
PageFactory.initElements(driver, this);
	
	}
	
	
	@FindBy(id = "username")
	private WebElement txtUserName;
	@FindBy(xpath="//input[@id='password']")
	private WebElement txtPassword;
	@FindBy(className="login_button")
	private WebElement btnLogin;
	public WebElement getTxtUserName() {
		return txtUserName;
	}
	public WebElement getTxtPassword() {
		return txtPassword;
	}
	public WebElement getBtnLogin() {
		return btnLogin;
	}
	
	public void login(String userName,String password) {
		type(getTxtUserName(), userName);
//		type(driver.findElement(By.id("username")), userName);
		type(driver.findElement(By.id("password")), password);
		click(driver.findElement(By.id("login")));
		

	}
	

}
