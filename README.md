# Taller 1 Dalgortimos - Marian Quevedo

## Clase Main
Es la clase donde se ubican los métodos generales del programa
* **Metodos:**
- *settings()* 
- *setup()* 
- *draw()*
- *mousePressed()*
- *keyPressed()*
- *mouseReleased()*
- *mouseDragged()*

## Clase Logica
Clase donde se realiza todo el funcionamiento y procesamiento de la información
* **Atributos:**
- *app*. Se usa para aprovechar las ventajas de core.PApplet.
- *texto*. Se añade el txt que contiene el fragmento del libro. 
- *escribir*. Se usa para la ejecución de texto con el teclado.
* **Metodos**:
- *pintar()* Se realiza toda la parte gráfica a ejecutarse
- *press()* Acciones a realizar cuando el mouse es presionado.
- *drag()* Acciones a realizar cuando el mouse arrastra un objeto.
- *tecla()* Se usa cuando el usuario presiona una tecla del teclado.

## Clase Particula
Clase padre que conserva atributos y metodos abstractos a utilizar por las hijas. 
* **Atributos:**
- *posX*. Ubicación en x.
- *posY*. Ubicación en y.
- *mover*. Cuando el usuario decide mover un elemento.
* **Metodos**:
- *pintar()* Parte gráfica. A decisión de las hijas. Método abstracto.
- *mover()* Movimiento. A decisión de las hijas. Método abstracto.

## Clase Maiz
Hija de la clase Particula.
* **Atributos:**
Los mismos que el padre.
* **Metodos**:
- *pintar()* Definición gráfica de la clase Maiz.
- *mover()* Definición gráfica de la clase Maiz.
- *getX()* Obtiene la posición en X.
- *getY()* Obtiene la posición en Y.
- *setX(int)* Modifica la posición de la variable.
- *setY(int)* Modifica la posición de la variable.

## Clase Cafe
Hija de la clase Particula.
* **Atributos:**
Los mismos que el padre.
* **Metodos**:
- *pintar()* Definición gráfica de la clase Cafe.
- *mover()* Definición gráfica de la clase Cafe.
- *getX()* Obtiene la posición en X.
- *getY()* Obtiene la posición en Y.
- *setX(int)* Modifica la posición de la variable.
- *setY(int)* Modifica la posición de la variable.

## Clase Rosa
Hija de la clase Particula.
* **Atributos:**
Los mismos que el padre.
* **Metodos**:
- *pintar()* Definición gráfica de la clase Rosa.
- *mover()* Definición gráfica de la clase Rosa.
- *getX()* Obtiene la posición en X.
- *getY()* Obtiene la posición en Y.
- *setX(int)* Modifica la posición de la variable.
- *setY(int)* Modifica la posición de la variable.

## Clase Lluvia
Clase que genera particulas como lluvia.
* **Atributos:**
- *x*. Posición en X.
- *y*. Posición en Y.
* **Metodos**:
- *pintar()* Definición gráfica de la clase Lluvia.

## Clase Reloj
Clase que genera un objeto gráfico de reloj.
* **Atributos:**
- *posX*. Posición en X.
- *posY*. Posición en Y.
- *mover*. Se usa cuando el usuario decide mover las manecillas.
- *angulo1*. Angulo de la primera manecilla.
- *angulo2*. Angulo de la segunda manecilla.
* **Metodos**:
- *pintar()* Definición gráfica de la clase Reloj.
- *manecilla()* Se usa cuando el usuario mueve las manecillas.
- *getAng1()* Obtiene el valor del angulo 1.
- *getAng2()* Obtiene el valor del angulo 2.
- *setAng1(float)* Modifica la variable.
- *setAng2(float)* Modifica la variable.

## Clase Gallo
Clase que genera un objeto gráfico de un gallo geométrico.
* **Atributos:**
- *x*. Posición en X.
- *y*. Posición en Y.
* **Metodos**:
- *pintar()* Definición gráfica de la clase Gallo.
- *mover()* Se usa cuando el usuario mueve el objeto.


