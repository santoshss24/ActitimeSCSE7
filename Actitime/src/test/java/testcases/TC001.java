package testcases;

import org.testng.annotations.Test;

import pages.homepage;

public class TC001 extends basetest 
{
	
	@Test
	public void copyTaskToProject()
	{
		homepage page=new homepage(driver, webActionUtil);
		page.clickOnTask();
		page.clickOnActionsButton();
		page.clickOnCopyTaskLink();
		page.clickOnselectCustomer();
		page.clickOnSelectProject();
		page.clickOnCopyTaskButton();
		
	}

}
