package facebook.automation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class FacebookRegistration {
    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "C:\\chromedriver\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        driver.get("https://en-gb.facebook.com/");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(java.time.Duration.ofSeconds(10));

        driver.findElement(By.xpath("//a[text()='Create new account']")).click();
        Thread.sleep(2000);

        driver.findElement(By.name("firstname")).sendKeys("John");
        driver.findElement(By.name("lastname")).sendKeys("Doe");
        driver.findElement(By.name("reg_email__")).sendKeys("johndoe@example.com");
        driver.findElement(By.name("reg_email_confirmation__")).sendKeys("johndoe@example.com");
        driver.findElement(By.id("password_step_input")).sendKeys("SecurePass123");

        new Select(driver.findElement(By.id("day"))).selectByVisibleText("15");
        new Select(driver.findElement(By.id("month"))).selectByValue("6");
        new Select(driver.findElement(By.id("year"))).selectByVisibleText("1995");

        driver.findElement(By.xpath("//label[text()='Male']/following-sibling::input")).click();

        Thread.sleep(5000);
        driver.quit();
    }
}
