// Generated by Selenium IDE
package edu.pitt.cs;
import org.openqa.selenium.chrome.ChromeOptions;

import org.junit.Test;
import org.junit.Before;
import org.junit.After;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.core.IsNot.not;
import org.junit.FixMethodOrder;
import org.junit.runners.MethodSorters;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Alert;
import org.openqa.selenium.Keys;
import java.util.*;
import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;
@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class D3Test {
  private WebDriver driver;
  private Map<String, Object> vars;
  JavascriptExecutor js;
  @Before

  public void setUp() {
    ChromeOptions options = new ChromeOptions();
    options.addArguments("--headless");
    driver = new ChromeDriver(options);
    
    //driver = new ChromeDriver();
    js = (JavascriptExecutor) driver;
    vars = new HashMap<String, Object>();
  }
  @After
  public void tearDown() {
    driver.quit();
  }
  @Test
  public void tEST1LINKS() {
    // Test name: TEST-1-LINKS
    // Step # | name | target | value
    // 1 | open | https://cs1632.appspot.com/reset | 
    driver.get("http://localhost:8080/");
    // 2 | setWindowSize | 830x824 | 
    driver.manage().window().setSize(new Dimension(830, 824));
    // 3 | runScript | document.cookie = "1=false";document.cookie = "2=false";document.cookie = "3=false"; | 
    js.executeScript("document.cookie = \"1=false\";document.cookie = \"2=false\";document.cookie = \"3=false\";");
    // 4 | assertElementPresent | xpath=//a[@href='/reset'] | 
    {
      List<WebElement> elements = driver.findElements(By.xpath("//a[@href=\'/reset\']"));
      assert(elements.size() > 0);
    }
    // 5 | click | xpath=//a[@href='/reset'] | 
    driver.findElement(By.xpath("//a[@href=\'/reset\']")).click();
  }
  @Test
  public void tEST2RESET() {
    // Test name: TEST-2-RESET
    // Step # | name | target | value
    // 1 | open | https://cs1632.appspot.com/ | 
    driver.get("http://localhost:8080/");
    // 2 | runScript | document.cookie = "1=false";document.cookie = "2=false";document.cookie = "3=false"; | 
    js.executeScript("document.cookie = \"1=false\";document.cookie = \"2=false\";document.cookie = \"3=false\";");
    // 3 | runScript | document.cookie = "1=true";document.cookie = "2=true";document.cookie = "3=true"; | 
    js.executeScript("document.cookie = \"1=true\";document.cookie = \"2=true\";document.cookie = \"3=true\";");
    // 4 | click | linkText=Reset | 
    driver.findElement(By.linkText("Reset")).click();
    // 5 | assertText | id=cat-id1 | ID 1. Jennyanydots
    assertThat(driver.findElement(By.id("cat-id1")).getText(), is("ID 1. Jennyanydots"));
    // 6 | assertText | id=cat-id2 | ID 2. Old Deuteronomy
    assertThat(driver.findElement(By.id("cat-id2")).getText(), is("ID 2. Old Deuteronomy"));
    // 7 | assertText | id=cat-id3 | ID 3. Mistoffelees
    assertThat(driver.findElement(By.id("cat-id3")).getText(), is("ID 3. Mistoffelees"));
  }
  @Test
  public void tEST3CATALOG() {
    // Test name: TEST-3-CATALOG
    // Step # | name | target | value
    // 1 | open | https://cs1632.appspot.com/ | 
    driver.get("http://localhost:8080/");
    // 2 | setWindowSize | 830x824 | 
    driver.manage().window().setSize(new Dimension(830, 824));
    // 3 | runScript | document.cookie = "1=false";document.cookie = "2=false";document.cookie = "3=false"; | 
    js.executeScript("document.cookie = \"1=false\";document.cookie = \"2=false\";document.cookie = \"3=false\";");
    // 4 | click | linkText=Catalog | 
    driver.findElement(By.linkText("Catalog")).click();
    // 5 | click | css=li:nth-child(3) > img | 
    driver.findElement(By.cssSelector("li:nth-child(3) > img")).click();
    // 6 | storeAttribute | css=li:nth-child(3) > img@src | img
    {
      WebElement element = driver.findElement(By.cssSelector("li:nth-child(3) > img"));
      String attribute = element.getAttribute("src");
      vars.put("img", attribute);
    }
    // 7 | echo | ${img} | 
    System.out.println(vars.get("img").toString());
    // 8 | assert | img | /images/cat2.jpg
    assertEquals(vars.get("img").toString(), "http://localhost:8080/images/cat2.jpg");
  }
  @Test
  public void tEST4LISTING() {
    // Test name: TEST-4-LISTING
    // Step # | name | target | value
    // 1 | open | / | 
    driver.get("http://localhost:8080/");
    // 2 | setWindowSize | 830x824 | 
    driver.manage().window().setSize(new Dimension(830, 824));
    // 3 | runScript | document.cookie = "1=false";document.cookie = "2=false";document.cookie = "3=false"; | 
    js.executeScript("document.cookie = \"1=false\";document.cookie = \"2=false\";document.cookie = \"3=false\";");
    // 4 | click | linkText=Catalog | 
    driver.findElement(By.linkText("Catalog")).click();
    // 5 | assertElementPresent | xpath=//div[@id='listing']/ul/li[3] | 
    {
      List<WebElement> elements = driver.findElements(By.xpath("//div[@id=\'listing\']/ul/li[3]"));
      assert(elements.size() > 0);
    }
    // 6 | assertElementNotPresent | xpath=//div[@id='listing']/ul/li[4] | 
    {
      List<WebElement> elements = driver.findElements(By.xpath("//div[@id=\'listing\']/ul/li[4]"));
      assert(elements.size() == 0);
    }
    // 7 | assertText | xpath=//div[@id='listing']/ul/li[3] | ID 3. Mistoffelees
    assertThat(driver.findElement(By.xpath("//div[@id=\'listing\']/ul/li[3]")).getText(), is("ID 3. Mistoffelees"));
  }
  @Test
  public void tEST5RENTACAT() {
    // Test name: TEST-5-RENT-A-CAT
    // Step # | name | target | value
    // 1 | open | https://cs1632.appspot.com/ | 
    driver.get("http://localhost:8080/");
    // 2 | setWindowSize | 830x824 | 
    driver.manage().window().setSize(new Dimension(830, 824));
    // 3 | runScript | document.cookie = "1=false";document.cookie = "2=false";document.cookie = "3=false"; | 
    js.executeScript("document.cookie = \"1=false\";document.cookie = \"2=false\";document.cookie = \"3=false\";");
    // 4 | click | linkText=Rent-A-Cat | 
    driver.findElement(By.linkText("Rent-A-Cat")).click();
    // 5 | assertText | css=.form-group:nth-child(3) .btn | Rent
    assertThat(driver.findElement(By.cssSelector(".form-group:nth-child(3) .btn")).getText(), is("Rent"));
    // 6 | assertText | css=.form-group:nth-child(4) .btn | Return
    assertThat(driver.findElement(By.cssSelector(".form-group:nth-child(4) .btn")).getText(), is("Return"));
  }
  @Test
  public void tEST6RENT() {
    // Test name: TEST-6-RENT
    // Step # | name | target | value
    // 1 | open | / | 
    driver.get("http://localhost:8080/");
    // 2 | setWindowSize | 830x824 | 
    driver.manage().window().setSize(new Dimension(830, 824));
    // 3 | runScript | document.cookie = "1=false";document.cookie = "2=false";document.cookie = "3=false"; | 
    js.executeScript("document.cookie = \"1=false\";document.cookie = \"2=false\";document.cookie = \"3=false\";");
    // 4 | click | xpath=//a[contains(@href, '/rent-a-cat')] | 
    driver.findElement(By.xpath("//a[contains(@href, \'/rent-a-cat\')]")).click();
    // 5 | click | id=rentID | 
    driver.findElement(By.id("rentID")).click();
    // 6 | type | id=rentID | 1
    driver.findElement(By.id("rentID")).sendKeys("1");
    // 7 | click | css=.form-group:nth-child(3) .btn | 
    driver.findElement(By.cssSelector(".form-group:nth-child(3) .btn")).click();
    // 8 | assertText | xpath=//div[@id='listing']/ul/li | Rented out
    assertThat(driver.findElement(By.xpath("//div[@id=\'listing\']/ul/li")).getText(), is("Rented out"));
    // 9 | assertText | xpath=//div[@id='listing']/ul/li[2] | ID 2. Old Deuteronomy
    assertThat(driver.findElement(By.xpath("//div[@id=\'listing\']/ul/li[2]")).getText(), is("ID 2. Old Deuteronomy"));
    // 10 | assertText | xpath=//div[@id='listing']/ul/li[3] | ID 3. Mistoffelees
    assertThat(driver.findElement(By.xpath("//div[@id=\'listing\']/ul/li[3]")).getText(), is("ID 3. Mistoffelees"));
    // 11 | assertText | id=rentResult | Success!
    assertThat(driver.findElement(By.id("rentResult")).getText(), is("Success!"));
  }
  @Test
  public void tEST7RETURN() {
    // Test name: TEST-7-RETURN
    // Step # | name | target | value
    // 1 | open | https://cs1632.appspot.com/ | 
    driver.get("http://localhost:8080/");
    // 2 | runScript | document.cookie = "1=false";document.cookie = "2=false";document.cookie = "3=false"; | 
    js.executeScript("document.cookie = \"1=false\";document.cookie = \"2=false\";document.cookie = \"3=false\";");
    // 3 | runScript | document.cookie = "2=true"; | 
    js.executeScript("document.cookie = \"2=true\";");
    // 4 | click | linkText=Rent-A-Cat | 
    driver.findElement(By.linkText("Rent-A-Cat")).click();
    // 5 | click | id=returnID | 
    driver.findElement(By.id("returnID")).click();
    // 6 | type | id=returnID | 2
    driver.findElement(By.id("returnID")).sendKeys("2");
    // 7 | click | css=.form-group:nth-child(4) .btn | 
    driver.findElement(By.cssSelector(".form-group:nth-child(4) .btn")).click();
    // 8 | assertText | id=cat-id1 | ID 1. Jennyanydots
    assertThat(driver.findElement(By.id("cat-id1")).getText(), is("ID 1. Jennyanydots"));
    // 9 | assertText | id=cat-id2 | ID 2. Old Deuteronomy
    assertThat(driver.findElement(By.id("cat-id2")).getText(), is("ID 2. Old Deuteronomy"));
    // 10 | assertText | id=cat-id3 | ID 3. Mistoffelees
    assertThat(driver.findElement(By.id("cat-id3")).getText(), is("ID 3. Mistoffelees"));
    // 11 | assertText | id=returnResult | Success!
    assertThat(driver.findElement(By.id("returnResult")).getText(), is("Success!"));
  }
  @Test
  public void tEST8FEEDACAT() {
    // Test name: TEST-8-FEED-A-CAT
    // Step # | name | target | value
    // 1 | open | https://cs1632.appspot.com/ | 
    driver.get("http://localhost:8080/");
    // 2 | setWindowSize | 830x824 | 
    driver.manage().window().setSize(new Dimension(830, 824));
    // 3 | runScript | document.cookie = "1=false";document.cookie = "2=false";document.cookie = "3=false"; | 
    js.executeScript("document.cookie = \"1=false\";document.cookie = \"2=false\";document.cookie = \"3=false\";");
    // 4 | click | linkText=Feed-A-Cat | 
    driver.findElement(By.linkText("Feed-A-Cat")).click();
    // 5 | assertText | css=.btn | Feed
    assertThat(driver.findElement(By.cssSelector(".btn")).getText(), is("Feed"));
  }
  @Test
  public void tEST9FEED() {
    // Test name: TEST-9-FEED
    WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10)); // Setting an explicit wait for 10 seconds
    // Step # | name | target | value
    // 1 | open | https://cs1632.appspot.com/ | 
    driver.get("http://localhost:8080/");
    // 2 | click | linkText=Feed-A-Cat | 
    driver.findElement(By.linkText("Feed-A-Cat")).click();
    // 3 | click | id=catnips | 
    driver.findElement(By.id("catnips")).click();
    // 4 | type | id=catnips | 6
    driver.findElement(By.id("catnips")).sendKeys("6");
    // 5 | click | css=.btn | 
    driver.findElement(By.cssSelector(".btn")).click();
    // 6 | assertText | xpath=//*[@id='feedResult' and text()='Nom, nom, nom.'] | Nom, nom, nom.
    WebElement feedResult = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='feedResult' and text()='Nom, nom, nom.']")));
    // 6 | assertText | xpath=//*[@id='feedResult' and text()='Nom, nom, nom.'] | Nom, nom, nom.
    //assertThat(driver.findElement(By.xpath("//*[@id=\'feedResult\' and text()=\'Nom, nom, nom.\']")).getText(), is("Nom, nom, nom."));
    assertThat(feedResult.getText(), is("Nom, nom, nom."));
  }
  @Test
  public void tEST10GREETACAT() {
    // Test name: TEST-10-GREET-A-CAT
    // Step # | name | target | value
    // 1 | open | https://cs1632.appspot.com/ | 
    driver.get("http://localhost:8080/");
    // 2 | setWindowSize | 830x824 | 
    driver.manage().window().setSize(new Dimension(830, 824));
    // 3 | runScript | document.cookie = "1=false";document.cookie = "2=false";document.cookie = "3=false"; | 
    js.executeScript("document.cookie = \"1=false\";document.cookie = \"2=false\";document.cookie = \"3=false\";");
    // 4 | click | linkText=Greet-A-Cat | 
    driver.findElement(By.linkText("Greet-A-Cat")).click();
    // 5 | assertText | css=#greeting > h4 | Meow!Meow!Meow!
    assertThat(driver.findElement(By.cssSelector("#greeting > h4")).getText(), is("Meow!Meow!Meow!"));
  }
  @Test
  public void tEST11GREETACATWITHNAME() {
    // Test name: TEST-11-GREET-A-CAT-WITH-NAME
    // Step # | name | target | value
    // 1 | open | https://cs1632.appspot.com/greet-a-cat/Jennyanydots | 
    driver.get("http://localhost:8080/greet-a-cat/Jennyanydots");
    // 2 | runScript | document.cookie = "1=false";document.cookie = "2=false";document.cookie = "3=false"; | 
    js.executeScript("document.cookie = \"1=false\";document.cookie = \"2=false\";document.cookie = \"3=false\";");
    // 3 | assertText | css=#greeting > h4 | Meow! from Jennyanydots.
    assertThat(driver.findElement(By.cssSelector("#greeting > h4")).getText(), is("Meow! from Jennyanydots."));
  }
  /* 
  @Test
  public void dEFECTFUNGREETACAT() {
    // Test name: DEFECT-FUN-GREET-A-CAT
    // Step # | name | target | value
    // 1 | open | https://cs1632.appspot.com/ | 
    driver.get("https://cs1632.appspot.com/");
    // 2 | runScript | document.cookie = "1=false";document.cookie = "2=false";document.cookie = "3=false"; | 
    js.executeScript("document.cookie = \"1=false\";document.cookie = \"2=false\";document.cookie = \"3=false\";");
    // 3 | runScript | document.cookie = "1=true"; document.cookie = "2=true"; | 
    js.executeScript("document.cookie = \"1=true\"; document.cookie = \"2=true\";");
    // 4 | click | linkText=Greet-A-Cat | 
    driver.findElement(By.linkText("Greet-A-Cat")).click();
    // 5 | assertText | css=#greeting > h4 | Meow!
    assertThat(driver.findElement(By.cssSelector("#greeting > h4")).getText(), is("Meow!"));
  }
  @Test
  public void dEFECTFUNGREETACATWITHNAME() {
    // Test name: DEFECT-FUN-GREET-A-CAT-WITH-NAME
    // Step # | name | target | value
    // 1 | runScript | document.cookie = "1=false";document.cookie = "2=false";document.cookie = "3=false"; | 
    js.executeScript("document.cookie = \"1=false\";document.cookie = \"2=false\";document.cookie = \"3=false\";");
    // 2 | runScript | document.cookie = "1=true"; | 
    js.executeScript("document.cookie = \"1=true\";");
    // 3 | open | https://cs1632.appspot.com/greet-a-cat/Jennyanydots | 
    driver.get("https://cs1632.appspot.com/greet-a-cat/Jennyanydots");
    // 4 | assertText | css=#greeting > h4 | Jennyanydots is not here.
    assertThat(driver.findElement(By.cssSelector("#greeting > h4")).getText(), is("Jennyanydots is not here."));
  }
  @Test
  public void dEFECTFUNFEED() {
    // Test name: DEFECT-FUN-FEED
    // Step # | name | target | value
    // 1 | open | https://cs1632.appspot.com/ | 
    driver.get("https://cs1632.appspot.com/");
    // 2 | runScript | document.cookie = "1=false";document.cookie = "2=false";document.cookie = "3=false"; | 
    js.executeScript("document.cookie = \"1=false\";document.cookie = \"2=false\";document.cookie = \"3=false\";");
    // 3 | setWindowSize | 1054x808 | 
    driver.manage().window().setSize(new Dimension(1054, 808));
    // 4 | click | linkText=Feed-A-Cat | 
    driver.findElement(By.linkText("Feed-A-Cat")).click();
    // 5 | click | id=catnips | 
    driver.findElement(By.id("catnips")).click();
    // 6 | type | id=catnips | -3
    driver.findElement(By.id("catnips")).sendKeys("-3");
    // 7 | click | css=.btn | 
    driver.findElement(By.cssSelector(".btn")).click();
    // 8 | assertText | xpath=//*[@id='feedResult' and text()='Nom, nom, nom.'] | Cat fight!
    assertThat(driver.findElement(By.xpath("//*[@id=\'feedResult\' and text()=\'Nom, nom, nom.\']")).getText(), is("Cat fight!"));
  }*/
}
