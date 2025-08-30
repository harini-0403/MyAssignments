package week2.day3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class EditLead {
    public static void main(String[] args) {
        
       
        System.setProperty("webdriver.chrome.driver",
            "C:\\chromedriver-win32\\chromedriver.exe");

        
        WebDriver driver = new ChromeDriver();
        
     
        driver.get("http://leaftaps.com/opentaps/");
        driver.manage().window().maximize();
        
        
        driver.findElement(By.id("username")).sendKeys("Demosalesmanager");
        driver.findElement(By.id("password")).sendKeys("crmsfa");
        driver.findElement(By.className("decorativeSubmit")).click();
        
        
        driver.findElement(By.linkText("CRM/SFA")).click();
        
        
        driver.findElement(By.linkText("Leads")).click();
        
       
        driver.findElement(By.linkText("Create Lead")).click();
        
        
        driver.findElement(By.id("createLeadForm_companyName")).sendKeys("TestLeaf");
        driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Harini");
        driver.findElement(By.id("createLeadForm_lastName")).sendKeys("Gopal");
        driver.findElement(By.id("createLeadForm_firstNameLocal")).sendKeys("Hari");
        driver.findElement(By.id("createLeadForm_departmentName")).sendKeys("QA Automation");
        driver.findElement(By.id("createLeadForm_description")).sendKeys("Selenium Lead Creation");
        driver.findElement(By.id("createLeadForm_primaryEmail")).sendKeys("harini@testleaf.com");

        // Select State/Province dropdown
        WebElement stateDD = driver.findElement(By.id("createLeadForm_generalStateProvinceGeoId"));
        Select state = new Select(stateDD);
        state.selectByVisibleText("New York");
        
       
        driver.findElement(By.className("smallSubmit")).click();
        
        
        driver.findElement(By.linkText("Edit")).click();
        
        
        driver.findElement(By.id("updateLeadForm_description")).clear();
        
       
        driver.findElement(By.id("updateLeadForm_importantNote")).sendKeys("Updated via Selenium Automation");
        
      
        driver.findElement(By.className("smallSubmit")).click();
        
        
        String title = driver.getTitle();
        System.out.println("✅ Page Title after Update: " + title);
        
        
        driver.quit();
    }
}
