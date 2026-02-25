package com.clinica.glue.editarPerfil;

import com.clinica.step.editarPerfil.editarPerfilStep;
import io.cucumber.java.es.*;

public class EditarPerfilStepDefinition {

    private editarPerfilStep editarPerfilStep = new editarPerfilStep();

    @Dado("que ya me encuentro logeado en la Portal del Paciente")
    public void verificarPortalPaciente() {
        editarPerfilStep.validarTextoBienvenida();
    }

    @Cuando("selecciono el menu lateral")
    public void seleccionarMenuLateral() {
        editarPerfilStep.seleccionarMenuLateral();
    }

    @Y("selecciono la opción Editar Perfil")
    public void seleccionarEditarPerfil()
    {
        editarPerfilStep.seleccionarBtnEditar();
    }

    @Y("valido que se muestre el mensaje {string}")
    public void validarTituloEditarPerfil(String mensajeTitulo) {
        editarPerfilStep.validarTituloEditarPerfil(mensajeTitulo);
    }
    @Y("selecciono el botón Lapiz")
    public void seleccionarBtnEditar() {
        editarPerfilStep.seleccionarBotonLapiz();
    }

    @Y("escribo la nueva dirección {string}")
    public void modificarDirección(String nuevaDireccion) {
        editarPerfilStep.modificarDirección(nuevaDireccion);
    }

    @Y("selecciono el botón guardar")
    public void guardarCambios() {
        editarPerfilStep.guardarCambios();
    }

    @Entonces("valido que se muestre un modal con el mensaje Perfil actualizado")
    public void validarCambios() {
        editarPerfilStep.validarCambios();
    }
}
