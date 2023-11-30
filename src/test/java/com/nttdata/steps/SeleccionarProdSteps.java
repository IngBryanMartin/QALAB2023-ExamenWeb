package com.nttdata.steps;

import com.nttdata.page.OfertasPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class SeleccionarProdSteps {

    private WebDriver driver;

    //constructor
    public SeleccionarProdSteps(WebDriver driver){
        this.driver = driver;
    }

    public void seleccionarMenuOfertas() {
        WebElement menuOfertas = driver.findElement(OfertasPage.menuOfertas);
        menuOfertas.click();
    }

    public void seleccionarProductoDeOferta() {
        WebElement productoOferta = driver.findElement(OfertasPage.btnProductoOferta);
        productoOferta.click();
    }

    public void seleccionarProducto() {
        WebElement productoSeleccionado = driver.findElement(OfertasPage.btnProducto);
        productoSeleccionado.click();
    }

    public String getTitle() {
        return this.driver.findElement(OfertasPage.productsTitle).getText();
    }

    public String getSecondTitle() {
        return this.driver.findElement(OfertasPage.productsSecondTitle).getText();
    }

    public void agregarAlCarrito() {
        WebElement agregarAlCarrito = driver.findElement(OfertasPage.btnAgregarAlCarrito);
        agregarAlCarrito.click();
    }

    public void carritoVer() {
        WebElement verCarrito = driver.findElement(OfertasPage.btnVerCarrito);
        verCarrito.click();
    }


}
