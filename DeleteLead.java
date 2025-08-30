package week2.day3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DeleteLead {
    public static void main(String[] args) throws InterruptedException {
        
        
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
        driver.findElement(By.linkText("Find Leads")).click();
        
       
        driver.findElement(By.xpath("//span[text()='Phone']")).click();
        
       
        driver.findElement(By.name("phoneNumber")).sendKeys("99");
        
        
        driver.findElement(By.xpath("//button[text()='Find Leads']")).click();
        Thread.sleep(2000); // wait for results to load
        String leadID = driver.findElement(By.xpath(
            "//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a")).getText();
        System.out.println("Captured Lead ID: " + leadID);
        
        
        driver.findElement(By.xpath(
            "//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a")).click();
        
        
        driver.findElement(By.linkText("Delete")).click();
        
     
        driver.findElement(By.linkText("Find Leads")).click();
        
   
        driver.findElement(By.name("id")).sendKeys(leadID);
        driver.findElement(By.xpath("//button[text()='Find Leads']")).click();
        Thread.sleep(2000);
        
       
        String message = driver.findElement(By.className("x-paging-info")).getText();
        if(message.equals("No records to display")) {
            System.out.println("✅ Lead deleted successfully.");
        } else {
            System.out.println("❌ Lead not deleted.");
        }
        
       
        driver.quit();
    }
}
