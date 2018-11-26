package Tests;

import java.util.regex.Pattern;
import java.util.concurrent.TimeUnit;

import Pages.MainPage;
import Pages.SuperPage;
import org.testng.annotations.*;
import static org.testng.Assert.*;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.*;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class SuperTest {
    SuperPage page = new SuperPage();
    private boolean acceptNextAlert = true;
    private StringBuffer verificationErrors = new StringBuffer();
    protected MainPage mainPage = new MainPage();

    @BeforeClass(alwaysRun = true)
    public void setUp() throws Exception {
        page.setUp();
    }

    @AfterClass(alwaysRun = true)
    public void tearDown() throws Exception {
        page.shutDown();
        String verificationErrorString = verificationErrors.toString();
        if (!"".equals(verificationErrorString)) {
            fail(verificationErrorString);
        }
    }

}
