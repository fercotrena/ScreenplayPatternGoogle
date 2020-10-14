#language: es
Característica: Como usuario de internet, cuando voy a la página de búsqueda de Google y busco una palabra
  Espero ver al menos una referencia a esa palabra en el resumen de resultados.
  Antecedentes:
    Dado un usuario conectado en google.com

  Escenario: Buscar con Google
    Dada una lista de palabras provista
    Cuando se busca por una palabra de la lista
    Entonces se muestra en el resultado una referencia a la palabra consultada


  Esquema del escenario: Buscar en Google la palabra de tabla de ejemplo
    Dada una "<palabra>"  provista
    Cuando se busca por una palabra de la lista
    Entonces se muestra en el resultado una referencia a la palabra consultada
    Ejemplos:
      | palabra  |
      | Gherkin  |
      | Cucumber |
      | Java     |
      | Behave   |