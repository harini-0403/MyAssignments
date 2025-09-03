package browserdemo;

public class Browser {
    String browserName;
    String browserVersion;

    // Constructor
    public Browser(String name, String version) {
        this.browserName = name;
        this.browserVersion = version;
    }

    // Common methods
    public void openURL() {
        System.out.println(browserName + " v" + browserVersion + " -> URL loaded successfully");
    }

    public void closeBrowser() {
        System.out.println(browserName + " -> Browser closed successfully");
    }

    public void navigateBack() {
        System.out.println(browserName + " -> Navigated back successfully");
    }
}
