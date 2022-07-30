package org.example;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class FirstDisplay {
    @Test
    public void FirstDisplay() {
        WebDriverManager.chromedriver().setup();
            WebDriver driver = new ChromeDriver();
            driver.manage().window().maximize();
            driver.get("http://google.com");
           driver.findElement(By.className("")).sendKeys("Welcome search ");

        }
    }




