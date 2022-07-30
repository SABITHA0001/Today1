

package org.example;
        import io.github.bonigarcia.wdm.WebDriverManager;
        import org.junit.Test;
        import org.openqa.selenium.By;
        import org.openqa.selenium.WebDriver;
        import org.openqa.selenium.WebElement;
        import org.openqa.selenium.chrome.ChromeDriver;
        import org.openqa.selenium.remote.tracing.opentelemetry.SeleniumSpanExporter;

public class FindElements {
    @Test
    public void FindElements() throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://github.com/login");
        Thread.sleep(3000);
        WebElement usernameText = driver.findElement(By.id("login_field"));
        if (usernameText.isDisplayed()) {
            if (usernameText.isEnabled()) {
                usernameText.sendKeys("Sabitha");
                String enteredText = usernameText.getAttribute("value");
                System.out.println(enteredText);
                Thread.sleep(3000);
                usernameText.clear();
            }

        } else
            System.err.println("username textbox is not di9splayed");

    }
}