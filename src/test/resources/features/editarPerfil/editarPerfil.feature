#language:es

Característica: Moficación dirección del paciente
  Como usuario ya registrado
  Quiero ingresar a la página de Editar Perfil
  Para poder modificar mis datos

  @Login
  Escenario: Edición exitosa de la dirección del paciente
    Dado que ya me encuentro logeado en la Portal del Paciente
    Cuando selecciono el menu lateral
    Y selecciono la opción Editar Perfil
    Y valido que se muestre el mensaje "Elige el perfil "
    Y selecciono el botón Lapiz
    Y escribo la nueva dirección "Av. Siempre Viva 123"
    Y selecciono el botón guardar
    Entonces valido que se muestre un modal con el mensaje Perfil actualizado

