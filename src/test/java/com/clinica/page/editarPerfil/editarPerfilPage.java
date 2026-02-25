package com.clinica.page.editarPerfil;

import org.junit.Assert;
import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class editarPerfilPage {
    private WebDriver driver;

    public editarPerfilPage(WebDriver driver) {
        this.driver = driver;
    }
    private By lblTextoBienvenida = By.id("div_Bienvenida");
    private By btnMenuLateral = By.id("spnMenu");
    private By btnnEditarPerfil = By.xpath("//span[contains(text(),'Editar perfil')]/parent::div");
    private By lblMensaje = By.xpath("//span[contains(text(),'Elige el perfil')]");
    private By btnLapiz = By.id("spnFamiliarEditarFoto");
    private By txtDirección = By.id("txt_MP_Direccion");
    private By btnGuardar = By.id("btnFamiliarActualizar");
    private By lblConfirmacion = By.id("spnPerfilTituloListo");
    private By btnDni = By.xpath("//input[@id='div_LO_PRI_TipoDoc_0']/parent::label");
    private By numeroDniInput = By.id("txtDni");
    private By passwordInput = By.id("txtClave");
    private By btnLogin = By.id("btnLogin");

    public void validarTextoBienvenida(){
        driver.get("https://citaweb.clinicasanfelipe.com/CSF_CITAS/");
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
        wait.until(ExpectedConditions.visibilityOfElementLocated(btnDni));

        driver.findElement(btnDni).click();

        driver.findElement(numeroDniInput).sendKeys("70993896");

        driver.findElement(passwordInput).sendKeys("Plu8yo298*");

        driver.findElement(btnLogin).click();

        wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        WebElement lblBienvenida = wait.until(
                ExpectedConditions.visibilityOfElementLocated(lblTextoBienvenida)
        );
        Assertions.assertEquals(
                "Bienvenido",
                lblBienvenida.getText().trim(),
                "El texto de bienvenida no coincide con lo esperado"
        );

    }
    public void seleccionarMenuLateral() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
        wait.until(ExpectedConditions.visibilityOfElementLocated(btnMenuLateral));
        driver.findElement(btnMenuLateral).click();

    }
    public void seleccionarBtnEditar() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
        wait.until(ExpectedConditions.visibilityOfElementLocated(btnnEditarPerfil));
        driver.findElement(btnnEditarPerfil).click();

    }

    public void validarTituloEditarPerfil(String titulo) {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));

        WebElement elemento = wait.until(
                ExpectedConditions.visibilityOfElementLocated(lblMensaje)
        );
    }

    public void seleccionarBotonLapiz() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        WebElement elemento = wait.until(
                ExpectedConditions.visibilityOfElementLocated(btnLapiz)
        );
        driver.findElement(btnLapiz).click();
    }

    public void modificarDireccion(String nuevaDireccion) {
        WebElement campo = driver.findElement(txtDirección);
        campo.click();

        campo.sendKeys(Keys.CONTROL + "a");
        campo.sendKeys(Keys.DELETE);
        campo.sendKeys(nuevaDireccion);
    }


    public void guardarCambios() {
        driver.findElement(btnGuardar).click();

    }
    public void validarCambios(){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        WebElement lblBienvenida = wait.until(
                ExpectedConditions.visibilityOfElementLocated(lblConfirmacion)
        );
        Assertions.assertEquals(
                "Perfil actualizado",
                lblBienvenida.getText().trim(),
                "Error"
        );

    }

}
