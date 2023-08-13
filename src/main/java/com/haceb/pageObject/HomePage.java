package com.haceb.pageObject;

import net.serenitybdd.core.pages.PageObject;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class HomePage extends PageObject {

    By btnCategoria = By.xpath("//a[@class='nav__link'][@role='button']");
    By BtnElectrodomesticosCocina = By.xpath("//a[@class='link-parent'][@title='Electrodomésticos de cocina']");

    By lProducts = By.xpath("//li[@class='has-children cocina-line']//a[@class='nav__link']");
    By xProductoAlazar = By.xpath("//a[@class='shelve-link-name']/h4");

    By btnComprar = By.xpath("//div[@class='product__buy flex']/a[@class='btn btn-default buy-in-page-button']");

    By vCarrito = By.xpath("//div[@class='cart flex']/h2[@class='title']");

    //By vCarrito = By.xpath("//header/div[2]/div[6]/div[4]/div[1]/div[1]/div[1]/div[1]/div[1]");



    public By getBtnCategoria() {
        return btnCategoria;
    }

    public void pasarCursorSobreElento(WebDriver driver){
        WebElement hoverElement = driver.findElement(BtnElectrodomesticosCocina);
        Actions actions = new Actions(driver);
        actions.moveToElement(hoverElement).perform();
    }


    public By getlProducts() {
        return lProducts;
    }

    public By getxProductoAlazar() {
        return xProductoAlazar;
    }

    public By getBtnComprar() {
        return btnComprar;
    }

    public By getvCarrito() {
        return vCarrito;
    }
}
