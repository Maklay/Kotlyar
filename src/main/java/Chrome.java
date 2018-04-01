import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Chrome extends Browser{

    private WebDriver driver;

    //public Chrome(){}
    //@Override
    public WebDriver getDriver() {
        if (driver == null){
            return new ChromeDriver();
        }
        return driver;
    }
}
