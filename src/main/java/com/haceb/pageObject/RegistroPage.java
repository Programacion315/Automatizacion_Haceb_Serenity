package com.haceb.pageObject;

import net.serenitybdd.core.pages.PageObject;
import org.openqa.selenium.By;


import java.util.Set;

public class RegistroPage extends PageObject {
    By txtUsuario = By.xpath("//a/span[@class='icon-user']");
    By btnRegistro = By.xpath("//a[@class='cdc-fire cdc-register']");

    By btnRegistrarse = By.xpath("//button[@Id='vtexIdUI-custom-oauth']");

    By txtCorreo = By.xpath("//input[@id='gigya-loginID-51216659851706440']");

    By txtNombre = By.xpath("//*[@id='gigya-textbox-72173553995486780']");

    By txtApellido = By.xpath("//*[@id='gigya-textbox-146410824335495100']");

    By txtContrasenia = By.xpath("//*[@id='gigya-password-54061940132406190']");

    By txtConfirmarContrasenia = By.xpath("//input[@id='gigya-password-142670944012194750']");

    By checkBoxTyC = By.xpath("//input[@id='gigya-checkbox-70031539084410860']");


    By checkBoxAuto = By.cssSelector("#gigya-register-form .gigya-multi-choice-item:nth-child(4) > label");

    By btnRegistrarme = By.cssSelector("#gigya-register-form .gigya-input-submit");

    By lblCedula = By.xpath("//input[@type='number'][@class='gigya-input-text']");


    By slcGenero = By.xpath("//select[@id='gigya-dropdown-153944062160082270']/option[@value='m']");

    By btnFecha = By.xpath("//input[@id='gigya-textbox-29430652596742216' and @type='date']");



    By btnCodigo = By.xpath("//option[@value='+57' and contains(text(), 'Colombia (+57)')]");

    By lblNumeroContacto = By.xpath("//input[@class='gigya-input-text gigya-subscriber-phone-number-input' and @placeholder='Numero de contacto']");
    By selecDepartamento = By.xpath("//select[@name='data.region']/option[@value='Tolima']");
    By selectCiudad = By.xpath("//select[@name='profile.city']/option[@value='Ibagué']");

    By btnEnviar = By.xpath("//input[@type='submit' and @class='gigya-input-submit hc-c-register-screen-submit invi' and @value='Enviar']");

    public By getBtnCodigo() {
        return btnCodigo;
    }

    public By getTxtUsuario() {
        return txtUsuario;
    }

    public By getBtnRegistro() {
        return btnRegistro;
    }

    public By getBtnRegistrarse() {
        return btnRegistrarse;
    }

    public void cambioAVentanaEmergente(){

        Set<String> ventanas = getDriver().getWindowHandles();
        for (String ventana : ventanas) {

            getDriver().switchTo().window(ventana);

        }
    }

    public void cambioAVentanaEmergente2(){
        String ventanaPrincipal = getDriver().getWindowHandle();
        Set<String> ventanas = getDriver().getWindowHandles();
        for (String ventana : ventanas) {
            if(!ventanaPrincipal.equals(ventana)){
                getDriver().switchTo().window(ventana);
                break;
            }

        }
    }


    public By getTxtCorreo() {
        return txtCorreo;
    }

    public By getTxtNombre() {
        return txtNombre;
    }

    public By getTxtApellido() {
        return txtApellido;
    }

    public By getTxtContrasenia() {
        return txtContrasenia;
    }

    public By getTxtConfirmarContrasenia() {
        return txtConfirmarContrasenia;
    }

    public By getCheckBoxTyC() {
        return checkBoxTyC;
    }

    public By getCheckBoxAuto() {
        return checkBoxAuto;
    }

    public By getBtnRegistrarme() {
        return btnRegistrarme;
    }

    public By getLblCedula() {
        return lblCedula;
    }

    public By getSlcGenero() {
        return slcGenero;
    }

    public By getBtnFecha() {
        return btnFecha;
    }

    public By getLblNumeroContacto() {
        return lblNumeroContacto;
    }

    public By getSelecDepartamento() {
        return selecDepartamento;
    }

    public By getSelectCiudad() {
        return selectCiudad;
    }

    public By getBtnEnviar() {
        return btnEnviar;
    }
}
