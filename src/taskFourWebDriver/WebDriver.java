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
        System.out.println("Running function : navigate() in class ChromeDriver");
    }

    public void open() {
        System.out.println("Running function : open() in class ChromeDriver");
    }

    public void close() {
        System.out.println("Running function : close() in class ChromeDriver");
    }

    public String getTitle() {
        System.out.println("Running function : getTitle() in class ChromeDriver");
        return "";
    }

    public void getScreenshot() {
        System.out.println("Running function : getScreenshot() in class ChromeDriver");
    }
}

class FirefoxDriver implements RemoteWebDriver {
    public void navigate() {
        System.out.println("Running function : navigate() in class FirefoxDriver");
    }

    public void open() {
        System.out.println("Running function : open() in class FirefoxDriver");
    }

    public void close() {
        System.out.println("Running function : close() in class FirefoxDriver");
    }

    public String getTitle() {
        System.out.println("Running function : getTitle() in class FirefoxDriver");
        return "";
    }

    public void getScreenshot() {
        System.out.println("Running function : getScreenshot() in class FirefoxDriver");
    }
}

class safariDriver implements RemoteWebDriver {
    public void navigate() {
        System.out.println("Running function : navigate() in class safariDriver");
    }

    public void open() {
        System.out.println("Running function : open() in class safariDriver");
    }

    public void close() {
        System.out.println("Running function : close() in class safariDriver");
    }

    public String getTitle() {
        System.out.println("Running function : getTitle() in class safariDriver");
        return "";
    }

    public void getScreenshot() {
        System.out.println("Running function : getScreenshot() in class safariDriver");
    }
}


