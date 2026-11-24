public abstract class Producto {

    //PRIMERO: Una clase abstracta no puede instanciarse (no se usa constructor)
    //SEGUNDO: Podemos definir metodos abstractos y metodos normales

    protected String codigo;
    protected String nombre;
    protected String descripcion;
    protected double precio;


    //No se usa en otras clases, solo para llamarlo como super(...)
    public Producto(String codigo, String nombre, String descripcion, double precio){
        this.codigo = codigo;
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.precio = precio;
    }

    public String getNombre() {
        return this.nombre;
    }

    public String getCodigo() {
        return this.codigo;
    }

    public String getDescripcion() {
        return this.descripcion;
    }

    public double getPrecio() {
        return this.precio;
    }

    public void setPrecio(double precio){
        this.precio = precio;
    }

    //Metodos abstractos que voy a obligar a implementar en sus hijos
    public abstract double obtenerDescuento();

    public abstract String obtenerCalificacion();


    //Sobreescritura del toString()
    @Override
    public String toString(){
        StringBuilder sb = new StringBuilder();
        sb.append("Codigo: ").append(this.codigo).append("\n");
        sb.append("Nombre: ").append(this.nombre).append("\n");
        sb.append("Descripcion: ").append(this.descripcion).append("\n");
        sb.append("Precio: ").append(this.precio).append("\n");
        return sb.toString();
    }



}
