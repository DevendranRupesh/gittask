package org.base;


import org.apache.commons.io.FileUtils;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import java.io.File;
import java.io.IOException;
import java.time.Duration;

public class Baseclass {


            public static WebDriver driver;
            public static JavascriptExecutor js;
            public static TakesScreenshot lss;
            public static Actions a;
            public static Select sc;
            public static Alert alert;




            public static  void launchbrowser(){

                driver = new ChromeDriver();

            }
            public static void maximizewindow(){
                driver.manage().window().maximize();
            }
            public static void implicitwait(int sec){
                driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(sec));
            }

            public static void geturl(String url){
                driver.get(url);
            }
            public static void getcurrenturl(){
                driver.getCurrentUrl();
            }

            public static void insert(WebElement element , String data) {
                element.sendKeys(data);

            }
            public static void Btnclick(WebElement element) {
                element.click();

            }
            public static  void log(String text) {
                System.out.println(text);
            }

            public static void javascriptexecutor( WebElement element) {
                js = (JavascriptExecutor)driver;
                js.executeScript("arguments[0].click", element);
            }


            public static void screenshots(String path) throws IOException {
                lss=(TakesScreenshot) driver;
                File source=lss.getScreenshotAs(OutputType.FILE);
                File destination=new File(path);
                FileUtils.copyFile(source, destination);
            }

            public static void radiobutton(WebElement element) {
                element.click();
            }

            public static void draganddrop(WebElement Src,WebElement dest) {
                a= new Actions(driver);
                a.dragAndDrop(Src, dest).perform();
            }

            public static String retrivetext(WebElement element) {
                return element.getText();
            }
            public  static void checkbox(WebElement checkbox) {
                checkbox.click();
            }

            public static void getSelect(WebElement element) {

                sc= new Select(element);
            }

            public static void alert() {
                alert=  driver.switchTo().alert();
            }

            public static void quitbrowser() {
                driver.quit();

            }











        }




















