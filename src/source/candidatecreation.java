package source;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class candidatecreation {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		WebDriver driver= new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://psan.platinasoft.com/auth/login.aspx?orig_svc=trs&");
		driver.manage().window().maximize();
		
		driver.findElement(By.id("textBoxEmailId")).sendKeys("tushar.mgr@int.platinasoft.com");
		driver.findElement(By.id("textBoxPwd")).sendKeys("platina-01");
		driver.findElement(By.id("btnLogin")).click();
		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());
		
		Actions a= new Actions(driver);
		WebElement mouseover=driver.findElement(By.cssSelector(".fa.fa-plus-square"));
		a.moveToElement(mouseover).build().perform();
		
		WebElement c= driver.findElement(By.xpath("//span[text()='Candidate']"));
		a.moveToElement(c).build().perform();
		
		Thread.sleep(2000);
		WebElement pc= driver.findElement(By.xpath("//span[text()='Public Candidate']"));
		pc.click();
		
		Thread.sleep(3000);
		//driver.quit();
		//driver.close();
		
	

	}

}
