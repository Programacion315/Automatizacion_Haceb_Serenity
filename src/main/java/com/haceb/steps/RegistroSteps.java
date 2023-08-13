package com.haceb.steps;

import com.haceb.pageObject.RegistroPage;
import com.haceb.utils.Excel;
import net.thucydides.core.annotations.Step;
import org.openqa.selenium.JavascriptExecutor;


import java.io.IOException;


public class RegistroSteps {

    RegistroPage registroPage = new RegistroPage();
    Excel excel = new Excel();

    private String rutaExcel = "src/test/resources/data/Datos.xlsx";


    @Step("El usuario abre el navegador")
    public void abrirNavegador() throws IOException{

        // Le sumamos 1 a iteracion
        excel.incrementarIterador(rutaExcel,"url",1,8);

        //Guardamos el dato de string
        String iteradorExcel = excel.leerDatoExcel(rutaExcel, "url",1,8);
        System.out.println(iteradorExcel);

        // Ahora, escribimos al el correo en el excel para que este cambie
        excel.escribirDatoExcel(rutaExcel,"url",1,1, "Jorgel315_dev" + iteradorExcel + "@gmail.com");
        registroPage.openUrl(excel.leerDatosExcel(rutaExcel,"url",1,0));

    }

    @Step("El usuario da clic en perfil")
    public void entrarPerfil(){
        registroPage.getDriver().findElement(registroPage.getTxtUsuario()).click();
    }

    @Step("El usuario da clic en el boton registro")
    public void clickRegisrtro(){
        registroPage.getDriver().findElement(registroPage.getBtnRegistro()).click();
    }
    @Step("El usuario da clic en el boton Registrarse")
    public void clickBotonRegistrarse(){
        registroPage.getDriver().findElement(registroPage.getBtnRegistrarse()).click();

        registroPage.cambioAVentanaEmergente();

    }

    @Step("El usuario registra el correo")
    public void registrarCorreo() throws IOException {


        registroPage.getDriver().findElement(registroPage.getTxtCorreo()).sendKeys(excel.leerDatosExcel(rutaExcel,"url",1,1));
    }

    @Step("El usuario digita el nombre")
    public void registrarNombre() throws IOException {

        registroPage.getDriver().findElement(registroPage.getTxtNombre()).sendKeys(excel.leerDatosExcel(rutaExcel,"url",1,2));
    }

    @Step("El usuario digita el apellido")
    public void registrarApellido() throws IOException {

        registroPage.getDriver().findElement(registroPage.getTxtApellido()).sendKeys(excel.leerDatosExcel(rutaExcel,"url",1,3));
    }

    @Step("El usuario ingresa la contraseña")
    public void registrarContrasenia() throws IOException {
        registroPage.getDriver().findElement(registroPage.getTxtContrasenia()).sendKeys(excel.leerDatosExcel(rutaExcel,"url",1,4));
    }

    @Step("El usuario confirma la contraseña")
    public void registrarComfirContrasenia() throws IOException {
        registroPage.getDriver().findElement(registroPage.getTxtConfirmarContrasenia()).sendKeys(excel.leerDatosExcel(rutaExcel,"url",1,4));
    }



    @Step("Click en checkbox")
    public void clickCheckbox(){
        JavascriptExecutor executor = (JavascriptExecutor) registroPage.getDriver();
        executor.executeScript("arguments[0].click()", registroPage.getDriver().findElement(registroPage.getCheckBoxTyC()));
    }

    @Step("El usuario autoriza")
    public void registrarCheckBoxAutorizo(){
        registroPage.getDriver().findElement(registroPage.getCheckBoxAuto()).click();
    }

    @Step("El usuario oprime el boton registrarme")
    public void registrarOprimeBotonRegistrarme(){
        registroPage.getDriver().findElement(registroPage.getBtnRegistrarme()).click();

        registroPage.cambioAVentanaEmergente();
    }

    @Step("El usuario registra la cedula")
    public void registrarCedula() throws IOException {

        registroPage.getDriver().findElement(registroPage.getLblCedula()).sendKeys(excel.leerDatosExcel(rutaExcel,"url",1,6));
    }

    @Step("El usuario selecciona el genero masculino")
    public void registarGenero(){
        registroPage.getDriver().findElement(registroPage.getSlcGenero()).click();
    }

    @Step("El usuario registra la fecha de nacimiento")
    public void registrarFecha() throws IOException {
        System.out.println("Llegamos aca ");
        String data = excel.leerDatosExcel(rutaExcel, "url", 1, 6);
        System.out.println("Llegamos aca " + data);

        registroPage.getDriver().findElement(registroPage.getBtnFecha()).sendKeys(data);
        System.out.println("Aca si? ");

    }

    @Step("El usuario selecciona el codigo del pais +57")
    public void registrarCodigo(){
        registroPage.getDriver().findElement(registroPage.getBtnCodigo()).click();
    }

    @Step("El usuario registra el numero de contacto")
    public void registrarNumeroDeContacto() throws IOException {
        registroPage.getDriver().findElement(registroPage.getLblNumeroContacto()).sendKeys(excel.leerDatosExcel(rutaExcel,"url",1,6));
    }

    @Step("El usuario registra el departamento")
    public void registarDepartamento(){
        registroPage.getDriver().findElement(registroPage.getSelecDepartamento()).click();
    }

    @Step("El usuario registra la ciudad")
    public void registarCiudad(){
        registroPage.getDriver().findElement(registroPage.getSelectCiudad()).click();
    }

    @Step("El usuario Oprime el boton enviar")
    public void registarBotonEnviar(){
        registroPage.getDriver().findElement(registroPage.getBtnEnviar()).click();
        registroPage.cambioAVentanaEmergente2();

    }

}
