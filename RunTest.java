package week1.day1;

public class RunTest {
    public static void main(String[] args) {
        
        // Object for Superclass
        TestData test = new TestData();
        test.enterCredentials();
        test.navigateToHomePage();
        
        // Object for Subclass
        LoginTestData login = new LoginTestData();
        login.enterUsername();
        login.enterPassword();
        
        // Inherited methods from superclass
        login.enterCredentials();
        login.navigateToHomePage();
    }
}
