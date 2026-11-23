import java.time.LocalDate;

public class Alumno extends Persona{

    private String ciclo;
    private int curso;
    private String [] modulos;

    public Alumno(String nombre, String apellidos, LocalDate fechaNacimiento, String dni,
                  String ciclo, int curso, String [] modulos){
        super(nombre, apellidos, fechaNacimiento, dni);
        this.ciclo = ciclo;
        this.curso = curso;
        this.modulos = modulos;
    }

    public int getCurso() {
        return this.curso;
    }

    public String getCiclo() {
        return this.ciclo;
    }

    public String[] getModulos() {
        return this.modulos;
    }


    //Adios, no es por ti, es por mi, no es el momento, me voy a dedicar a mi mismo.
//    public String infoAlumno(){
//        StringBuilder sb = new StringBuilder();
//        sb.append(super.infoPersona());
//        sb.append("Ciclo: ").append(this.ciclo).append("\n");
//        sb.append("Curso: ").append(this.curso).append("\n");
//        sb.append("Modulos: ").append("\n");
//        for(String modulo : this.modulos){
//            sb.append(modulo).append("\n");
//        }
//        return sb.toString();
//    }

    @Override
    public String toString(){
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString());
        sb.append("Ciclo: ").append(this.ciclo).append("\n");
        sb.append("Curso: ").append(this.curso).append("\n");
        sb.append("Modulos: ").append("\n");
        for(String modulo : this.modulos){
            sb.append(modulo).append("\n");
        }
        return sb.toString();
    }
}
