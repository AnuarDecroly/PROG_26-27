import java.time.LocalDate;

public class Persona {
    private String nombre;
    private String apellidos;
    private LocalDate fechaNacimiento;
    private String dni;

    public Persona(String nombre, String apellidos, LocalDate fechaNacimiento, String dni){
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.fechaNacimiento = fechaNacimiento;
        this.dni = dni;
    }



    public String getNombre() {
        return this.nombre;
    }

    public String getApellidos() {
        return this.apellidos;
    }

    public LocalDate getFechaNacimiento() {
        return this.fechaNacimiento;
    }

    public String getDni() {
        return this.dni;
    }

    //Ya no te necesito, adios, ha sido un placer, no es por es por mi
//    public String infoPersona(){
//        StringBuilder sb = new StringBuilder();
//        sb.append("Nombre: ").append(this.nombre).append("\n");
//        sb.append("Apellidos: ").append(this.apellidos).append("\n");
//        sb.append("Fecha nacimiento: ").append(this.fechaNacimiento).append("\n");
//        sb.append("Dni: ").append(this.dni).append("\n");
//        return sb.toString();
//    }

    @Override
    public String toString(){
        StringBuilder sb = new StringBuilder();
        sb.append("Nombre: ").append(this.nombre).append("\n");
        sb.append("Apellidos: ").append(this.apellidos).append("\n");
        sb.append("Fecha nacimiento: ").append(this.fechaNacimiento).append("\n");
        sb.append("Dni: ").append(this.dni).append("\n");
        return sb.toString();
    }


}
