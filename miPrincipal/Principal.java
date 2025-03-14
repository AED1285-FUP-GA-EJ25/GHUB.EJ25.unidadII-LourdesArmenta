package miPrincipal;


import biblioteca.Libro;
import biblioteca.Usuario;
import biblioteca.Autor;

public class Principal {
    

    public static void main(String[] args) {
        System.out.println("Bienvenidos a nuestra clase de Fundamentos de programacion");

        Libro libro = new Libro();
        libro.leer();

        Autor autor = new Autor();
        autor.saludar();

        Usuario usuario = new Usuario(); 
        int tipo = usuario.tipoUsuario();
        System.out.println("Esto es lo que regresa tipoUsuario: "+tipo);

        //tipo de datos basicos
        //Entero
        int var1; //declara o crea una variable de nombre var1 que puede albergar un int
        var1 = 5; //le asigno el valoe 5 a la variable var1
        System.out.println("El valor de la variable var1 = "+var1);
        var1 = -500;
        System.out.println("El valor de la variable var1 = "+var1);
        //var1 = "maria"; no se permite porque var1 esta definido como un int y no puede alberga String
        var1 = -2147483648;
        System.out.println("El valor de la variable var1 = "+var1);
        var1 =  2147483647;
        System.out.println("El valor de la variable var1 = "+var1);
        //var1 =  2147483648; no se permite porque sale del rango de una variable tipo int

        var1 = 0xA; //cuando antepongo con el sufijo 0x a una constante literal,
                    //el sistema lo toma en haxadecimal
        System.out.println("El valor de la variable var1 en hexadecimal= "+var1);

        var1 = 07; //cuando antegon el 0 indico que la constante litetal es octal
        System.out.println("El valor de la variable var1 en octal= "+var1);

        short var2; //declarando una varianle de nombre var2 como short
        var2 = 100;
        System.out.println("El valor de la variable var2 = "+var2);

        //var2 = 33000;  no se permite porque excede el rango permitido para un short

        long var3 =   -9223372036854775808L;
        var3 =    9223372036854775807L;
        System.out.println("El valor de la variable var3 = "+var3);

        var3 = 1; //desperdicio memoria
        System.out.println("El valor de la variable var3 = "+var3);

        byte var4 = 127;
        System.out.println("El valor de la variable var4 = "+var4);

        //representar en java valores reales
        float var5 = 3.40282347e+38F;
        System.out.println("El valor de la variable var5 = "+var5);
        var5 = 3.1416f;
        var5 = 3.1416e3F;
        System.out.println("El valor de la variable var5 = "+var5);
        var5 = 3.1416e-3F;
        System.out.println("El valor de la variable var5 = "+var5);

        double var6 = 1.79769313486231570E+308;
        System.out.println("El valor de la variable var6 = "+var6);
        var6 = 1.79769313486231570E-308;
        System.out.println("El valor de la variable var6 = "+var6);
        var6 = 1.0;
        System.out.println("El valor de la variable var6 = "+var6);

        //Representar los valores especiales de los numeros reales
        System.out.println(Math.sqrt(4));
        System.out.println(Math.sqrt(-1));
        System.out.println(1.1e200*1.1e200);
        System.out.println(-1.1e200*1.1e200);
        
        //representacion de datos tipo caracter

        char var7 = 'A';
        System.out.println("El valor del caracter es "+var7);

        char var8 = 99; //converte el codigo assci a caracter
        System.out.println("El valor del caracter es "+var8);

        var8=64;
        System.out.println("El valor del caracter es "+var8);

         //tipo de datos boleanos
         boolean var9;
         var9 = true;
         System.out.println("el contenido de la variable var9 : "+var9);
         var9 = false;
         System.out.println("el contenido de la variable var9 : "+var9);

         if (var9)
            System.out.println("Verdadero");
         else
            System.out.println("Falso");

        var9 = 5>0; //expresion relacional
        System.out.println("el contenido de la variable var9 : "+var9);

        var9 = 5==6; //expresion relacional de igualfda
        System.out.println("el contenido de la variable var9 : "+var9);

        //calcular el area de un circulo
        




         





        
        









        
        



    






        








        



        

        
    }
}