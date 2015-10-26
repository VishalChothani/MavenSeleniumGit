

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;


public class TestCase {
	
	@Test
	public void OpenSub(){
		WebDriver driver = new FirefoxDriver();
		driver.get("http://subcontract.com");
		driver.manage().window().maximize();
		
		Assert.assertTrue(driver.getTitle().contains("Subcontract"));
		
		driver.close();
	}

}
