package com.nttdata.page;

import org.openqa.selenium.By;

public class OfertasPage {

    //Localizadores de elementos
    public static By menuOfertas = By.xpath("//header/div[2]/nav[1]/div[1]/div[1]/div[1]/div[1]/ul[1]/li[7]/h2[1]/a[1]");
    public static By btnProductoOferta = By.xpath("//body/div[@id='body-Ofertas']/div[3]/div[1]/div[1]/div[1]/a[1]");
    public static By btnProducto = By.xpath("//body/div[@id='body-productos']/div[4]/div[2]/div[2]/div[1]/div[1]/div[1]/div[3]/div[1]");
    public static By productsTitle = By.xpath("//div[contains(text(),'Características')]");
    public static By productsSecondTitle = By.xpath("//div[contains(text(),'Categorías')]");
    public static By btnAgregarAlCarrito = By.xpath("//button[@id='btn_add_cart_full']");
    public static By btnVerCarrito = By.xpath("//img[@id='ImgCar']");
    public static By btnEliminarProducto = By.xpath("//body/div[@id='body-Carrito']/main[1]/div[1]/div[1]/div[2]/div[1]/form[1]/div[1]/div[2]/button[1]");
}
