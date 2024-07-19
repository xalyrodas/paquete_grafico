import com.sun.glass.ui.Clipboard;
import matematicas.Edad_1;
import Estudiantes.primero_primaria;
import IG.Banner;
import Lista.ListaDeCompras;
import Lista.listaOpciones;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Scanner;
import matematicas.Mate;
import  programas.IMC;
import Libros.Biblioteca;
import grados.programa_grados;
import grados.convertirmonedas;
import javax.swing.*;
import javax.swing.JButton;


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

        //seccion grafica
        JFrame miVentana = new JFrame();
        miVentana.setBounds(0,0, 500,600 ); // establece perimetro o dimensiones que tendra la ventana
        miVentana.setLayout(null);




        JPanel banner = new JPanel();
        banner.setBackground(Color.blue);

        banner.setBounds(0 , 0, 500 ,50);



        miVentana.setVisible(true);// para que se visualize la ventana, siempre tiene que  ir al final de que agregemos las cosas

        JLabel a = new JLabel();
        a.setText(" prueba");
        banner.setForeground(Color.white);
        a.setBounds(0, 0, 50, 50);
        banner.add(a);
        a.setLayout(null);

        JLabel uno = new JLabel("------1");
        uno.setForeground(Color.black);
        uno.setBounds(50, 50, 150, 30);


        JLabel dos = new JLabel("--------2");
        dos.setForeground(Color.black);
        dos.setBounds(300, 50, 150, 30);


        JLabel tres = new JLabel("--------3");
        tres.setForeground(Color.black);
        tres.setBounds(50, 150, 150, 30);


        JLabel cuatro = new JLabel("--------4");

        cuatro.setForeground(Color.black);
        cuatro.setBounds(300, 150, 150, 30);


        JLabel cinco = new JLabel("--------5");

        cinco.setForeground(Color.black);
        cinco.setBounds(50, 250, 150, 30);


        JLabel seis = new JLabel("--------6");

        seis.setForeground(Color.black);
        seis.setBounds(300, 250, 150, 30);

        JButton n = new JButton("1");
        n.setBounds(400, 230,150, 30 );


        miVentana.add(n);
        miVentana.add(uno);
        miVentana.add(dos);
        miVentana.add(tres);
        miVentana.add(cuatro);
        miVentana.add(cinco);
        miVentana.add(seis);
        miVentana.add(banner);
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
                case 9:
                    primero_primaria.alumnos();
                case 10:
                    programa=false;
                    break;
            }
        }while(programa);
    }
}
