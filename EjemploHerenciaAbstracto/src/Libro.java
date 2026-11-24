import java.time.LocalDate;

public class Libro extends Producto{

    private String ISBN;
    private String autor;
    private String editorial;
    private LocalDate fechaPublicacion;
    private int nPaginas;

    public Libro(String codigo, String nombre, String descripcion, double precio,
                String ISBN, String autor, String editorial, LocalDate fechaPublicacion, int nPaginas ) {
        super(codigo, nombre, descripcion, precio);
        this.ISBN = ISBN;
        this.autor = autor;
        this.editorial = editorial;
        this.fechaPublicacion = fechaPublicacion;
        this.nPaginas = nPaginas;
    }


    @Override
    public double obtenerDescuento() {
        return 20;
    }

    @Override
    public String obtenerCalificacion() {
        return "PARA TODOS LOS PUBLICOS";
    }

    public String getISBN() {
        return ISBN;
    }

    public String getAutor() {
        return autor;
    }

    public String getEditorial() {
        return editorial;
    }

    public LocalDate getFechaPublicacion() {
        return fechaPublicacion;
    }

    public int getnPaginas() {
        return nPaginas;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder();
        sb.append(super.toString()).append("\n");
        sb.append("ISBN= ").append(ISBN).append("\n");
        sb.append("Autor= ").append(autor).append("\n");
        sb.append("Editorial= ").append(editorial).append("\n");
        sb.append("FechaPublicacion= ").append(fechaPublicacion).append("\n");
        sb.append("Numero de Paginas= ").append(nPaginas).append("\n");

        return sb.toString();
    }
}
