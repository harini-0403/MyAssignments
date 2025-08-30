package facebook.automation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class FacebookRegistration {
    public static void main(String[] args) throws InterruptedException {

        // Step 1: Set ChromeDriver path
        System.setProperty("webdriver.chrome.driver", 
            "C:\\chromedriver-win32\\chromedriver.exe"); // update path if needed

        // Step 2: Launch Chrome browser
        WebDriver driver = new ChromeDriver();

        // Step 3: Open Facebook
        driver.get("https://en-gb.facebook.com/");
        driver.manage().window().maximize();

        // Step 4: Click Create new account
        driver.findElement(By.xpath("//a[text()='Create new account']")).click();
        Thread.sleep(2000);

        // Step 5: Fill personal details
        driver.findElement(By.name("firstname")).sendKeys("John");
        driver.findElement(By.name("lastname")).sendKeys("Doe");
        driver.findElement(By.name("reg_email__")).sendKeys("johndoe@example.com");
        driver.findElement(By.name("reg_email_confirmation__")).sendKeys("johndoe@example.com");
        driver.findElement(By.id("password_step_input")).sendKeys("SecurePass123");

        // Step 6: Select Date of Birth
        new Select(driver.findElement(By.id("day"))).selectByVisibleText("15");
        new Select(driver.findElement(By.id("month"))).selectByValue("6"); // June
        new Select(driver.findElement(By.id("year"))).selectByVisibleText("1995");

        // Step 7: Select Gender
        driver.findElement(By.xpath("//label[text()='Male']/following-sibling::input")).click();

        // Step 8: Print confirmation
        System.out.println("✅ Facebook registration form filled successfully.");

        // Step 9: Wait & close browser
        Thread.sleep(5000);
        driver.quit();
    }
}
