package miPrincipal;
/*
 * Proposito:Elaborar un programa para calcular el valor de Y  de siguiente fórmula Y = A%C+B.
   Autor : Lourdes ArmentaAutor:
 * Fecha:12 de marzo 2025
 */
import java.util.Scanner;
public class Examen12 {
    public static void main(String[] args) {
        //definir objeto Scanner
        Scanner entrada = new Scanner(System.in);
        //definir variable de salida
        int y;

        //definir variable de entrada
        short a,c;
        float b;

        System.out.print("Proporciona un valor entero para la variable a:");

        a = entrada.nextShort();

        System.out.print("Proporciona un valor real para la variable b:");
        b = entrada.nextFloat();

        System.out.print("Proporciona un valor entero para la variable c:");
        c = entrada.nextShort();

        y = (int)(a % c + b); //conversion explicita

        System.out.println("El valor de y = "+y);
    }

        
    
    
}
