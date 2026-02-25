#language:es

Característica: Autenticacion Portal del Paciente
  Como usuario ya registrado
  Quiero ingresar a la página de Login de la clinica
  Para poder autenticar mi usuario y contraseña

  @Login
  Esquema del escenario: Ingreso exitoso a la página Portal del Paciente
    Dado que abro la pagina de Login de la clinica
    Cuando selecciono el tipo de documento como DNI
    Y ingreso mi numero de documento "<nroDocumento>"
    Y ingreso mi contrasenia "<contrasenia>"
    Y presiono el boton Iniciar Sesion
    Entonces debe de redireccionarme a la pagina principal del Portal del Paciente
    Ejemplos:
      | nroDocumento   | contrasenia|
      | 70993896       | Plu8yo298* |
