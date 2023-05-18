# Proyecto del Segundo Cuatrimestre Fundamentos de Programación (Curso  22/23)
Autor/a: Pablo Pérez Acevedo   uvus:BLM6976

El objetivo de este proyecto es analizar los datos de las peliculas más populares de IMDb desde 1898 hasta 2022 , los cuales se encuentran en el dataset de Kaggle que se puede descargar con el siguiente enlace (https://www.kaggle.com/datasets/digvijaysinhgohil/imdb-dataset-toprated-films-18982022). El dataset original cuenta con 8 columnas. Aunque, he añadido dos más, una de tipo Booleano llamada "Contiene Sexo" y otra de Tipo Double que se llama "Recaudación(en millones de dólares)", así, ya están todos los tipos de variables en el dataset, o sea,el tipo String (cadena), tipo Integer(número entero), tipo Double (número real), tipo LocalDateTime (fecha), tipo Boolean y de tipo Enumerado.


## Estructura de las carpetas del proyecto

* **/src**: Contiene los diferentes archivos que forman parte del proyecto, es decir, contiene el código fuente.
  * **fp.tiposs**: Paquete que contiene los tipos del proyecto.
  * **fp.tiposss.test**: Paquete que contiene las clases de test del proyecto.
  * **fp.common**: Paquete que contiene los tipos auxiliares del proyecto
  * **fp.utiles**:  Paquete que contiene las clases de utilidad. 
* **/data**: Contiene el dataset del proyecto
    * **Fichero.csv**: Archivo csv que muestra información sobre las películas más populares en IMDb desde 1898 hasta 2022.
    
## Estructura del *dataset*

El dataset original cuenta con 8 columnas. Aunque, he añadido dos más, una de tipo Booleano llamada "Contiene Sexo" y otra de Tipo Double que se llama "Recaudación(en millones de dólares)", así, ya están todos los tipos de variables en el dataset, o sea,el tipo String (cadena), tipo Integer(número entero), tipo Double (número real), tipo LocalDate (fecha), tipo Boolean y de tipo Enumerado.

El dataset está compuesto por 11 columnas, con la siguiente descripción:

* **Title**: de tipo cadena, representa el título de la película.
* **Director**: de tipo cadena, representa el nombre del director.
* **Stars**: es una lista del tipo cadena, representa una lista con el nombre de las estrellas que aparecen en la película.
* **IMDb-Rating**: de tipo real, representa la calificación que tiene la película según IMDb.
* **Category**: de tipo lista de cadena, representa el género al que pertenece la película.
* **Duration**: de tipo duracion, representa lo que dura la película.
* **Censor Board-Rating**: Contiene el tipo de censura de la película
* **Fecha_estreno**: de tipo fecha, representa el año de estreno de la película
* **Contiene Sexo**: de tipo booleano, representa si la película contiene escenas de sexo.
* **Recaudación(en millones de dólares)**: de tipo real, representa el número total de reacudación que ha conseguido la película.


## Tipos implementados

Los tipos que se han implementado en el proyecto son los siguientes:

### Tipo Base - Pelicula
Representa una película en concreto.

**Propiedades**:

- _titulo_, de tipo String, consultable y modificable. 
- _director_, de tipo String, consultable y modificable.
- _estrellas_, de tipo List<String>, consultable y modificable.
- _calificacion_, de tipo Double, consultable y modificable.
- _categoria_, de tipo List<String>, consultable y modificable.
- _duracion_, de tipo Duration, consultable y modificable.
- _tipocensura_, de tipo TipoCensura, consultable y modificable.
- _fechaEstreno_, de tipo LocalDate, consultable y modificable.
- _tieneSexo_, de tipo Boolean, consultable y modificable.
- _recaudacionMillones_, de tipo Double, consultable y modificable.


**Constructores**: 

- C1: Crea un objeto de tipo Producto a partir de los siguientes parámetros: String titulo, String director, LocalDate fechaEstreno, Double calificacion
- C2: Crea un objeto de tipo Producto a partir de los siguientes parámetros: String titulo, String director, List<String> estrellas, Double calificacion,List<String> categoria, Duration duracion,TipoCensura tipoCensura, LocalDate fechaEstreno,Boolean tieneSexo, Double recaudacion


**Restricciones**:
 
- R1: El título no puede estar vacío.
- R2: El nombre del director no puede estar vacío.
- R3: La calificación no puede ser negativa.
- R4: La lista de estrellas no puede estar vacía.
- R5: La lista de categorías no puede estar vacía.


**Criterio de igualdad**: Dos productos son iguales si tienen el mismo título, nombre del director y fecha de estreno.

**Criterio de ordenación**: Los productos están ordenados según su fecha de estreno.

**Funcione auxiliares**:
 
-	_String toString_: Devuelve el toString del tipo Pelicula

#### Tipos auxiliares
- _TipoCensura_, tipo TipoCensura: es un Enumerate que contiene los tipo de censura que puede tener la película

### Factoría-FactoriaPelículas

-El método de factoría crea un objeto de tipo Peliculas según la ruta del fichero impuesta como parámetro

### Tipo Contenedor - Peliculas

Clase contenedora de los objeto de tipo Pelicula

**Propiedades**:

_peliculas_:de tipo List<String> , consultable y modificable.
**Constructores**: 

- C1: Constructor que devuelve un parámetro de tipo List<>. Crea un objeto de tipo Peliculas con las películas incluidas en una lista.
- C2: Constructor con un parámetro de tipo Stream. Crea un objeto de tipo Peliculas con las peliculas incluidas en el Stream dado.


**Restricciones**:
 
- R1: La línea del csv debe tener 10 parámetros

**Otras operaciones**:


-Map<String, List<String>> peliculasCategoria(String categoria): Crea un diccionario con las películas que hay de la categoría
	
-Map<String, Integer> contadorPorCategoria(String categoria): Crea un diccionario que cuenta las películas que hay de una categoría
	
-Boolean peliculaDirectorYActor(String titulo, String director, String actor): Devuelve verdadero si la película tiene ése director y ése actor
	
-Map<TipoCensura, Integer> contadorPorTipoCensura(): Devuelve un diccionario con clave TipoCensura y valor el número de veces que aparece
	
-Map<String, Double> getRatioCalificacionRecaudacionYNombreSegunValor(Double valor):Devuelve un diccionario con el ratio de la calificación y la recaudación filtrando por un valor como valor y como clave el título de la película

// Bloque I de la Entrega Final 

-Boolean existePeliculaDirectorYActor1(String titulo, String director, String actor): Devuelve un Booleano acorde si la película titulo contiene al director y al actor actor
	
-Map<TipoCensura, Integer> contadorPorTipoCensura2(): Es una función que cuenta según los valores del Tipo Censura
	
-List<String> peliculasCategoria2(String categoria): Devuelve una lista con los títulos de las películas que presentan la categoría
	
-String getPeliculaMaxRecaudacionPorCategoria(String categoria): Es una función que cuenta vuelve el título de la película que tiene más recaudación de la categoría
	
-List<String> getNPeliculasJustoMásRecaudacionQue (Double n, Integer limite) Es una función que devuelve una lista de las N peliculas que tienen más recaudación que ciertos millones.

	
	
//Bloque II de la Entrega Final
	
-Map<String, Integer> contadorPorTipoCategoria2(): Es una función que cuenta por el tipo de categoría
	
-int getMediaRecaudaciones(): Es una función que devuelve la media de las recaudaciones
	
-List<String> getNPeliculasMaxRecaudacion(Integer n): Es una función que devuelve el N números de películas con el máximo de recaudación

-Map<TipoCensura, List<String>> getNMayorCalificacionDeTipoCensura(TipoCensura tipo, Integer n): Es una función que devuelve el N número de calificaciones según el tipo de censura
	
-Map<Integer, Double> maxCalificacionDeAnyo(): Es una función que devuelve el máximo de calificación de una película por cada año
	