package week2.day3;


import org.openqa.selenium.By;                 
import org.openqa.selenium.WebDriver;          
import org.openqa.selenium.WebElement;         
import org.openqa.selenium.chrome.ChromeDriver; 
import org.openqa.selenium.support.ui.Select; 

public class CreateAccount {
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

       
        driver.findElement(By.linkText("Accounts")).click();

      
        driver.findElement(By.linkText("Create Account")).click();

       
        driver.findElement(By.id("accountName")).sendKeys("TestLeaf Account");

        
        driver.findElement(By.name("description"))
              .sendKeys("Selenium Automation Tester");

        
        WebElement industryDD = driver.findElement(By.name("industryEnumId"));
        Select industry = new Select(industryDD);
        industry.selectByVisibleText("ComputerSoftware");

        
        WebElement ownershipDD = driver.findElement(By.name("ownershipEnumId"));
        Select ownership = new Select(ownershipDD);
        ownership.selectByVisibleText("S-Corporation");

        
        WebElement sourceDD = driver.findElement(By.id("dataSourceId"));
        Select source = new Select(sourceDD);
        source.selectByValue("LEAD_EMPLOYEE");

        
        WebElement campaignDD = driver.findElement(By.id("marketingCampaignId"));
        Select campaign = new Select(campaignDD);
        campaign.selectByIndex(6);


        WebElement stateDD = driver.findElement(By.id("generalStateProvinceGeoId"));
        Select state = new Select(stateDD);
        state.selectByValue("TX");

       
        driver.findElement(By.className("smallSubmit")).click();

       
        String accountName = driver.findElement(By.xpath("//span[@class='tabletext']")).getText();
        System.out.println("✅ Account created: " + accountName);

        
        driver.quit();
    }
}
