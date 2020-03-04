package WebTest;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.util.concurrent.TimeUnit;

public class BrowserSelector extends Utils {

   public  void setUpBrowser() {

       LoadProp loadProp = new LoadProp();
       String browser = loadProp.getProperty( "browser" );


        if (browser.equalsIgnoreCase( "chrome" ))
        {
            System.setProperty("webdriver.chrome.driver", "src/test/Resources/BrowserDriver/chromedriver.exe");
            driver= new ChromeDriver();
            // driver.manage().window().fullscreen();
            driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
            driver.get( loadProp.getProperty( "url" ) );
            //driver.get("https://demo.nopcommerce.com/");
        }
        else  if  (browser.equalsIgnoreCase( "firefox" ))
        {
            System.setProperty("webdriver.gecko.driver", "src/test/Resources/BrowserDriver/geckodriver.exe");
            driver= new FirefoxDriver();
            driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
           // driver.get("https://demo.nopcommerce.com/");
            driver.get( loadProp.getProperty( "url" ) );
        }
        else  if  (browser.equalsIgnoreCase( "ie" ))
        {
            System.setProperty("webdriver.ie.driver", "src/test/Resources/BrowserDriver/IEDriverServer.exe");
            DesiredCapabilities ieCapabilities = DesiredCapabilities.internetExplorer();

            ieCapabilities.setCapability("nativeEvents", false);
            ieCapabilities.setCapability("unexpectedAlertBehaviour", "accept");
            ieCapabilities.setCapability("ignoreProtectedModeSettings", true);
            ieCapabilities.setCapability("disable-popup-blocking", true);
            ieCapabilities.setCapability("enablePersistentHover", true);

            driver = new InternetExplorerDriver(ieCapabilities);
            driver.manage().window().maximize();
            driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
            driver.get( loadProp.getProperty( "url" ) );
            //driver.get("https://demo.nopcommerce.com/");
        }
        else
        {
            System.out.println("Browser name is wrong or empty :"+browser);
        }
    }

}
