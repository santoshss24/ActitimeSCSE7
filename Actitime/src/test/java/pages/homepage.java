package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class homepage extends basepage 
{
	@FindBy(id = "logoutLink")
	private WebElement logoutLink;
	
	@FindBy(xpath = "(//div[text()='Calls'])[1]")
	private WebElement callsTask;
	
	@FindBy(xpath = "//div[text()='ACTIONS']")
	private WebElement actionsButton;
	
	@FindBy(xpath = "//div[text()='Copy to']")
	private WebElement copyTaskLink;
	
	@FindBy(xpath = "//div[text()='- Select Customer -']")
	private WebElement selectCustomerDropdown;
	
	@FindBy(xpath = "//div[text()='Big Bang Company']")
	private WebElement selectCustomerOption;
	
	@FindBy(xpath = "//div[text()='- Select Project -']")
	private WebElement selectProjectDropdown;
	
	@FindBy(xpath = "//div[text()='Flight operations']")
	private WebElement selectProjectOption;
	
	@FindBy(xpath = "//div[text()='Copy']")
	private WebElement copyButton;
	
	
	
	
	
	public homepage(WebDriver driver, libraries.webActionUtil webActionUtil) {
		super(driver, webActionUtil);
		// TODO Auto-generated constructor stub
	}
	
	public void clickOnTask()
	{
		webActionUtil.clickOnElement(callsTask);
	}
	
	public void clickOnActionsButton()
	{
		webActionUtil.clickOnElement(actionsButton);
	}
	
	public void clickOnCopyTaskLink()
	{
		webActionUtil.clickOnElement(copyTaskLink);
	}
	
	public void clickOnselectCustomer()
	{
		webActionUtil.clickOnElement(selectCustomerDropdown);
		webActionUtil.clickOnElement(selectCustomerOption);
	}
	public void clickOnSelectProject()
	{
		webActionUtil.clickOnElement(selectProjectDropdown);
		webActionUtil.clickOnElement(selectCustomerOption);
	}
	
	public void clickOnCopyTaskButton()
	{
		webActionUtil.scrollToElement(copyButton);
		webActionUtil.clickOnElement(copyButton);
	}
	public void clickOnLogout()
	{
		webActionUtil.clickOnElement(logoutLink);
	}
	

}
