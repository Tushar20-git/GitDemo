package source;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();   
		driver.get("https://www.amazon.in/");
		Actions a= new Actions(driver);
		a.moveToElement(driver.findElement(By.id("twotabsearchtextbox"))).click().
		keyDown(Keys.SHIFT).sendKeys("hello").build().perform();
		
		System.out.println("This is develop Branch");
		System.out.println("This is develop Branch2");
	}

}
