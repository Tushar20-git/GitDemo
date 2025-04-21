package source;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class ResumeQI {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		WebDriver driver = new ChromeDriver();

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://psan.platinasoft.com/auth/login.aspx?orig_svc=trs&");
		driver.manage().window().maximize();

		driver.findElement(By.id("textBoxEmailId")).sendKeys("tushar.mgr@int.platinasoft.com");
		driver.findElement(By.id("textBoxPwd")).sendKeys("platina-01");
		driver.findElement(By.id("btnLogin")).click();
		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());
		Thread.sleep(8000);
		Actions a = new Actions(driver);
		WebElement mouseover = driver.findElement(By.cssSelector(".fas.fa-file-import"));
		a.moveToElement(mouseover).build().perform();

		driver.findElement(By.xpath("//span[text()='Resumes from Desktop']")).click();
		Thread.sleep(4000);

		WebElement choosefile = driver.findElement(By.xpath("//input[@type='file']"));
		choosefile.sendKeys("C:/Users/tusha/Tushar_CV.pdf");

		Thread.sleep(3000);

		WebElement dropdown = driver.findElement(By.id("ej2_dropdownlist_6_hidden"));
		Select dp = new Select(dropdown);
		dp.selectByVisibleText("Candidate (Self)");
		
		System.out.println("This is for Git Learning");
		System.out.println("This is for Git Learning1");
		System.out.println("This is for Git Learning2");
		System.out.println("This is for Git Learning3");

	}

}
