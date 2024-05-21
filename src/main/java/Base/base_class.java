package Base;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.*;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import java.awt.*;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.IOException;

public class base_class {
    public static WebDriver driver;
    public static JavascriptExecutor jse;
    public static JavascriptExecutor jse1;
    public static Select se;
    public static Robot rt;
    public static Actions ac;






    public static void Launchurl(WebDriver driver, String url){
        driver.get(url);
    }


    public static void select(WebDriver driver, WebElement el, String value){
        se=new Select(el);
        se.selectByValue(value);
    }

    public static void selectind(WebDriver driver,WebElement el, int value){
        se=new Select(el);
        se.selectByIndex(value);
    }
    public static void selecttext(WebDriver driver, WebElement el, String value){
        se=new Select(el);
        se.selectByVisibleText(value);
    }
    public static void deselectall( WebElement el, String value){
        se= new Select(el);
        se.deselectAll();
    }
    public static void maxview(WebDriver driver){
        driver.manage().window().maximize();
    }

    public static void minview(WebDriver driver){
        driver.manage().window().minimize();
    }

    public static void alertaccept(WebDriver driver){
        driver.switchTo().alert().accept();
    }

    public static void alertdismiss(WebDriver driver){
        driver.switchTo().alert().dismiss();
    }

    public static void alertgettext(WebDriver driver){
        driver.switchTo().alert().getText();
    }
    public static void clear(WebElement el){
        el.clear();
    }
    public static void click(WebElement el){
        el.click();
    }
    public static void sendkey(WebElement el, String string){
        el.sendKeys(string);
    }
    public static void getext(WebElement el){
        el.getText();
    }
    public static void seleted(WebElement el){
        el.isSelected();
    }

    public static void switchto (WebDriver driver, WebElement ele){
        driver.switchTo().frame(ele);
    }

    public static void switchtodef (WebDriver driver){
        driver.switchTo().defaultContent();
    }

    public static void scrollup ( WebElement el){
        jse = (JavascriptExecutor) driver;
        jse.executeScript("arguments[0].scrollIntoView()",el);
    }
    public static void scrolldown ( WebElement el){
        jse1 = (JavascriptExecutor) driver;
        jse1.executeScript("arguments[0].scrollIntoView()",el);
    }
    public static void jvsenskeys ( WebElement el){
        jse = (JavascriptExecutor) driver;
        jse.executeScript("arguments[0].value=sendkeys",el);
    }
    public static void actionclick (WebDriver driver){
        ac.click().perform();
    }
    public static void actiondoubleclick(WebDriver driver) {
        ac.doubleClick().perform();
    }
    public static void movetoele(WebDriver driver,WebElement ele) {

        ac.moveToElement(ele).perform();
    }

    public static void  enter(WebDriver driver) throws AWTException {
        rt = new Robot();
        rt.keyPress(KeyEvent.VK_ENTER);
        rt.keyRelease(KeyEvent.VK_ENTER);
    }
    public static void  down(WebDriver driver) throws AWTException {
        rt = new Robot();
        rt.keyPress(KeyEvent.VK_DOWN);
//        r.keyPress(KeyEvent.VK_DOWN);
        rt.keyRelease(KeyEvent.VK_DOWN);}
    public static void  up(WebDriver driver) throws AWTException {
        rt = new Robot();
        rt.keyPress(KeyEvent.VK_UP);
        rt.keyRelease(KeyEvent.VK_UP);}
    public static void  tab(WebDriver driver) throws AWTException {
        rt = new Robot();
        rt.keyPress(KeyEvent.VK_TAB);
        rt.keyRelease(KeyEvent.VK_TAB);}

    public static void copy_paste(WebDriver driver) throws AWTException {
        rt = new Robot();
        rt.keyPress(KeyEvent.VK_CONTROL);
        rt.keyPress(KeyEvent.VK_V);
        rt.keyRelease(KeyEvent.VK_CONTROL);
        rt.keyRelease(KeyEvent.VK_V);
    }

    public static void delete (WebDriver driver) throws AWTException {
        rt = new Robot();
        rt.keyPress(KeyEvent.VK_DELETE);
        rt.keyRelease(KeyEvent.VK_DELETE);
    }
    public static void slep(WebDriver driver) throws InterruptedException {
        Thread.sleep(2000);
    }
    public static void impilcitwait(WebDriver driver){

        driver.manage().timeouts();
    }

    public static void takesnap(WebDriver driver ,String Name) throws IOException {
        TakesScreenshot Scrshot = (TakesScreenshot) driver;
        File s = Scrshot.getScreenshotAs(OutputType.FILE);
        File d = new File("C:\\Users\\Cape-ElecTric\\IdeaProjects\\Magneto\\src\\test\\Screenshot"+ Name + ".png");
        FileUtils.copyFile(s,d);
    }



}
