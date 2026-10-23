public class Persona {

    // Atributos de una clase
    private String nombre;
    private String apellidos;
    private int edad;
    private String dni;
    private String genero;

    //Constructor
    public Persona(String nombre, String apellidos, int edad){
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.edad = edad;
        this.dni = "";
        this.genero = "No especificado";
    }

    // Puedo definir mas de un constructor
    public Persona(String nombre, String apellidos, int edad, String dni){
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.edad = edad;
        this.dni = dni;
        this.genero = "No especificado";
    }

    //Constructor con todos los parametros
    public Persona(String nombre, String apellidos, int edad, String dni, String genero){
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.edad = edad;
        this.dni = dni;
        this.genero = genero;
    }

    //Constructor por defecto
    public Persona(){}

    //Propiedades
    public String getNombre(){
        return this.nombre;
    }

    public String getApellidos() {
        return this.apellidos;
    }

    public int getEdad() {
        return this.edad;
    }

    public String getDni() {
        return this.dni;
    }

    public String getGenero() {
        return this.genero;
    }

    public void setNombre(String nombre){
        if (nombre.length() >= 3){
            this.nombre =  nombre;
        }

    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public void setEdad(int edad){
        this.edad = edad;
    }



    //Metodo para pasar a String mi objeto
    public String personaToString(){
        String texto = "Nombre: " + this.nombre + ", Apellidos: " + this.apellidos + ", Edad: "
                + this.edad + ", DNI: " + this.dni + ", Genero: " + this.genero;

        return texto;
    }

    //Metodo interno para validar DNI
    private boolean isDniOk(String dni){
        return dni.matches("[0-9]{7,8}[a-zA-Z]");
    }
}
