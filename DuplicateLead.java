package week2.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DuplicateLead {

	public static void main(String[] args) {
		
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://leaftaps.com/opentaps/control/main");
		
		WebElement WE= driver.findElement(By.id("username"));
		WE.sendKeys("DemoSalesManager");
		
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		
		driver.findElement(By.className("decorativeSubmit")).click();
		
		driver.findElement(By.linkText("CRM/SFA")).click();
		
		driver.findElement(By.linkText("Create Lead")).click();
		
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys("SaraComp");
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys("sara");
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys("lax");
		
		driver.findElement(By.id("createLeadForm_departmentName")).sendKeys("sales");
		driver.findElement(By.id("createLeadForm_description")).sendKeys("New sales lead for new products from south zone");
		driver.findElement(By.id("createLeadForm_primaryEmail")).sendKeys("newleads@sales.com");
		
		//driver.findElement(By.className("")).
		
		WebElement wee=driver.findElement(By.id("createLeadForm_generalStateProvinceGeoId"));
		Select Sel=new Select(wee);
		
		Sel.selectByVisibleText("New York");
		
		driver.findElement(By.className("smallSubmit")).click();
		System.out.println(driver.getTitle());
		
		driver.findElement(By.linkText("Duplicate Lead")).click();
		
		driver.findElement(By.id("createLeadForm_companyName")).clear();
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys("Sara Sister Concern");
		
		driver.findElement(By.id("createLeadForm_firstName")).clear();
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Saran");
		
		driver.findElement(By.className("smallSubmit")).click();
		System.out.println(driver.getTitle());
		
		
	}
}
