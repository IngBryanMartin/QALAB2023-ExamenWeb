package com.nttdata.steps;

import com.nttdata.page.LoginPlatanitosPage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class LoginPlatanitosSteps {
    private WebDriver driver;

    //constructor
    public LoginPlatanitosSteps(WebDriver driver){
        this.driver = driver;
    }

    public void esperaElemento(By by){
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(444));
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(40));
        wait.until(ExpectedConditions.visibilityOfElementLocated(by));
    }

    public void clickEnCuentaParaHacerLogin() {
        //Esperar hasta que el elemento exista
        esperaElemento(LoginPlatanitosPage.btnCuenta);

        WebElement btnCuenta= driver.findElement(LoginPlatanitosPage.btnCuenta);
        btnCuenta.click();

        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

    /**
     * Escribir el email
     * @param email el email
     */
    public void typeEmail(String email){
        WebElement userInputElement = driver.findElement(LoginPlatanitosPage.emailInput);
        userInputElement.sendKeys(email);
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(444));
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(40));
        wait.until(ExpectedConditions.visibilityOfElementLocated(LoginPlatanitosPage.btnLogin));
    }

    /**
     * Escribir el password
     * @param password el password del email
     */
    public void typePassword(String password){
        this.driver.findElement(LoginPlatanitosPage.passInput).sendKeys(password);
    }

    public void login() {
        this.driver.findElement(LoginPlatanitosPage.btnLogin).click();
    }

    public String getTitle() {
        return this.driver.findElement(LoginPlatanitosPage.productsTitle).getText();
    }
}
