package miPrincipal;
/*
 * Proposito:dados los enteros a y b, calcule y escriba, el resultado de la siguiente expresión (a+b)^2/3b
 * Autor: Lourdes Armenta
 * Fecha: 11 de marzo 2025
 */

import java.util.Scanner;

public class Examen11 {

    public static void main(String args[]) {
        //crear la clase Scanner
        Scanner teclado = new Scanner(System.in);
        //datos entrada
        int a,b ;
        //datos de salida
        double r;

        System.out.print("Proporciona valor de a:");
        a = teclado.nextInt();
        System.out.print("proporciona valor de b:");
        b = teclado.nextInt();

        //r = Math.pow((a+b), 2);


        r = Math.pow((a+b),2)/(3*b);
        /*
         * a = 2
         * b = 1
         * (2+1)^2/3*1
         * 3 ^2/3*1
         * 9 / 3 = 3
         * 
         * a = 5
         * b = 2
         * (5+2)^2/3*2
         * 7 ^2/3*2
         * 49/ 6 = 8.166666667
         * 
         */

        System.out.println("El resultado de r = "+r);

        teclado.close();



    }


    
    
}
