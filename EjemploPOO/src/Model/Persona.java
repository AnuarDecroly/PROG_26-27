package Model;

public class Persona {

    private static int contadorPoblacionMundial = 0;

    // Atributos de una clase
    protected int id;
    protected String nombre;
    protected String apellidos;
    private int edad;
    private String dni;
    String genero;

    //Constructor
    public Persona(String nombre, String apellidos, int edad){
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.edad = edad;
        this.dni = "";
        this.genero = "No especificado";
        this.id = contadorPoblacionMundial;
        contadorPoblacionMundial ++;
    }

    // Puedo definir mas de un constructor
    public Persona(String nombre, String apellidos, int edad, String dni){
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.edad = edad;
        this.dni = dni;
        this.genero = "No especificado";
        contadorPoblacionMundial ++;
    }

    //Constructor con todos los parametros
    public Persona(String nombre, String apellidos, int edad, String dni, String genero){
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.edad = edad;
        this.dni = dni;
        this.genero = genero;
        contadorPoblacionMundial ++;
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

    private String letraDni(int dni){
        int resto = dni % 23;

        String [] letras = {"T", "R", "W","A","G","M","Y", "F", "P", "D","X", "B"};

        return letras[resto];
    }

    public static int PoblacionMundial(){
        return contadorPoblacionMundial;
    }
}
