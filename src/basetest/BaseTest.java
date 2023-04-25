package basetest;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class BaseTest {
    public static WebDriver driver; // Webdrive variable defined std

    public void openBrowser(String baseUrl) { //setup webbrowser std
        driver = new ChromeDriver(); // getting chrome browser
        driver.get(baseUrl); //  getting the up url
        driver.manage().window().maximize(); //screen size
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20)); //

    }

    public void closeBrowser() {

        driver.quit(); // browser closed

    }
}