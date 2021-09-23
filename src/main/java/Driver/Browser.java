package Driver;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebDriver;

public  class Browser {

	public static WebDriver driver;

	public static void criarDriver() {
		driver = new BrowserFactory().createWebDriver();
	//	driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(20,TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}

	public static void navegaParaPagina(String url){
		criarDriver();
		driver.get(url);
	}

	public static void clean() {
		driver.manage().deleteAllCookies();
		driver.close();
	}
}
