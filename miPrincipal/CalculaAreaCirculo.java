package miPrincipal;
/*
 * Proposito: calcular el area de un circulo utlizando una funcion y una constante
 * Autor
 * Fecha
 */
import java.util.Scanner;

public class CalculaAreaCirculo {
    public static void main(String[] args) {
        //definir objeto scanner
        Scanner entrada = new Scanner(System.in);
        //definir salida
        float area;
        //definir entrada
        float radio;
        System.out.println("Proporciona radio:");
        radio = entrada.nextFloat();
        area = calcularArea(radio);
        System.out.println("El area del circulo="+area);

        
    }

    public static float calcularArea(float radio){
        float r;
        r = (float)(Math.PI * Math.pow(radio, 2));
        
        return r;

    }
   
    
}
