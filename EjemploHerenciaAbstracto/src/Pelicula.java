import java.time.LocalDate;

public class Pelicula extends Producto{

    private String genero;
    private int duracion;
    private String ISAN;
    private String Director;
    private String calificacionEdad;
    private String formato;


    public Pelicula(String genero, int duracion, String ISAN, String director, String calificacionEdad, String formato,
                    String codigo, String nombre, String descripcion, double precio) {
        super(codigo, nombre, descripcion, precio);
        this.genero = genero;
        this.duracion = duracion;
        this.ISAN = ISAN;
        Director = director;
        this.calificacionEdad = calificacionEdad;
        this.formato = formato;
    }


    public String getGenero() {
        return this.genero;
    }

    public int getDuracion() {
        return this.duracion;
    }

    public String getISAN() {
        return this.ISAN;
    }

    public String getDirector() {
        return this.Director;
    }

    public String getCalificacionEdad() {
        return calificacionEdad;
    }

    public void setCalificacionEdad(String calificacionEdad) {
        this.calificacionEdad = calificacionEdad;
    }

    public String getFormato() {
        return formato;
    }

    @Override
    public double obtenerDescuento() {
        return 10;
    }

    @Override
    public String obtenerCalificacion() {
        return this.calificacionEdad;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder();
        sb.append(super.toString());
        sb.append("Genero = ").append(genero).append("\n");
        sb.append("Duracion = ").append(duracion).append("\n");;
        sb.append("ISAN = ").append(ISAN).append("\n");
        sb.append("Director =").append(Director).append("\n");
        sb.append("CalificacionEdad = ").append(calificacionEdad).append("\n");
        sb.append("Formato = ").append(formato).append("\n");
        return sb.toString();
    }


}
