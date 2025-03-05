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
        usuario.tipoUsuario();


        

        
    }
}