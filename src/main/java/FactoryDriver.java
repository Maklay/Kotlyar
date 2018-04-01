import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;


public class FactoryDriver {
    public static synchronized WebDriver getDriver(EBrowser type){
        switch (type){
            case crome:
                return new ChromeDriver();
            case fireFox:
                return new FireFox().getDriver();
        }
        return  null;
    }
}
