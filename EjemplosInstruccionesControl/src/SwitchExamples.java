import java.util.Scanner;

public class SwitchExamples {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Introduzca el numero del mes: ");
        int mes = sc.nextInt();

        switch (mes) {
            case 1:
                System.out.println("Enero");
                break;
            case 2:
                System.out.println("Febrero");
                break;
            case 3:
                System.out.println("Marzo");
                break;
            case 4:
                System.out.println("Abril");
                break;
            case 5:
                System.out.println("Mayo");
                break;
            case 6:
                System.out.println("Junio");
                break;
            case 7:
                System.out.println("Julio");
                break;
            case 8:
                System.out.println("Agosto");
                break;
            case 9:
                System.out.println("Septiembre");
                break;
            case 10:
                System.out.println("Octubre");
                break;
            case 11:
                System.out.println("Noviembre");
                break;
            case 12:
                System.out.println("Diciembre");
                break;
            default:
                System.out.println("Error: Los meses van entre el valor 1 y 12");
        }

        System.out.println("Inserte la opcion deseada (A-E)");
        String opcion = sc.next();
        switch (opcion) {
            case "A":
                System.out.println("Lunes");
                break;

            case "B":
                System.out.println("Martes");
                break;

            case "C":
                System.out.println("Miercoles");
                break;
            case "D":
                System.out.println("Jueves");
                break;
            case "E":
                System.out.println("Viernes");
                break;
            default:
                System.out.println("POR FAVOR ESCOJA UNA OPCION ADECUADA");
        }

        //Sintaxis moderna
        switch(opcion) {
            case "A" -> {
                System.out.println("Lunes");
            }
            case "B" -> System.out.println("Martes");
            case "C" -> System.out.println("Miercoles");
            case "D" -> System.out.println("Jueves");
            case "E" -> System.out.println("Viernes");
            default -> System.out.println("Error: El opcion no existe");
        }
    }
}
