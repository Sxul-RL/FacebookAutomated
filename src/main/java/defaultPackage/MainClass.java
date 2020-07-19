package defaultPackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class MainClass {

	public static void main(String[] args) {
		
		String homePage = "https://www.facebook.com";
		System.out.println("Registering Driver");
		System.setProperty("webdriver.chrome.driver","C:\\WebDriverChrome\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		System.out.println("Opening Facebook Page " + homePage);
		driver.manage().window().maximize();
		driver.navigate().to(homePage);
		
		//Correo
		//*[@id="email"]		
		//Contraseña
		
		//*[@id="pass"]
		
		//Boton
		//*[@id="u_0_b"]
		
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("Closing Page");
		driver.close();
		driver.quit();
	}
	
}
