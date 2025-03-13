package miPrincipal;

import java.util.Scanner;

public class PromedioTresNotasV2 {
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

        p = calcular_promedio(p1,p2,p3); //invocando al metodo/funcion


        System.out.println("Promedio = "+p);
        entrada.close();
    }

    public static float calcular_promedio(int p1,int p2,int p3){
        float p ;
        p =  (float)((p1+p2+p3))/3;
        return  p;

    }

    
}
