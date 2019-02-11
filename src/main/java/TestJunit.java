import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestJunit {
//
//    @Test
//    public void testaVerdadeiro(){
//        Assert.assertTrue(false);
//        System.out.println("Teste");
//        System.setProperty("webdriver.chrome.driver","CaminhoSeuWebDriver");
//        WebDriver driver = new ChromeDriver();
//    }

    @Test
    public void testeLoja() {

      //  System.setProperty("webdriver.chrome.driver","/Users/danielsimiao/Documents/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.netshoes.com.br/");

        WebElement barraPesquisa;
        barraPesquisa = driver.findElement(By.xpath("//*[@id=\"search-input\"]"));
        barraPesquisa.sendKeys("Basquete");

        WebElement lupa;
        lupa = driver.findElement(By.xpath("//section/form/div/button"));
        lupa.click();

        System.out.println("");

        driver.close();
    }
}
