package WebDriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DownloadfileExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("Webdriver.chrome.driver", "c://chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://eternallybored.org/misc/wget/");
		WebElement ele =driver.findElement(By.linkText("ZIP"));
		String path =ele.getAttribute("href");
		String wget_command= "cmd /c C:\\wget.exe -P E://d --no-check-certificate "+path;
		try {
			Process exce= Runtime.getRuntime().exec(wget_command);
			int exitVal= exce.waitFor();		
		}catch(Exception ex){
			System.out.println(ex.getMessage());
		}
}

}
