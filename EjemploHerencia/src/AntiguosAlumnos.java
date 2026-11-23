import java.time.LocalDate;

public class AntiguosAlumnos extends Alumno{

    private LocalDate fechaGraduacion;
    private boolean isWorking;

    public AntiguosAlumnos(String nombre, String apellidos, LocalDate fechaNacimiento, String dni,
                           String ciclo, int curso, String[] modulos,
                           LocalDate fechaGraduacion, boolean isWorking) {
        super(nombre, apellidos, fechaNacimiento, dni, ciclo, curso, modulos);
        this.fechaGraduacion = fechaGraduacion;
        this.isWorking = isWorking;
    }

    public LocalDate getFechaGraduacion() {
        return this.fechaGraduacion;
    }

    public boolean isWorking() {
        return this.isWorking;
    }

    @Override
    public String toString(){
        StringBuilder sb =  new StringBuilder();
        sb.append(super.toString());
        sb.append("Fecha graduacion: ").append(this.fechaGraduacion).append("\n");
        sb.append("Esta trabajando: ").append(this.isWorking).append("\n");

        return sb.toString();
    }
}
