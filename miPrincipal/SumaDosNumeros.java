package miPrincipal;
 /* Proposito: impreme el resultado de la suma de dos numeros enteros
	Fecha:25/02/2025
	Autor:Lourdes Armenta
*/
import java.util.Scanner; //importa la clase Scanner que se encuentra en el paquete java.util

public class SumaDosNumeros{
   public static void main(String[] args) {
    //variables auxiliares
    Scanner entrada = new Scanner(System.in); //declara una variable tipo Scanner;
    // variable de salida
    int c; //define a la variable de nombre c como entera
    //variable de entrada
    int a,b; //define a las variables a y b como entera

    System.out.print("Proporciona el valor de la variable a:");
    a = entrada.nextInt();

    System.out.print("Proporciona el valor de la variable b:");
    b = entrada.nextInt();

    c = a + b;

    System.out.println("El resultado de la suma ="+c);

    entrada.close();

   

    
   }

}