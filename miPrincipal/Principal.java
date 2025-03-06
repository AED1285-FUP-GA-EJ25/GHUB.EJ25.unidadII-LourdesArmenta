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

        short var2; //declarando una varianle de nombre var2 como short
        var2 = 100;
        System.out.println("El valor de la variable var2 = "+var2);

        //var2 = 33000;  no se permite porque excede el rango permitido para un short
        








        



        

        
    }
}