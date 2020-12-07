package newproject;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
//comentar la línea anterior y descomentar la línea de abajo para utilizar Chrome
//import org.openqa.selenium.chrome.ChromeDriver;
public class PG1 {
public static void main(String[] args) {
// declaracion e instanciar los objectos/variables
System.setProperty("webdriver.firefox.marionette","C:\geckodriver.exe");
WebDriver driver = new FirefoxDriver();
//comentar las 2 líneas anteriores y descomentar las 2 líneas de abajo para usar Chrome
//System.setProperty("webdriver.chrome.driver","G:\chromedriver.exe");
//WebDriver driver = new ChromeDriver();
String baseUrl = "http://demo.guru99.com/selenium/newtours/";
String expectedTitle = "Welcome: Mercury Tours";
String actualTitle = "";
// lanzar Firefox y dirigirlo a la base URL
driver.get(baseUrl);
// obtener el valor real del título
actualTitle = driver.getTitle();
/* Compara el título real de la página con la que se espera e imprime
* el resultado es "Passed" o "Failed"
*/
if (actualTitle.contentEquals(expectedTitle)){
System.out.println("Test Passed!");
} else {
System.out.println("Test Failed");
}
//Cerrar firefox
driver.close();
}
}