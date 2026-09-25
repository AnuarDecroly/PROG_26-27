//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
/*void main() {
    IO.println("Hola mundo!!!");

}*/

import java.util.Scanner;

public class Main {
    public static double salario = 40000;

    public static void main(String[] args) {
        //Imprimir por pantalla
        System.out.println("Hello World!");
        int edad = 20, edad2, edad3;
        long  edadLong = 123L;

        double precio = 59.99;
        float precioFloat = 59.99f;

        if (edad == edadLong) {
            int edad4 = 13;
            edad4++;  // edad4 = edad4 + 1;
        }

        System.out.println(salario);

        int a = 23;
        double b = 33.5;
        char c = 'a';
        String texto = "Soy un texto";
        boolean estado = false;

        String texto1 = "Soy un texto muy largo y un toston"
                + " ndsdadasddasdasadassdasdassdasdasdassdaddasdasdassdasdd";

        System.out.println("MI SALARIO ES: " + salario);
        System.out.println(texto);

        Scanner scan = new Scanner(System.in);
        System.out.println("Introduzca su edad: ");
        edad = scan.nextInt();

        edad--;

        System.out.println("Su edad es: " + edad);

    }

}
