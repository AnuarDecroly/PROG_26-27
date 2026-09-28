import java.util.Scanner;

public class IfElseExamples {
    public static void main(String[] args) {

        int edad;
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduzca su edad: ");
        edad = sc.nextInt();

        if (edad >= 18 && edad <= 120) {
            System.out.println("Puedes pasar");
        }
        else if (edad <18 && edad >= 0) {
            System.out.println("No puedes pasar !!!!");
        }
        else if (edad < 0) {
            System.out.println("Por favor ingrese su edad correctamente, no puede ser negativa");
        }
        else{
            System.out.println("Por favor ingrese su edad en el rango 0 a 120");
        }
    }
}
