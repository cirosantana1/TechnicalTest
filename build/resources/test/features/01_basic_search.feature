# language: es

Característica: Busqueda basica de un hotel

  Escenario: Flujo exitoso para cliente que busca un hotel
    Dado Que Juan es un usuario que ingresa a la aplicacion
    Cuando Digita la informacion de la ciudad a visitar
      | destino    |
      | Bogota     |
    Entonces El sistema le mostrara los resultados de la busqueda
