package Driver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.htmlunit.HtmlUnitDriver;

public class BrowserFactory {

    private  static final String caminhoDriver = System.getProperty("user.dir") + "\\src\\driver\\chromedriver.exe";

    public WebDriver createWebDriver() {
        String webdriver = System.getProperty("browser", "chrome");
        switch (webdriver) {
            case "chrome":
                return initChromeDriver();
            default:
                return new HtmlUnitDriver();
        }
    }

    private WebDriver initChromeDriver() {
        System.setProperty("webdriver.chrome.driver", caminhoDriver);
        return new ChromeDriver();
    }
}
