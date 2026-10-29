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
    public String infoLibrosBiblioteca(){
        String infoLibros = "";
        //Recorrer el array
        for(int i = 0; i < this.nLibrosActuales; i++){
            infoLibros += this.libros[i].infoLibro() + "\n\n";
            //infoLibros = infoLibros + this.libros[i].infoLibro() + "\n\n";
        }
        return infoLibros;
    }

    //Eliminar libro
    public boolean eliminarLibro(Libro libro){
        boolean resultado = false;
        if(libro != null){
            int index = -1;
            for(int  i= 0; i < this.nLibrosActuales; i++){
                if(this.libros[i] != null){
                    if(this.libros[i].equals(libro.getIsbn())){
                        index = i;
                        break; // eliminar primera ocurrencia, en este caso el ISBN es unico
                    }
                }
            }

            if(index != -1){
                this.libros[index] = null;
                resultado = true;

                //Recolocar el array
//                for(int i = index; i < this.nLibrosActuales; i++){
//                    this.libros[i] = this.libros[i+1];
//                }
//                this.libros[this.nLibrosActuales-1] = null;
//                this.nLibrosActuales--;

                //Segunda forma
                this.libros[index] = this.libros[this.nLibrosActuales-1];
                this.libros[this.nLibrosActuales-1] = null;
                this.nLibrosActuales--;
            }
        }

        return resultado;
    }


    //Buscar libro por ISBN
    public Libro getLibroByIsbn(String isbn){
        Libro libro = null;
        if(isbn != null && !isbn.isEmpty()){
            for(int i =0; i < this.nLibrosActuales; i++){
                if(this.libros[i].getIsbn().equals(isbn)){
                    libro = this.libros[i];
                    return libro;
                }
            }
        }
        return libro;
    }

    //Buscar libro por titulo (el titulo debe de ser unico)
    public Libro getLibroByTitulo(String titulo){
        Libro libro = null;
        if(titulo != null && !titulo.isEmpty()){
            for(int i =0; i < this.nLibrosActuales; i++){
                if(this.libros[i].getTitulo().equals(titulo)){
                    libro = this.libros[i];
                    return libro;
                }
            }
        }
        return libro;
    }



    //Ampliar dimension del array
    private void ampliarDimensionBiblioteca(){
        Libro [] librosAux = new Libro[this.libros.length + this.dimensionInicial];
        for(int i = 0; i < this.libros.length; i++){
            librosAux[i] = this.libros[i];
        }
        this.libros = librosAux;
    }
}
