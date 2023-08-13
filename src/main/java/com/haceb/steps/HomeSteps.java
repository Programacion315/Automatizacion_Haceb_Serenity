package com.haceb.steps;

import com.haceb.pageObject.HomePage;
import com.haceb.utils.Espera;
import com.haceb.utils.Excel;
import com.haceb.utils.Logica;
import io.cucumber.java.an.E;
import net.thucydides.core.annotations.Step;

import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.io.IOException;
import java.time.Duration;
import java.util.List;

public class HomeSteps {
    HomePage homePage = new HomePage();
    Excel excel = new Excel();

    Espera espera = new Espera();

    private String rutaExcel = "src/test/resources/data/Datos.xlsx";

    @Step("El usuario abre el navegador")

    public void abrirNavegador() throws IOException {
        homePage.openUrl(excel.leerDatosExcel(rutaExcel,"url",1,0));
    }

    @Step("El usuario da click en menu categoria")
    public void clickCategoria(){
        homePage.getDriver().findElement(homePage.getBtnCategoria()).click();
    }

    @Step("El usuario pasa el mouse sobre Electrodomesticos cocina y da click")
    public void clickElectroCocina(){
        homePage.pasarCursorSobreElento(homePage.getDriver());
    }

    @Step("El usuario selecciona una categoria al azar")
    public void selectProduct(){
        List<WebElement> products = homePage.getDriver().findElements(homePage.getlProducts());

        System.out.println("Aca estan los elementos de cocina!");
        System.out.println(products);

        products.get(Logica.numeroAleatorio(0, products.size())).click();

    }

    @Step("El usuario selecciona un producto dentro de la categoria al azar")
    public void selectProductAlazar(){

        List<WebElement> products = homePage.getDriver().findElements(homePage.getxProductoAlazar());
        products.get(Logica.numeroAleatorio(0, products.size())).click();

    }

    @Step("El usuario le da clic en el boton comprar")
    public void clicBotonComprar(){
        Duration tiempoEspera = Duration.ofSeconds(5);
        WebDriverWait wait = new WebDriverWait(homePage.getDriver(), tiempoEspera);

        homePage.getDriver().findElement(homePage.getBtnComprar()).click();
        System.out.println("Aca llego nuestra automatizacion");
    }

    @Step("Validar titulo Resumen carrito")
    public void validarTitulo(){

        System.out.println("Entramos a validar el carrito");
        WebElement element = espera.esperaVisibilidad(homePage.getDriver(), homePage.getvCarrito());
        Assert.assertTrue(element.isDisplayed());
        System.out.println("Validación exitosa del carrito");
    }
}
