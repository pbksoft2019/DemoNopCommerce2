package WebTest;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import org.junit.Test;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import static com.sun.deploy.cache.Cache.copyFile;

public class Hooks extends Utils
{
    //private String timestamp = new SimpleDateFormat( "yyyy.MM.dd.HH.mm.ss" ).format( new Date(  ) );
    BrowserSelector browserSelector = new BrowserSelector();

    @Before
    public void openBrowser()
    {
        browserSelector.setUpBrowser();
    }

    @After
    public void closeBrowser(Scenario scenario) throws IOException
    {
        if (scenario.isFailed())
        {
            String screenShotName = scenario.getName().replaceAll( "[.,:;?!]", "")+ timeStamp()+".png";
            try
            {
                File sourcePath = ((TakesScreenshot) driver).getScreenshotAs( OutputType.FILE );
                File destinationPath = new File( System.getProperty( "user.dir" ) + "/target/Destination/screenshots/" + screenShotName );
                copyFile(sourcePath,destinationPath);
                scenario.write( "!!!!!!!Scenario Failed....!!!!!! Please see attached screenshot for the error/issue" );
                scenario.embed( ((TakesScreenshot)driver).getScreenshotAs( OutputType.BYTES ),"image/png");
            } catch (IOException e){
            }
            //driver.quit();
        }
    }
}
