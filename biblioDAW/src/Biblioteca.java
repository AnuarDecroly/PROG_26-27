import model.Libro;

public class Biblioteca {

    //Atributos de la clase
    private String codigo;
    private String nombre;
    private String direccion;
    private String email;
    private String nTelefono;

    //Atributos de la clase relacionados con la Coleccion de Libros
    private Libro[] libros;
    private int nLibrosActuales;
    private final int dimensionInicial = 100;

    //Constructor
    public Biblioteca(String codigo, String nombre, String direccion, String email, String nTelefono){
        this.codigo = codigo;
        this.nombre =  nombre;
        this.direccion = direccion;
        this.email = email;
        this.nTelefono = nTelefono;

        this.libros = new Libro[this.dimensionInicial];
        this.nLibrosActuales = 0;
    }

    /*
    Getters y setters de nuestros atributos
     */

    public String getCodigo() {
        return this.codigo;
    }

    public String getDireccion() {
        return this.direccion;
    }

    public String getEmail() {
        return this.email;
    }

    public String getNombre() {
        return this.nombre;
    }

    public String getnTelefono() {
        return this.nTelefono;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setnTelefono(String nTelefono) {
        this.nTelefono = nTelefono;
    }

    public int getnLibrosActuales() {
        return this.nLibrosActuales;
    }

    //Insertar libros en la biblioteca


    //Eliminar libro


    //Buscar libro por ISBN
    public boolean insertarLibro(Libro libro){
        boolean resultado = false;

        //Comprobación si es distinto de null para evitar excepcion NullPointer, en caso contrario devuelvo false
        if(libro != null){
            if(this.nLibrosActuales < this.libros.length){
                this.libros[this.nLibrosActuales] = libro;
                this.nLibrosActuales++;
                resultado = true;
            }
            else{
                //No hay especio en el array para insertar
                this.ampliarDimensionBiblioteca();
                this.libros[this.nLibrosActuales] = libro;
                this.nLibrosActuales++;
                resultado = true;
            }

            //Algoritmo refactorizado u optimizado
//            if(this.nLibrosActuales >= this.libros.length ){
//                this.ampliarDimensionBiblioteca();
//            }
//            this.libros[this.nLibrosActuales] =  libro;
//            this.nLibrosActuales++;
//            resultado = true;
//

        }

        return resultado;
    }



    //Mostrar informacion de la biblioteca
    public String infoBiblioteca(){
        String infoBiblio = "";
        infoBiblio += "Codigo: " + this.codigo + "\n";
        infoBiblio += "Nombre: " + this.nombre + "\n";
        infoBiblio += "Dirección: " + this.direccion + "\n";
        infoBiblio += "Email: " + this.email + "\n";
        infoBiblio += "Nº Teléfono: " + this.nTelefono + "\n";
        infoBiblio += "Nº de libros actuales: " + this.nLibrosActuales + "\n";

        return infoBiblio;
    }

    //Mostrar informacion de todos los libros almacenados

    //Ampliar dimension del array
    private void ampliarDimensionBiblioteca(){
        Libro [] librosAux = new Libro[this.libros.length + this.dimensionInicial];
        for(int i = 0; i < this.libros.length; i++){
            librosAux[i] = this.libros[i];
        }
        this.libros = librosAux;
    }
}
