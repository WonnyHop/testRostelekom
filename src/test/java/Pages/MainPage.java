package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class MainPage extends SuperPage {
    public MainPage() {
        super();
    }
    public void gotoMainPage(){
        driver.get("https://www.google.ru");
    }
}
