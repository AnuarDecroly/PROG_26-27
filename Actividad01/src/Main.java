import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        /*
        Ejercicio 1: Escribe un programa que dé los “buenos días”.
         */
        System.out.println("Soy el ejercicio 1, Buenos dias!!!!!");

        /*
        Ejercicio 2: Escribe un programa que calcule y muestre el área de un cuadrado de lado igual a 5.
         */
        System.out.println("EJERCICIO 2");
        double lado = 7;
        double area = lado * lado;
        System.out.println("El area es: " + area);


        /*
        Ejercicio 3: Escribe un programa que calcule el área de un cuadrado cuyo lado se introduce por teclado.
         */
        System.out.println("EJERCICIO 3");
        Scanner scan = new Scanner(System.in);
        System.out.println("Ingrese el valor de lado");
        double lado2 = scan.nextDouble();
        System.out.println("Ingrese el area del cuadrado es:" + (lado2 * lado2));

        /*
        Ejercicio 4: Escribe un programa que lea dos números, calcule y muestre el valor de sus suma, resta, producto y división.
         */
        System.out.println("EJERCICIO 4");
        scan = new Scanner(System.in);
        System.out.println("Ingrese el valor del primer numero");
        double num1 = scan.nextDouble();
        System.out.println("Ingrese el valor del segundo numero");
        double num2 = scan.nextDouble();

        double suma = num1 + num2;
        double resta = num1 - num2;
        double multiplicacion = num1 * num2;
        double division = num1 / num2;

        System.out.println("El resultado de la suma es: " + suma);
        System.out.println("El resultado de la resta es: " + resta);
        System.out.println("El resultado de la multiplicacion es: " + multiplicacion);
        System.out.println("El resultado de la division es: " + division);

        /*
        Ejercicio 5: Escribe un programa que toma como dato de entrada un número que corresponde a
        la longitud de un radio y nos escribe la longitud de la circunferencia,
        el área del círculo y el volumen de la esfera que corresponden con dicho radio.
         */
        System.out.println("EJERCICIO 5");
        scan = new Scanner(System.in);
        System.out.println("Ingrese el valor del radio");
        double radio = scan.nextDouble();

        System.out.println("La longitud de la circunferencia es: " + (2 * radio * Math.PI));
        System.out.println("El area de la circunferencia es: " + (Math.PI * radio * radio));
        System.out.println("El volumen de la esfera es: " + ((4/3.0)* Math.PI * Math.pow(radio, 3)));

        System.out.println("El radio es mayor que 5" + (radio > 5));
    }
}
