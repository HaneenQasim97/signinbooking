import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ReadytoUse {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty( "webdriver.chrome.driver", "C:\\Users\\dell\\OneDrive\\Desktop\\New folder (4)\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https:\\www.booking.com");
		driver.findElement(By.className("js-header-login-link")).click();
        Thread.sleep(3000);
        driver.findElement(By.className("ZMH9h0HCYH9GGNxHnXGJ")).sendKeys("haneenqassem123@gmail.com");
        driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/div/div[2]/div[1]/div/div/div/div/div/div/form/div[3]/button")).click();
        Thread.sleep(3000);
        driver.findElement(By.className("ZMH9h0HCYH9GGNxHnXGJ")).sendKeys("H0799379833k");
        driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/div/div[2]/div[1]/div/div/div/div/div/div/form/button")).click();
        
	}

}
