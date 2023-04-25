package utility;

import basetest.BaseTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import java.util.List;

public class Utilities extends BaseTest {
    public void selectMenu(String menu) {
        WebElement menu1 = driver.findElement(By.linkText(menu));
        Actions actions = new Actions(driver);
        actions.moveToElement(menu1).click().perform();

    }

    public void mouseHoverAndClick(By by) {
        Actions actions = new Actions(driver);
        WebElement desktopsTab = driver.findElement(by);
        actions.moveToElement(desktopsTab).click().perform();
    }

    /**
     * This method will get Text from element
     */

    public String getTextFromElement(By by) {

        return driver.findElement(by).getText();
    }

    public void selectByVisibleTextFromDropDown(By by, String text) {

        WebElement dropDown = driver.findElement(by);
    }


    /**
     * This method will find an element
     */

    public WebElement findElementFromWebPage(By by) {
        return driver.findElement(by);
    }

    /**
     * This method will send text to element
     */
    public void sendTextToElement(By by, String text) {

        driver.findElement(by).sendKeys(text);
    }

    public List<WebElement> findElementsFromWebPage(By by) {
        return driver.findElements(by);
    }

    /**
     * This method will click on element
     */

    public void clickOnElement(By by) {
        driver.findElement(by).click();
    }

    public void tearDown() {
        closeBrowser();
    }

}

