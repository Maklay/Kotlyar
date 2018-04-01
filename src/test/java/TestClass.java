import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

public class TestClass {
    @Test
    public void TetovieM(){


        WebDriver driver = new FirefoxDriver();
        driver.manage().window().maximize();
        driver.get("http://www.i.ua/");
        driver.findElement(By.name("login")).click();
        driver.findElement(By.name("login")).clear();
        driver.findElement(By.name("login")).sendKeys("tvma");
        driver.findElement(By.name("pass")).clear();
        driver.findElement(By.name("pass")).sendKeys("dnepr1234");
        driver.findElement(By.xpath("//body/div[3]/div")).click();
        driver.findElement(By.xpath("//input[@value='Войти']")).click();

    }
}
