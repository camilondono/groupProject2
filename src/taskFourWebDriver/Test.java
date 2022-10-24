package taskFourWebDriver;

public class Test {

    public static void main(String[] args) {
        ChromeDriver cd = new ChromeDriver();
        FirefoxDriver fd = new FirefoxDriver();
        safariDriver sd = new safariDriver();

        cd.open();
        cd.close();
        cd.getTitle();
        cd.getScreenshot();
        cd.navigate();

        System.out.println();

        fd.open();
        fd.close();
        fd.getTitle();
        fd.getScreenshot();
        fd.navigate();

        System.out.println();

        sd.open();
        sd.close();
        sd.getTitle();
        sd.getScreenshot();
        sd.navigate();


    }
}
