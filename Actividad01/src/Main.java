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


        /*
        Ejercicio 6: Escribe un programa que dado el precio de un artículo
        y el precio de venta real nos muestre el porcentaje de descuento realizado.
         */
        System.out.println("EJERCICIO 6");
        scan = new Scanner(System.in);
        System.out.println("Ingrese el precio de venta real");
        double precioReal = scan.nextDouble();
        System.out.println("Ingrese el precio de venta del articulo");
        double precioVenta = scan.nextDouble();

        double descuento = ((precioReal - precioVenta) / precioReal) * 100.0;
        System.out.println("El descuento aplicado es: " + descuento + "%.");

        /*
        Ejercicio 7: Escribe un programa que lea un valor correspondiente a una distancia en millas marinas
        y escriba la distancia en metros. Sabiendo que una milla marina equivale a 1.852 metros.
        */
        System.out.println("EJERCICIO 7");
        scan = new Scanner(System.in);
        System.out.println("Ingrese la distancia en millas marinas");
        double distanciaMillas = scan.nextDouble();
        double distanciaMetros = distanciaMillas * 1.852;
        System.out.println("La distancia en metros es: " + distanciaMetros + "m.");

        /*
        Ejercicio 8: Escribe un programa que lee dos números y los visualiza en orden ascendente.
        */
        System.out.println("EJERCICIO 8");
        scan = new Scanner(System.in);
        System.out.println("Introduce el primer numero");
        double num3 = scan.nextDouble();
        System.out.println("Introduce el segundo numero");
        double num4 = scan.nextDouble();

        System.out.println("Los numeros en orden ascendente son: " + Math.min(num3, num4) + ", "
        + Math.max(num3, num4));

        /*
        Ejercicio 9: Escribe un programa que lee dos números
        y nos dice cuál es el mayor o si son iguales.
        */
        System.out.println("EJERCICIO 9");
        scan = new Scanner(System.in);
        System.out.println("Introduce el primer numero");
        double num5 = scan.nextDouble();
        System.out.println("Introduce el segundo numero");
        double num6 = scan.nextDouble();

        System.out.println("Los numeros son iguales: " + (num5 == num6));
        System.out.println("El primer numero es mayor que el segundo: " + (num5 > num6));

        /*
        Ejercicio 10: Escribe un programa que lea tres números distintos y nos diga cuál es el mayor
        */
        System.out.println("EJERCICIO 10");
        scan = new Scanner(System.in);
        System.out.println("Introduce el primer numero");
        double num7 = scan.nextDouble();
        System.out.println("Introduce el segundo numero");
        double num8 = scan.nextDouble();
        System.out.println("Introduce el tercer numero");
        double num9 = scan.nextDouble();

        System.out.println("El numero mayor es: " + Math.max(num9, Math.max(num7, num8)));

        /*
        Ejercicio 13: Escribe un programa que lee un número y me dice si es positivo
         o negativo consideraremos el cero como positivo.
        */
        System.out.println("EJERCICIO 10");
        scan = new Scanner(System.in);
        System.out.println("Introduce el primer numero");
        double numero = scan.nextDouble();
        System.out.println("El numero es positivo :" +(numero >= 0));
        System.out.println("El numero es negativo :" +(numero < 0));
        


    }
}
