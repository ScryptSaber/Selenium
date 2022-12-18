import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Demo1 {
    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "C:\\Users\\ASUS\\Downloads\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("http://secure.smartbearsoftware.com/samples/TestComplete12/WebOrders/Login.aspx?ReturnUrl=%2fsamples%2ftestcomplete12%2fweborders%2fProcess.aspx");

        WebElement we =driver.findElement(By.id("ctl00_MainContent_username"));
        we.sendKeys("Tester");
        Thread.sleep(3000);

        driver.findElement(By.name("ctl00$MainContent$password")).sendKeys("test");
        Thread.sleep(3000);

        driver.findElement(By.className("button")).click();
        Thread.sleep(3000);

        driver.quit();


    }
}
