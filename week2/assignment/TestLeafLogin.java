package week2.assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class TestLeafLogin {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver C = new ChromeDriver();
		C.manage().window().maximize();
	    C.get("http://leaftaps.com/opentaps/control/main");
		C.findElement(By.id("username")).sendKeys("demosalesmanager");
		C.findElement(By.id("password")).sendKeys("crmsfa");
		C.findElement(By.className("decorativeSubmit")).click();
		C.findElement(By.linkText("CRM/SFA")).click();
		C.findElement(By.linkText("Accounts")).click();
		C.findElement(By.linkText("Create Account")).click();
		C.findElement(By.id("accountName")).sendKeys("Selenium Automation Tester2");
		WebElement In = C.findElement(By.name("industryEnumId"));
		Select InD = new Select(In);
		InD.selectByValue("IND_AEROSPACE");
		WebElement source = C.findElement(By.id("dataSourceId"));
		Select S = new Select(source);
		S.selectByIndex(11);
		WebElement team = C.findElement(By.id("initialTeamPartyId"));
		Select IT = new Select(team);
		IT.selectByVisibleText("Demo Sales Team No. 1");
		C.findElement(By.className("smallSubmit")).click();
		String title = C.getTitle();
		System.out.println(title);
		C.close();
		
		
		
		
		
		// TODO Auto-generated method stub

	}

}
