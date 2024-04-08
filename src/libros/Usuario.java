package libros;

import java.util.ArrayList;
import java.util.List;

public class Usuario {

    private String nombre;
    private List<Libro>librosUsuario;

    public Usuario(String nombre) {
        this.nombre = nombre;
        this.librosUsuario = new ArrayList<>();
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public List<Libro> getLibrosUsuario() {
        return librosUsuario;
    }

    public void setLibrosUsuario(List<Libro> librosUsuario) {
        this.librosUsuario = librosUsuario;
    }

    public boolean asignarLibro (Libro libroAprestar){
        if (libroAprestar.prestarLibro()) {
            this.librosUsuario.add(libroAprestar);
            System.out.println("El libro "+libroAprestar.getTítulo()+" se ha prestado a "+this.getNombre());
            return true;
        }else{

            System.out.println("El libro "+libroAprestar.getTítulo()+" no se ha prestado a nadie ");

            return false;
        }
        }

        public boolean devolverLibro(Libro libroADevolver){
            if (librosUsuario.contains(libroADevolver)) {

                librosUsuario.remove(libroADevolver);
                libroADevolver.setPrestado(false);
                System.out.println("El libro"+libroADevolver.getTítulo()+"a sido devuelto por "+this.getNombre());

                return true;
                
            }else{
             System.out.println("El usuario"+this.getNombre()+"no tiene el libro a devolver "+libroADevolver.getTítulo());
            return true;
            }
        }

        public void listarlibroUsuario(){

            System.out.println("El usuario "+this.getNombre()+" tiene prestados los siguientes libros");

            System.out.print("[ ");

            for (Libro libro : librosUsuario) {
                System.out.print(libro.getTítulo()+" ");
            }

            System.out.println("]");
        }
        
    }

    
    

