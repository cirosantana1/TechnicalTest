# language: es

Característica: Validación de campos obligatorios para hospedaje

  Escenario: Flujo para verificacion de campos obligatorios
    Dado Que Catalina es un usuario que ingresa a la aplicacion
    Cuando Selecciona la opcion buscar sin haber diligenciado nada
    Entonces El sistema le mostrara un mensaje de alerta