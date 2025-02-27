package miPrincipal;
/*
 *  Proposito: Se necesita obtener el promedio aritmetico de un estudiante
	            a partir de sus tres notas parciales
    Autor: Lourdes Armenta
	Fecha: 27 de febrero de 2025
 */

 import java.util.Scanner;
 public class PromedioTresNotas {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        //definir salida
        float p;
        //definir entrada
        int p1,p2,p3;
        System.out.print("Proporciona valor del parcial 1:");
        p1 = entrada.nextInt();
        System.out.print("Proporciona valor del parcial 2:");
        p2 = entrada.nextInt();
        System.out.print("Proporciona valor del parcial 3:");
        p3 = entrada.nextInt();

        p = (p1+p2+p3)/3;

        System.out.println("Promedio = "+p);



        
    }
    
}
