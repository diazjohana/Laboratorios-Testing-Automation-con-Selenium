package Edit.EducacionIt;

import org.junit.Test;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.support.ui.Select;

import java.time.Duration;

public class Laboratorio2 {
	@Test
	public void lab2_E1() {
		System.setProperty("webdriver.chrome.driver", "..\\EducacionIt\\Drivers\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.get("http://automationpractice.com/index.php?controller=authentication#account-creation");
		
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		
		// Campo Email Address
		wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("#email_create")));
		driver.findElement(By.cssSelector("#email_create")).sendKeys("correovalido1@micorreo.com");
		
		// Boton Create an Account
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[@id='SubmitCreate']")));
		driver.findElement(By.xpath("//button[@id='SubmitCreate']")).click();
		
		// Campo First Name
		wait.until(ExpectedConditions.elementToBeClickable(By.name("customer_firstname")));
		driver.findElement(By.name("customer_firstname")).sendKeys("Hector");
		
		// Campo Password
		wait.until(ExpectedConditions.elementToBeClickable(By.id("passwd")));
		driver.findElement(By.id("passwd")).sendKeys("1q2w3e4r5t6y");
		
		// Campo Date Of Birth - Mes
		Select mes = new Select(driver.findElement(By.xpath("//select[@id='months']")));
		mes.selectByValue("4");
		
		// Campo Title
		driver.findElement(By.xpath("//*[contains(@id,'gender1')]")).click();
		
		// Campo Mobile Phone
		driver.findElement(By.xpath("//input[@id='phone_mobile']")).sendKeys("1157453845");;
		
		// Campo LastName
		driver.findElement(By.id("lastname")).sendKeys("Fernandez");
		
		// Campo Address
		driver.findElement(By.cssSelector("#address1")).sendKeys("Calle 123");

		// Campo City
		driver.findElement(By.xpath("//input[@id='city']")).sendKeys("Buenos Aires");

		// Campo Zip/Postal
		driver.findElement(By.xpath("//input[@id='postcode']")).sendKeys("90210");
		
		// Campo Country
		Select pais = new Select(driver.findElement(By.cssSelector("#id_country")));
		pais.selectByValue("21");

		// Campo Date Of Birth Año
		Select anio = new Select(driver.findElement(By.xpath("//select[@id='years']")));
		anio.selectByValue("1990");
		
		// Campo Date Of Birth Dia
		Select dia = new Select(driver.findElement(By.xpath("//select[@id='days']")));
		dia.selectByIndex(2);
		
		// Campo Customer LastName 
		driver.findElement(By.id("customer_lastname")).sendKeys("Fernandez");
		
		// Campo State
		Select estado = new Select(driver.findElement(By.xpath("//select[@id='id_state']")));
		estado.selectByVisibleText("Arkansas");
		
		// Campo Register
		driver.findElement(By.xpath("//*[text()='Register']")).click();
		
		//driver.close();		
	}
}
