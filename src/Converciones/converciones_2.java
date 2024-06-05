package Converciones;

import java.util.Scanner;

public class converciones_2 {
    public static void conversiones_1(){
    Scanner op=new Scanner(System.in);
        System.out.println("[?]");
    int op_2=op.nextInt();
    Scanner intD=new Scanner(System.in);
            System.out.println("ingresa el primer numero: ");
    int num1 = intD.nextInt();
            System.out.println("Ingrese el segundo número: ");
    int num2 = intD.nextInt();
    }
    public static int multiplicacion(int num1, int num2){
        int r_multiplicacion= num1*num2;
        System.out.println(r_multiplicacion);
        return r_multiplicacion;

    }
}