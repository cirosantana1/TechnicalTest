# language: es

Característica: Busqueda basica para rentar un auto

  Escenario: Flujo exitoso para cliente que busca rentar un auto
    Dado Que Angel es un usuario que ingresa a la aplicacion
    Cuando Digita la informacion de para buscar un auto para rentar
      | entrega     | devolucion | horaEntrega | horaDevolucion    |
      | Bogotá      | Cali       | 1000AM      | 0415PM            |
    Entonces El sistema le mostrara los resultados de la busqueda para el auto