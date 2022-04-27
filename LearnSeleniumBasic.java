package Week2.Day1;

import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LearnSeleniumBasic {
public static void main(String[] args) {
	
	//System.setProperty("webdriver.chrome.driver","C:\\Program Files (x86)\\Google\\Chrome\\Application\\chrome.exe");
	//ChromeDriver obj=new ChromeDriver();
	
	WebDriverManager.chromedriver().setup();
	ChromeDriver obj=new ChromeDriver();
	obj.get("http://leaftaps.com/opentaps/control/main");
	obj.manage().window().maximize();
	obj.close();
}

}
