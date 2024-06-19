package Lista;

import Lista.listaOpciones;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ListaDeCompras {
    //lista de opciones

    public static String[] opcion5 ={"lista de compras","salir"};
 //programa inicial
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

    //crea una lista de compras
    public static void crearLista(){
        List<String> listaNombre = new ArrayList<>();
        List<Double> listaprecio = new ArrayList<>();

        //perdir producto y precio
    String ad;
    double dr;

    for (int i = 1; i<3;i++){
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
}


