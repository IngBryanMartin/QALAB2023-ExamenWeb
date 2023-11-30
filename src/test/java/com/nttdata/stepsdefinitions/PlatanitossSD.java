package com.nttdata.stepsdefinitions;

import com.nttdata.steps.LoginPlatanitosSteps;
import com.nttdata.steps.SeleccionarProdSteps;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import io.cucumber.java.es.Cuando;
import io.cucumber.java.es.Dado;
import io.cucumber.java.es.Entonces;
import io.cucumber.java.es.Y;
import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class PlatanitossSD {

    private WebDriver driver;
    private Scenario scenario;
    private LoginPlatanitosSteps objLoginPlatanitosSteps;
    private SeleccionarProdSteps objSeleccionarProdSteps;

    private LoginPlatanitosSteps loginPlatanitosStepsSteps(WebDriver driver){
        return new LoginPlatanitosSteps(driver);
    }

    private SeleccionarProdSteps seleccionarProdSteps(WebDriver driver){
        return new SeleccionarProdSteps(driver);
    }

    @Before(order = 0)
    public void setUp(){
        //setUp
        System.setProperty("webdriver.http.factory", "jdk-http-client");
        System.setProperty("webdriver.chrome.driver", "drivers\\chromedriver.exe");

        //crear el driver
        driver = new ChromeDriver();
        //max
        driver.manage().window().maximize();
    }

    @Before(order = 1)
    public void setScenario(Scenario scenario){
        this.scenario = scenario;
    }

    @After
    public void quitDriver(){
        driver.quit();
    }

    @Dado("que estoy en la pagina principal")
    public void queEstoyEnLaPaginaPrincipal() {
        driver.get("https://www.mercadolibre.com.pe/");
        screenShot();
    }

    @Dado("que me encuentro en la página principal de Platanitos")
    public void queMeEncuentroEnLaPaginaPrincipalDePlatanitos() {
        driver.get("https://platanitos.com/");
        screenShot();
    }

    @Cuando("haga click en Cuenta")
    public void hagaClickEnCuenta() {
        objLoginPlatanitosSteps = new LoginPlatanitosSteps(driver);
        objLoginPlatanitosSteps.clickEnCuentaParaHacerLogin();
        screenShot();
    }

    @Y("inicio sesión con las credenciales email: {string} y contraseña: {string}")
    public void inicioSesionConLasCredencialesEmailYContrasena(String email, String password) {
        LoginPlatanitosSteps loginPlatanitosSteps = new LoginPlatanitosSteps(driver);
        loginPlatanitosSteps.typeEmail(email);
        loginPlatanitosSteps.typePassword(password);
        loginPlatanitosSteps.login();
        screenShot();
    }

    @Entonces("valido la autenticación y debería de aparecer el título de {string}")
    public void validoQueDeberiaDeAparecerElTituloDe(String expectedTitle) {
        String title =  loginPlatanitosStepsSteps(driver).getTitle();
        //prueba: validamos el título del producto
        Assertions.assertEquals(expectedTitle, title);
        screenShot();
    }

    @Cuando("hago click en Ofertas")
    public void hagoClickEnOfertas() {
        objSeleccionarProdSteps = new SeleccionarProdSteps(driver);

        objSeleccionarProdSteps.seleccionarMenuOfertas();
        screenShot();
    }

    @Y("selecciono la oferta principal")
    public void seleccionoLaOfertaPrincipal() {
        objSeleccionarProdSteps.seleccionarProductoDeOferta();
        screenShot();
    }

    @Y("selecciono un Producto de las Ofertas")
    public void seleccionoUnProductoDeLasOfertas() {
        objSeleccionarProdSteps.seleccionarProducto();
        screenShot();
    }


    @Entonces("valido que debe aparecer el titulo de {string}")
    public void validoQueDebeAparecerElTituloDe(String expectedTitle) {
        String title =  seleccionarProdSteps(driver).getTitle();
        //prueba: validamos el título del producto
        Assertions.assertEquals(expectedTitle, title);
        screenShot();
    }

    @Y("tambien valido que aparesca el titulo {string}")
    public void tambienValidoQueAparescaElTitulo(String expectedTitle) {
        String title =  seleccionarProdSteps(driver).getSecondTitle();
        //prueba: validamos el título del producto
        Assertions.assertEquals(expectedTitle, title);
        screenShot();
    }

    @Entonces("añado el producto al carrito")
    public void anadoElProductoAlCarrito() {
        SeleccionarProdSteps seleccionarProdSteps = new SeleccionarProdSteps(driver);
        seleccionarProdSteps.agregarAlCarrito();
        screenShot();
    }

    @Y("valido que el producto se añadio exitosamente dandole click en Carrito")
    public void validoQueElProductoSeAnadioExitosamenteDandoleClickEnCarrito() {
        SeleccionarProdSteps seleccionarProdSteps = new SeleccionarProdSteps(driver);
        seleccionarProdSteps.carritoVer();
        screenShot();
    }

    public void screenShot(){
        byte[] evidencia = ((TakesScreenshot) driver).getScreenshotAs(OutputType.BYTES);
        this.scenario.attach(evidencia, "image/png", "evidencias");
    }


}
