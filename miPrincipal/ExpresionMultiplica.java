package miPrincipal;
/*
 * Proposito:Elaborar un algoritmo que dados los datos:a,b,c y d  que
	representan numero enteros, multipique cada uno de ellos por 10
    en imprima el resultado
 * Autor: Lourdes Armenta
 * Fecha:  26 de febrero 2025
 */
import java.util.Scanner;
public class ExpresionMultiplica{
    public static void main(String[] args) {
        //Definir variables auxiliares
        Scanner entrada = new Scanner(System.in);
        //Definir las variables de salida

        //Definir variables de entrada
        byte a,b,c,d;

        System.out.print("Proporciona valor de a:");
        a = entrada.nextByte();
        System.out.print("Proporciona valor de b:");
        b = entrada.nextByte();
        System.out.print("Proporciona valor de c:");
        c = entrada.nextByte();
        System.out.print("Proporciona valor de d:");
        d = entrada.nextByte();

        System.out.println("Valor de a*10 = "+a*10);
        System.out.println("Valor de b*10 = "+b*10);
        System.out.println("Valor de c*10 = "+c*10);
        System.out.println("Valor de d*10 = "+d*10);

        entrada.close();
        
    }
    



}