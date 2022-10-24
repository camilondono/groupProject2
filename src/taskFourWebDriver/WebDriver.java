package taskFourWebDriver;

public interface WebDriver {

    void open();
    void close();
    String getTitle();
}

interface TakesScreenshot {
    void getScreenshot();
}

interface RemoteWebDriver extends WebDriver, TakesScreenshot {
    void navigate();
}

class ChromeDriver implements RemoteWebDriver {
    public void navigate() {
        System.out.println("navigate() in class ChromeDriver");
    }

    public void open() {
        System.out.println("open() in class ChromeDriver");
    }

    public void close() {
        System.out.println("close() in class ChromeDriver");
    }

    public String getTitle() {
        System.out.println("getTitle() in class ChromeDriver");
        return "";
    }

    public void getScreenshot() {
        System.out.println("getScreenshot() in class ChromeDriver");
    }
}

class FirefoxDriver implements RemoteWebDriver {
    public void navigate() {
        System.out.println("navigate() in class FirefoxDriver");
    }

    public void open() {
        System.out.println("open() in class FirefoxDriver");
    }

    public void close() {
        System.out.println("close() in class FirefoxDriver");
    }

    public String getTitle() {
        System.out.println("getTitle() in class FirefoxDriver");
        return "";
    }

    public void getScreenshot() {
        System.out.println("getScreenshot() in class FirefoxDriver");
    }
}

class safariDriver implements RemoteWebDriver {
    public void navigate() {
        System.out.println("navigate() in class safariDriver");
    }

    public void open() {
        System.out.println("open() in class safariDriver");
    }

    public void close() {
        System.out.println("close() in class safariDriver");
    }

    public String getTitle() {
        System.out.println("getTitle() in class safariDriver");
        return "";
    }

    public void getScreenshot() {
        System.out.println("getScreenshot() in class safariDriver");
    }
}


