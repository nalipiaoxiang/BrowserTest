package cn.test;

import org.openqa.selenium.By;
import org.openqa.selenium.Proxy;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxDriverLogLevel;
import org.openqa.selenium.firefox.FirefoxOptions;

public class Test01 {
    public static void main(String[] args) {
        ChromeOptions chromeOptions = new ChromeOptions();
        Proxy proxy = new Proxy();
        proxy.setSocksVersion(5);
        proxy.setSocksProxy("127.0.0.1:1080");
        chromeOptions.setProxy(proxy);
        System.setProperty("webdriver.chrome.driver", "C:/Tools" +
                "/chromedriver_win32/chromedriver.exe");
        WebDriver driver = new ChromeDriver(chromeOptions);
        driver.get("https://www.google.com/");
        String title = driver.getTitle();
        System.out.printf(title);
        WebElement element = driver.findElement(By.className("gLFyf"));
        element.sendKeys("java");
        element.submit();

        

//        driver.close();



    }
}
