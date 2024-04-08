package libros;

public class Libro {

    private String título;
    private boolean prestado;

    public Libro(String título) {
        this.título = título;
        prestado = false;
    }

    public String getTítulo() {
        return título;
    }

    public void setTítulo(String título) {
        this.título = título;

    }

    public boolean isPrestado() {
        return prestado;
    }

    public void setPrestado(boolean prestado) {
        this.prestado = prestado;
    }

    public boolean prestarLibro() {
        if (!prestado) {
            prestado = true;
            return true;
        } else {
            return false;
        }
    }

    public boolean devolverLibro() {
        if (prestado) {
            prestado = false;
            return true;
        } else {
            return false;
        }
    }

   
}
