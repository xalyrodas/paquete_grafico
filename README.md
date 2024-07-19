# paquete_grafico
¡Bienvenido a mi portafolio de java! en este repositorio encontraras una coleccion de programas  que he desarrollado para diversos propositos. cada sub directorio contiene un programa espesifico con su funcionabilidad a continuacion veremos una breve descripcion de cada uno de ellos...  

# Descripcion de los programas 

# MAIN

Este codigo La funcionalidad del programa se basa en la interacción del usuario a través de la consola, donde puede seleccionar diferentes opciones que ejecutan distintos métodos de diferentes clases. A continuación, se detallan los componentes del código:


## Paquetes Importados

## El código importa varios paquetes y clases:

#### matematicas.Edad_1
#### IG.Banner
#### Lista.ListaDeCompras
#### opciones.listaOpciones
#### matematicas.Mate
#### programas.IMC

## Clase Principal
La clase principal del programa es Main, la cual contiene el método main que es el punto de entrada del programa.

### 1.Lista de opciones 
Aquí se define un arreglo de String con las opciones que se presentarán al usuario.
### 2.Bucle do-while
El programa utiliza un bucle do-while para continuar ejecutándose hasta que el usuario elija salir.
En cada iteración del bucle:

* Se muestra un banner.
* Se cargan las opciones del menú.

### 3. Opción del Usuario

* Scanner opcion = new Scanner(System.in); 
System.out.println("[?]: ");
int opcion_1 = opcion.nextInt();
System.out.println("-"); 

Aquí se utiliza Scanner para capturar la opción seleccionada por el usuario y almacenarla en la variable opcion_1.

### 4.Ejecución de Opciones:
Dependiendo de la opción seleccionada por el usuario, se ejecuta el método correspondiente:
#### CODIGO
* switch (opcion_1) {
case 1:
Mate.cargarlista_1();
break;
case 2:
IMC.programaIMC();
break;
case 4:
Edad_1.solicitarYCalcularEdad();
break;
case 5:
ListaDeCompras.list();
break;
case 10:
programa = false;
break;
}
#### EXPLICACION
 * Case 1: Llama al método cargarlista_1 de la clase Mate.
 * Case 2: Llama al método programaIMC de la clase IMC.
 * Case 4: Llama al método solicitarYCalcularEdad de la clase Edad_1.
 * Case 5: Llama al método list de la clase ListaDeCompras.
 * Case 10: Establece la variable programa en false para salir del bucle y finalizar el programa.

#
* Como punto final tenemos que el programa es un menú interactivo de consola que permite al usuario seleccionar entre diferentes opciones que ejecutan métodos específicos de varias clases importadas. Utiliza un bucle do-while para mantener el programa en ejecución hasta que el usuario decida salir, momento en el cual se detiene el bucle y finaliza el programa.

#
# Banner
Este código es programa que pertenece al paquete IG. Define una clase llamada Banner con un método estático llamado mensaje. El método mensaje imprime un mensaje en la consola utilizando System.out.println. El mensaje es un banner ASCII, adornado con líneas horizontales de guiones y delimitadores de secciones, con algunas letras y caracteres formateados de manera especial.

+ A continuacion lo desglosaremos
#### Paquete y clase:
* package IG; -paquete

* public class Banner { - clase 

La clase Banner está en el paquete IG.

#### Método mensaje:
+ public static void mensaje(){
####
  El método mensaje es estático, por lo que se puede llamar sin crear una instancia de Banner.
### Contenido del banner
+ Imprime un bloque grande de texto que contiene un banner en estilo ASCII art.
+ El símbolo # parece ser utilizado como separador visual en el texto.
+ El uso de \n indica que hay saltos de línea dentro del texto, para mantener el formato.

### Ejecución
Para ejecutar este código, deberías llamar al método mensaje de la clase Banner desde el método main en otra clase o en la misma clase. 

package IG;

public class Main {


public static void main(String[] args) {


Banner.mensaje();

      }

}

+ Este código está en el mismo paquete IG y define un método main que llama al método mensaje de la clase Banner. Al ejecutar Main, se imprimirá el banner en la consola.
#### RESUMEN 
El código define un banner de texto artístico que se puede imprimir en la consola. El banner contiene un diseño estilizado utilizando caracteres ASCII y está organizado de una manera específica para mantener la alineación visual.

# Lista 
Este código es una implementación básica de una lista de compras en Java. A continuación, les  explico cada parte del código..

#### Importaciones
+ package Lista;: Define que esta clase pertenece al paquete Lista.
+ import opciones.listaOpciones;: Importa una clase externa listaOpciones del paquete opciones. Asumimos que esta clase maneja opciones del menú.
+ import java.util.ArrayList;: Importa la clase ArrayList que se utiliza para crear listas dinámicas.
+ import java.util.List;: Importa la interfaz List que es una colección ordenada.
+ import java.util.Scanner;: Importa la clase Scanner para leer la entrada del usuario.

##### Clase ListaDeCompras
+ public class ListaDeCompras {


  Declara la clase ListaDeCompras.
  
#### Variables estáticas
//lista de opciones

public static String[] opcion5 = {"lista de compras", "salir"};

opcion5: Un array de String que contiene las opciones del menú.

### Método list
    public static void list() {

     listaOpciones.cargarOpciones(opcion5);

    Scanner opcion = new Scanner(System.in);

    System.out.println("[?]");

     int a = opcion.nextInt();

    //accion

    switch (a){

    case 1:

    crearLista();

    break;

    case 2:

    System.out.println("salir");

    break;

       }

    }
1. list(): Método estático que presenta las opciones al usuario.
2. listaOpciones.cargarOpciones(opcion5);: Carga las opciones del menú mediante el método cargarOpciones de la clase listaOpciones.
3. Scanner opcion = new Scanner(System.in);: Crea un objeto Scanner para leer la entrada del usuario.
4. int a = opcion.nextInt();: Lee un número entero ingresado por el usuario.
5. switch (a): Según el valor ingresado, realiza una acción:
+ case 1: Llama al método crearLista().
+ case 2: Imprime "salir" 


### Método crearLista
     public static void crearLista(){
     List<String> listaNombre = new ArrayList<>();
    List<Double> listaprecio = new ArrayList<>();
        //perdir producto y precio
    String ad;
    double dr;
     for (int i = 1; i<3; i++){
    Scanner aly = new Scanner(System.in);
    System.out.println("producto");
    ad = aly.nextLine();
    System.out.println("precio: ");
     dr = aly.nextDouble();
     //agregar a la lista vacia
      listaNombre.add(ad);
      listaprecio.add(dr);
     }
     //mostrar lista
    System.out.println(listaNombre + "------->" + listaprecio);
     }
1. crearLista(): Método estático que crea una lista de compras.
2. List<String> listaNombre = new ArrayList<>();: Crea una lista para almacenar los nombres de los productos.
3. List<Double> listaprecio = new ArrayList<>();: Crea una lista para almacenar los precios de los productos.
4. for (int i = 1; i<3; i++): Itera dos veces para pedir al usuario que ingrese dos productos y sus precios (esto puede modificarse para más productos).
5. Scanner aly = new Scanner(System.in);: Crea un nuevo objeto Scanner en cada iteración (esto no es necesario, se puede crear una sola vez fuera del bucle).
6. System.out.println("producto");: Pide al usuario ingresar el nombre del producto.
7. ad = aly.nextLine();: Lee el nombre del producto.
8. System.out.println("precio: ");: Pide al usuario ingresar el precio del producto.
9. dr = aly.nextDouble();: Lee el precio del producto.
10. listaNombre.add(ad);: Agrega el nombre del producto a la lista listaNombre.
11. listaprecio.add(dr);: Agrega el precio del producto a la lista listaprecio.
12. System.out.println(listaNombre + "------->" + listaprecio);: Muestra las listas de nombres y precios de los productos.

# Mate
Vamos a desglosar y analizar el código de la clase Mate paso a paso. Este código es parte del paquete matematicas y depende de otra clase listaOpciones de un paquete llamado opciones. A continuación, les explico cada sección y el flujo general de la ejecución.

### Paquetes y Importaciones
     package matematicas;

     import java.util.Scanner;
    import opciones.listaOpciones;
1. Paquete matematicas: El archivo Java pertenece al paquete matematicas.
2. Importación de Scanner: Importa la clase Scanner del paquete java.util, que se usa para la entrada de datos.
3. Importación de listaOpciones: Importa una clase llamada listaOpciones desde el paquete opciones, que parece manejar listas de opciones.

### Clase Mate
     public class Mate {
Esta es la clase principal llamada Mate.

### Método cargarlista_1
    public static void cargarlista_1() {
Este método estático se encarga de manejar la entrada y la selección de operaciones matemáticas.

### Listado de Operaciones
     String[] listaDeOpciones = {
      "suma", "resta",
     "multiplicacion", "dividir"
     };

    listaOpciones.cargarOpciones(listaDeOpciones);
1. Array de opciones: Se crea un array de cadenas que representa las operaciones matemáticas disponibles: suma, resta, multiplicación y división.
2. Carga de opciones: Se pasa este array al método cargarOpciones de la clase listaOpciones. Esto probablemente guarda o muestra estas opciones para que el usuario pueda seleccionarlas.

### Selección de Operación
    Scanner op = new Scanner(System.in);
    System.out.println("[?]");
    int op_2 = op.nextInt();
1. Creación del Scanner: Se crea una instancia de Scanner para leer la entrada del usuario.
2. Entrada del usuario: El sistema espera una entrada numérica del usuario que se almacena en op_2. Esta entrada determina qué operación matemática se ejecutará.

### Entrada de Números
     Scanner intD = new Scanner(System.in);
     System.out.println("ingresa el primer numero: ");
     int num1 = intD.nextInt();
    System.out.print("Ingrese el segundo número: ");
    int num2 = intD.nextInt();
1. Creación del segundo Scanner: Otro Scanner para leer los dos números sobre los cuales se realizará la operación.
2. Entrada de números: El usuario introduce dos números enteros que se almacenan en num1 y num2.

### Selección de la Operación Matemática
     switch (op_2) {
      case 1:
     Mate.suma(num1, num2);
    break;
    case 2:
    Mate.resta(num1, num2);
     break;
    case 3:
    Mate.multiplicacion(num1, num2);
    break;
    case 4:
    Mate.dividir(num1, num2);
     break;
     }

1. Estructura switch: Evalúa el valor de op_2 para determinar qué operación ejecutar.
2. Casos:

+ 1: Llama al método suma.

+ 2: Llama al método resta.

+ 3: Llama al método multiplicacion.

+ 4: Llama al método dividir.

### Métodos de Operaciones Matemáticas
Cada uno de estos métodos realiza una operación matemática específica y devuelve el resultado he aqui un ejemplo se utiliza el mismo metodo para crearlos pero con la diferencia que cambian de operacion matematica.

#### Método suma
    public static int suma(int num1, int num2) {
    int r_suma = num1 + num2;
    System.out.println(r_suma);
    return r_suma;
     }
Suma num1 y num2, imprime el resultado y lo devuelve.

### RESUMEN 
1. Se definen las opciones de operaciones matemáticas.
2. Se cargan estas opciones usando una clase externa listaOpciones.
3. El usuario elige una operación.
4. El usuario introduce dos números.
5. Según la elección del usuario, se realiza la operación correspondiente y se muestra el resultado.

# Opciones 
El código  pertenece a un paquete denominado src.opciones, y define una clase llamada listaOpciones.

### Paquete y Definición de la Clase
    package src.opciones;

    public class listaOpciones {
1. Paquete: package src.opciones; especifica que esta clase pertenece al paquete src.opciones.
2. Clase: public class listaOpciones define una clase pública llamada listaOpciones.

#### Método cargarOpciones
     public static void cargarOpciones(String[] opciones) {
+ Firma del Método: public static void cargarOpciones(String[] opciones) es un método público y estático que recibe un array de cadenas String llamado opciones.
+ Propósito: Este método carga y muestra las opciones en grupos de dos, cada grupo en una línea separada.

           int elementoMasGrande = encontrarElementoMasGrande(opciones).length();
+ Se llama al método encontrarElementoMasGrande para encontrar la longitud del elemento más largo en el array opciones.

       for (int i = 0; i < opciones.length; i++) {
      System.out.printf("[%d] %s ", i + 1, opciones[i]);
1. Iteración: Un bucle for que itera sobre cada elemento del array opciones.
2. Salida Formateada: System.out.printf("[%d] %s ", i + 1, opciones[i]); imprime el índice (empezando desde 1) y el elemento correspondiente del array.

       for(int j = 0; j < (elementoMasGrande - opciones[i].length()); j++) {
       System.out.print(" ");
       }
+ Ajuste de Espacios: Este segundo bucle for imprime espacios adicionales para alinear visualmente los elementos de la lista. La cantidad de espacios se calcula como la diferencia entre la longitud del elemento más grande y la longitud del elemento actual.

       if ((i + 1) % 2 == 0) {
       System.out.println("");
       }

+ Salto de Línea: Después de imprimir dos elementos (cuando el índice i es impar, considerando que empieza desde 0), se inserta un salto de línea para agrupar las opciones de dos en dos.

#### Método encontrarElementoMasGrande
     public static String encontrarElementoMasGrande(String[] listaDeOpciones) {
    String elementoMasGrande = listaDeOpciones[0];

    for (String opcion : listaDeOpciones) {
        if (opcion.length() > elementoMasGrande.length()) {
            elementoMasGrande = opcion;
        }
    }

    return elementoMasGrande;
    }

+ Firma del Método: public static String encontrarElementoMasGrande(String[] listaDeOpciones) es un método público y estático que recibe un array de cadenas String y retorna la cadena con mayor longitud.
+ Propósito: Encuentra el elemento más largo en términos de caracteres del array listaDeOpciones.
+ Inicialización: String elementoMasGrande = listaDeOpciones[0]; inicializa la variable elementoMasGrande con el primer elemento del array.
+ Iteración y Comparación: Un bucle for-each recorre cada opción del array y compara su longitud con la del elementoMasGrande. Si se encuentra una opción más larga, elementoMasGrande se actualiza con esta nueva opción.
+ Retorno: El método retorna la cadena con mayor longitud.
# LIBROS 

### clase biblioteca 
+ Imprime la palabra "biblioteca".
+ Crea 10 objetos de la clase libro con diferentes títulos, autores y fechas.
+ Imprime los títulos, fechas y autores de estos libros.
+ Imprime la representación en cadena de uno de los libros (libro1).
#### clase libro
+ Clase: La clase libro se declara como public, lo que significa que es accesible desde otras clases y paquetes.
+ Atributos privados: titulo, autor, y fecha son atributos privados de tipo String. Al ser privados (private), solo son accesibles dentro de la propia clase libro, lo que encapsula los datos y protege la integridad de los mismos.

### constructores
+ Constructor: Este es el constructor de la clase libro. Un constructor se utiliza para inicializar los objetos de la clase.
+ Parámetros: El constructor recibe tres parámetros (titulo, autor, fecha) que se asignan a los atributos correspondientes de la clase utilizando this para distinguir entre los nombres de parámetros y los nombres de los atributos de la clase.

+ Métodos getters: Estos métodos (getTitulo(), getAutor(), y getFecha()) son públicos y proporcionan acceso a los valores de los atributos privados de la clase. Son necesarios porque los atributos son privados y no accesibles directamente desde fuera de la clase.
 + Método toString(): El método toString() se anula (@Override) de la clase Object, que es la clase base de todas las clases en Java. Este método convierte el objeto en una cadena de texto, proporcionando una representación legible de los datos del objeto.
+  Salida: El método toString() devuelve una cadena que contiene los valores de titulo, autor y fecha del libro, formateados de una manera específica.
 este codigo es un objeto el cual describimos en este caso nombramos los autores,fecha de creacion y nombre del libro.