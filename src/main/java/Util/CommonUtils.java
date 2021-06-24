package Util;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.io.*;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

public class CommonUtils {
        public static WebDriver driver;
        public void openBrowser() throws IOException
        {
            String browserObj = readPropertyFile("browser");
            switch (browserObj)
            {

                case "chrome":
                    WebDriverManager.chromedriver().setup();
                    driver = new ChromeDriver();
                    break;
                case "Firefox":
                    WebDriverManager.firefoxdriver().setup();
                    driver = new FirefoxDriver();
                    break;
                default:
                    WebDriverManager.edgedriver().setup();
                    driver = new EdgeDriver();
                    break;
        }
            }

        public void closeBrowser()
        {
            driver.quit();
        }
        public String readPropertyFile(String key) throws IOException {
            FileInputStream fis = new FileInputStream("C:\\Aparna\\Automation\\NHSBSA1\\src\\main\\resources\\Properties\\data.properties");
            Properties properties = new Properties();
            properties.load(fis);
            return properties.getProperty(key);
        }
        public void waitForTime(int waitTime){
            driver.manage().timeouts().implicitlyWait(waitTime, TimeUnit.SECONDS);
        }
        public void waitForElement(WebElement element, int maxTime){
            WebDriverWait wait = new WebDriverWait(driver, maxTime);
            wait.until(ExpectedConditions.visibilityOf(element));
        }
        public void mouseOver(WebElement element)
        {
            Actions actions = new Actions(driver);
            actions.moveToElement(element).build().perform();
        }



    }

