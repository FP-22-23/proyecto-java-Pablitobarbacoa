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
    * **walmart_com-ecommerce_product_details.csv**: Archivo csv que muestra información sobre las películas más populares en IMDb desde 1898 hasta 2022.
    
## Estructura del *dataset*

El dataset original cuenta con 8 columnas. Aunque, he añadido dos más, una de tipo Booleano llamada "Contiene Sexo" y otra de Tipo Double que se llama "Recaudación(en millones de dólares)", así, ya están todos los tipos de variables en el dataset, o sea,el tipo String (cadena), tipo Integer(número entero), tipo Double (número real), tipo LocalDateTime (fecha), tipo Boolean y de tipo Enumerado.

El dataset está compuesto por 11 columnas, con la siguiente descripción:

* **Title**: de tipo cadena, representa el título de la película.
* **Director**: de tipo cadena, representa el nombre del director.
* **Stars**: es una lista del tipo cadena, representa una lista con el nombre de las estrellas que aparecen en la película.
* **IMDb-Rating**: de tipo real, representa la calificación que tiene la película según IMDb.
* **Categoría**: de tipo lista de cadena, representa el género al que pertenece la película.
* **Duration**: de tipo duracion, representa lo que dura la película.
* **Release Year**: de tipo fecha, representa el año de estreno de la película
* **Contiene Sexo**: de tipo booleano, representa si la película contiene escenas de sexo.
* **Recaudación(en millones de dólares)**: de tipo real, representa el número total de reacudación que ha conseguido la película.


## Tipos implementados

Los tipos que se han implementado en el proyecto son los siguientes:

### Tipo Base - PeliculasImpl
Representa una película en concreto.

**Propiedades**:

- _titulo_, de tipo String, consultable y modificable. 
- _director_, de tipo String, consultable y modificable.
- _estrellas_, de tipo List<String>, consultable y modificable.
- _calificacion_, de tipo Double, consultable y modificable.
- _duracion_, de tipo Duration, consultable y modificable.
- _anyoEstreno_, de tipo PrecioVenta, consultable y modificable. Puede ser de tres tipos distintos: Rebajado, PrecioInicial (no hay cambios en el precio) o AumentaPrecio.
- _codigo_, de tipo Integer, consultable y modificable.
- _categoria_, de tipo List<String>, consultable y modificable.
- _disponible_, de tipo Boolean, consultable y modificable.
- _totalVentas_, de tipo Integer, consultable y modificable.

**Constructores**: 

- C1: Crea un objeto de tipo Producto a partir de los siguientes parámetros: String id, LocalDateTime fechaInicio. El resto de parámetros tienen el valor null.
- C2: Crea un objeto de tipo Producto a partir de los siguientes parámetros: String id, LocalDateTime fechaInicio, String nombreProducto, Double precioInicial, Double precioFinal, PrecioVenta precioVenta, Integer codigo, List<String> categoria, Boolean disponible, Integer totalVentas.


**Restricciones**:
 
- R1: El ID de cada producto no puede estar vacío.
- R2: Si un producto no se ha vendido ninguna vez no puede estar agotado, por lo que debe de estar disponible, es decir, si el valor de _totalSales_ es 0, _available_ no podrá ser FALSE.


**Criterio de igualdad**: Dos productos son iguales si tienen el mismo ID y nombre, son de la misma marca y tienen el mismo precio inicial.

**Criterio de ordenación**: Los productos están ordenados primero por su precio inicial y después por el número total de ventas.

**Otras operaciones**:
 
-	_Double getDiferenciaPrecio()_: Devuelve la diferencia de dinero entre el precio final e inicial del producto.

#### Tipos auxiliares
- _PrecioVenta_, enumerado. Puede tomar 3 valores distintos: REBAJADO, AUMENTAPRECIO, PRECIOINICIAL.

### Factoría
Descripción breve de la factoría.

- _método 1_: Descripción del método 1.
-	_método 2_: Descripción del método 2.

### Tipo Contenedor

Descripción breve del tipo contenedor.

**Propiedades**:

- _propiedad1_, de tipo \<Tipo1\>, consultable. 
- _propiedad2_, de tipo \<Tipo2\>, consultable y modificable. 
- ...
- 
**Constructores**: 

- C1: Descripción del constructor 1.
- C2: Descripción del constructor 2.
- ...

**Restricciones**:
 
- R1: Descripción de la restricción 1.
- R2: Descripción de la restricción 2.
- ...
- 
**Criterio de igualdad**: Describir el criterio de igualdad

**Criterio de ordenación**: Describir el criterio de ordenación (si lo hay).

**Otras operaciones**:
 
-	_método 1_: Descripción del método 1.
- ...
