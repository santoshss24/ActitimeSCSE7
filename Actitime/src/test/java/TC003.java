import pages.homepage;

public class TC003 {
	
	@Test
	public void callTask() {
		
		homepage page=new homepage(driver, webActionUtil);
		page.clickOnTask();
	}
}
