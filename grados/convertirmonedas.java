package monedas;

import Lista.listaOpciones;


import java.util.Scanner;

public class convertirmonedas {

    public static void cargarlista_1() {

        String[] listaDeOpciones = {
                "Quetzales/Dolares", "Dolares/Quetzales",
                "Quetzales/Pesos", "Pesos/Quetzales"
        };
        listaOpciones.cargarOpciones(listaDeOpciones);

        Scanner op = new Scanner(System.in);
        System.out.println("[?]");
        int op_2 = op.nextInt();

        Scanner intD = new Scanner(System.in);
        System.out.println("ingresa el primer numero: ");
        int num1 = intD.nextInt();


        switch (op_2) {

            case 1:
                System.out.println("resultado qyd: " + QyD(num1));
                break;
            case 2:
                System.out.println("resultado dyq: " + DyQ(num1));
                break;
            case 3:
                System.out.println("resultado qyp: " + QyP(num1));
                break;
            case 4:
                System.out.println("resultado pyq: " + PyQ(num1));
                break;

        }
    }

    public static double QyD(double num1) {
        double r_qyd = num1 / 7.80;
        System.out.println(r_qyd);
        return r_qyd;

    }

    public static double DyQ(double num1) {
        double r_dyq = num1 * 7.80;
        System.out.println(r_dyq);
        return r_dyq;
    }

    public static double QyP(double num1) {
        double r_qyp = num1 * 2.39;
        System.out.println(r_qyp);
        return r_qyp;

    }

    public static double PyQ(double num1) {
        double r_qyp = num1 / 2.39;
        System.out.println(r_qyp);
        return r_qyp;

    }
}