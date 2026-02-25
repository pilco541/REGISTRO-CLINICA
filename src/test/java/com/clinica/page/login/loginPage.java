package com.clinica.page.login;

import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class loginPage {

    private WebDriver driver;

    public loginPage(WebDriver driver) {
        this.driver = driver;
    }
    private By btnDni = By.xpath("//input[@id='div_LO_PRI_TipoDoc_0']/parent::label");
    private By numeroDniInput = By.id("txtDni");
    private By passwordInput = By.id("txtClave");
    private By btnLogin = By.id("btnLogin");
    private By lblTextoBienvenida = By.id("div_Bienvenida");


    public void navegarALogin() {
        driver.get("https://citaweb.clinicasanfelipe.com/CSF_CITAS/");
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
        wait.until(ExpectedConditions.visibilityOfElementLocated(btnDni));
    }
    public void seleccionarDni() {
        driver.findElement(btnDni).click();
    }

    public void escribirDni(String dni) {
        driver.findElement(numeroDniInput).sendKeys(dni);
    }

    public void escribirContrasenia(String contrasenia) {
        driver.findElement(passwordInput).sendKeys(contrasenia);
    }

    public void seleccionarIniciarSesion() {
        driver.findElement(btnLogin).click();

    }
    public void validarRedireccion(){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        WebElement lblBienvenida = wait.until(
                ExpectedConditions.visibilityOfElementLocated(lblTextoBienvenida)
        );
        Assertions.assertEquals(
                "Bienvenido",
                lblBienvenida.getText().trim(),
                "El texto de bienvenida no coincide con lo esperado"
        );

    }
}
