#language: es

  Característica: Registro de usuario
    Yo como usuario quiero registrarme a la pagina haceb.com

    Escenario:Regisrtro de usuario exitoso
      Dado que el usuario ingresa a haceb y le da en la opcion de registrarse
      Cuando el usuario llena el formulario de registro
      Entonces el usuario visualiza informacion de su perfil.