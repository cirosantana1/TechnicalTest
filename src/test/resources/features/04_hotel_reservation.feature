# language: es

Característica: Validar informacion al intentar reservar un hotel

  Escenario: Flujo exitoso para cliente que busca informacion sobre un hotel
    Dado Que Felipe es un usuario que ingresa a la aplicacion
    Cuando Digita la informacion de la ciudad a visitar
      | destino    |
      | Cartagena     |
    Entonces El sistema le mostrara los resultados de la busqueda

    Cuando Seleccione un hotel
    #Entonces El sistema le mostrara la información del hotel seleccionado*/
