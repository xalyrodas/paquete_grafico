package src;

import Edad.Edad_1;
import IG.Banner;
import Lista.ListaDeCompras;
import opciones.listaOpciones;
import java.util.Scanner;
import matematicas.Mate;
import  programas.IMC;
import src.Libros.Biblioteca;
import src.grados.programa_grados;
import src.monedas.convertirmonedas;

public class Main {
    public static void main(String[] args) {
        //lista de opcipnes
        String[] listaDeOpciones = {
                "Calculadora", "IMC",
                "Farenheit / Celsius", "Calcular edad",
                "Grados", "Opción_6",
                "Opción_7", "Opción_8",
                "Opción_9", "Salir"
        };
        //metodo main
        boolean programa= true;
        do {
            //invocar a la clase banner y su metodo mensaje()
            Banner.mensaje();
            //nombreClase.nombreMetodo
            listaOpciones.cargarOpciones(listaDeOpciones);

            /*
             *@Scanner creado un objeto
             *@System imprime en consola un mensaje
             * @int almacena el valor del scanner (intoOpcion)
             * @nextInt() convierte la salida en un scanner en un numero entero()
             */

            //Pedir una opcion
            Scanner opcion = new Scanner(System.in);
            System.out.println("[?]: ");
            int opcion_1 = opcion.nextInt();
            System.out.println("-----------------------------------------------------------------------------------------------------------------------------------------------------");
            //cargar opcion del usuario
            switch (opcion_1){
                case 1:
                    Mate.cargarlista_1();
                    break;
                case 2: IMC.programaIMC();
                    break;
                case 3:
                    programa_grados.pgrados();
                    break;
                case 4:
                    Edad_1.solicitarYCalcularEdad();
                    break;
                case 5:
                    ListaDeCompras.list();
                    break;
                case 7:
                    convertirmonedas.cargarlista_1();
                    break;
                case 8:
                    Biblioteca.programa();
                    break;
                case 10:
                    programa=false;
                    break;
            }
        }while(programa);
    }
}
