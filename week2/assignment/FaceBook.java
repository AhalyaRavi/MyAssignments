package week2.assignment;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class FaceBook {

	@SuppressWarnings("deprecation")
	public static void main(String[] args) {
		ChromeDriver c = new ChromeDriver();
		c.manage().window().maximize();
		c.get("https://en-gb.facebook.com/");
		c.findElement(By.xpath("//a[@data-testid='open-registration-form-button']")).click();
		c.manage().timeouts().implicitlyWait(50,TimeUnit.SECONDS);	
		c.findElement(By.xpath("//input[@name='firstname']")).sendKeys("ahalya");
		c.findElement(By.xpath("//input[@name='lastname']")).sendKeys("Ravi");
		c.findElement(By.xpath("//input[@name='reg_email__']")).sendKeys("ahalya.rravichandran@gmail.com");
		c.findElement(By.xpath("//input[@name='reg_passwd__']")).sendKeys("ahalya@3");
		WebElement day = c.findElement(By.xpath("//select[@id='day']"));
		Select d = new Select(day);
		d.selectByIndex(3);
		WebElement month = c.findElement(By.xpath("//select[@name='birthday_month']"));
		Select m = new Select(month);
		m.selectByVisibleText("Oct");
        WebElement year = c.findElement(By.xpath("//select[@name='birthday_year']"));
        Select y = new Select(year);
        y.selectByValue("1998");
        c.findElement(By.xpath("//label[@for='sex'][1]")).click();
        
		
		
		
		
		
		
		// TODO Auto-generated method stub

	}

}
