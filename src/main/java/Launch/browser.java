package Launch;
import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;  

public class browser {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		//system property for chrome
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\STA0162_1\\eclipse-workspace\\Movie\\target\\chromedriver.exe");
		WebDriver driver = new ChromeDriver ();		
		//Launch chrome browser 
		//driver.get("www.google.com");
	//	driver.findElement(By.className("@gLFyf gsfi")).sendKeys("pushpa full movie imdb page");
		//driver.findElement(By.xpath(xpath=//div[@id="_7uN3YraDGbaaseMPlNa6gAk1"]).click();
		driver.findElement(By.name("q")).sendKeys("pushpa full movie imdb page");
		//driver.findElement(By.xpath("//input[@id='_7uN3YraDGbaaseMPlNa6gAk1']")).sendKeys("pushpa full movie imdb page");	
		driver.findElement(By.id("@sb_form_go id")).click();
		Thread.sleep(2000);
		driver.navigate().to("https://www.chrome.com/");		
	//	driver.findElement(By.className("@gLFyf gsfi")).sendKeys("pushpa full movie wiki page");
		driver.findElement(By.xpath("//input[@id='_7uN3YraDGbaaseMPlNa6gAk1']")).sendKeys("pushpa full movie imdb page");	
		driver.findElement(By.id("bpage")).click();
		Thread.sleep(2000);
		String Date1= driver.findElement(By.id("Release date")).getText();
		String Country1= driver.findElement(By.id("Country")).getText();
		Thread.sleep(2000);		
		String Date2= driver.findElement(By.id("Release date")).getText();
		String Country2= driver.findElement(By.id("Country")).getText();
		Thread.sleep(2000);
		
		if( Date1.equals(Date2) & Country1.equals(Country2))
		{
			System.out.println("pass");
		}
		else
		{
			System.out.println("Fail");
		}
	}

	

	private static Object getText() {
		// TODO Auto-generated method stub
		return null;
	}

	private static Object sendkeys(String string) {
		// TODO Auto-generated method stub
		return null;
	
	}
}
try  
{  
data=i/j; //may throw exception   
}
}



