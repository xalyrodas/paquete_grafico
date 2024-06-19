package matematicas;

import java.util.Scanner;

public class Mate{
    public static void cargarlista_1(){

        String[] listaDeOpciones = {
                "suma","resta",
                "multiplicacion","dividir"
        };

        listaDeOpciones.equals(listaDeOpciones);


        Scanner op=new Scanner(System.in);
        System.out.println("[?]");
        int op_2=op.nextInt();


        //
            Scanner intD=new Scanner(System.in);
            System.out.println("ingresa el primer numero: ");
            int num1 = intD.nextInt();
            System.out.print("Ingrese el segundo número: ");
            int num2 = intD.nextInt();

            switch (op_2){

                case 1:
                    Mate.suma(num1,num2);
                    break;
                case 2:
                    Mate.resta(num1,num2);
                    break;
                case 3:
                    Mate.multiplicacion(num1,num2);
                    break;
                case 4:
                    Mate.dividir(num1,num2);
                    break;
            }
        }

        //
    public static int suma(int num1, int num2){
        int r_suma= num1+num2;
        System.out.println(r_suma);
        return r_suma;


    }

    //
    public static int resta(int num1, int num2){
        int r_resta= num1-num2;
        System.out.println(r_resta);
        return r_resta;

    }

    //
    public static int multiplicacion(int num1, int num2){
        int r_multiplicacion= num1*num2;
        System.out.println(r_multiplicacion);
        return r_multiplicacion;




    }

    //
    public static double dividir(double num1, double num2){
        double r_dividir_1=num1/num2;
        System.out.println(r_dividir_1);
        return r_dividir_1;

    }

}
