package org.example;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.tracing.opentelemetry.SeleniumSpanExporter;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class WorkingOnDropBox {
    @Test
    public void WorkingOnDropBox() throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.hyrtutorials.com/p/html-dropdown-elements-practice.html");
        Thread.sleep(3000);
        WebElement courseElement = driver.findElement(By.id("course"));
        Select courseNameDropDown = new Select(courseElement);
        List<WebElement> courseNameDropdownOptions=courseNameDropDown.getOptions();
        for(WebElement option:courseNameDropdownOptions){
            System.out.println(option.getText());
        }
        courseNameDropDown.selectByIndex(1);
        Thread.sleep(3000);
        courseNameDropDown.deselectByValue("next");
        Thread.sleep(3000);
        courseNameDropDown.deselectByVisibleText("Javascript");
        String selectedText=courseNameDropDown.getFirstSelectedOption().getText();
        System.out.println("Selected visible text -" +selectedText);
    }
}

