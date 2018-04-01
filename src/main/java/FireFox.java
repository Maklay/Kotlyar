import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FireFox extends Browser{

    private WebDriver driver;

    //public FireFox(){


    public WebDriver getDriver(){
        if (driver == null){
            return new FirefoxDriver();
        }
        return driver;
    }

}
