package testcases;

import org.testng.annotations.Test;

import pages.homepage;

public class TC002 extends basetest 
{
	@Test
	public void createuser()
	{
		homepage page=new homepage(driver, webActionUtil);
		page.clickOnTask();
		page.clickOnActionsButton();
		page.clickOnCopyTaskLink();
		page.clickOnselectCustomer();
		
		
		
	}

}
