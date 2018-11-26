package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.concurrent.TimeUnit;

public class SuperPage {
    protected WebDriver driver;

    public SuperPage() {
        this.driver  = new ChromeDriver();
    }

    public WebDriver getDriver() {
        return driver;
    }

    public void setUp(){
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
    }

    public void shutDown(){
        driver.quit();
    }
}
