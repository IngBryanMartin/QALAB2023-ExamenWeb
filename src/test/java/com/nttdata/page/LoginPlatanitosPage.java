package com.nttdata.page;

import org.openqa.selenium.By;

public class LoginPlatanitosPage {

    //Localizadores de elementos
    public static By btnCuenta = By.xpath("//img[@id='ImgAccount']");
    public static By emailInput = By.id("email");
    public static By passInput = By.id("password");
    public static By btnLogin = By.xpath("//button[@id='btn_submit']");
    public static By productsTitle = By.cssSelector("h1.nd-cart-title");


}
