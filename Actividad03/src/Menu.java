import java.util.Scanner;

public class Menu {
    public static void main(String args[]) {
        /*
        Realiza un programa que muestre un menú de opciones como el siguiente:
         1.Sumar
         2.Restar
         3.Multiplicar
         4.Dividir (incluir manejo de división por 0)
         5.Salir
         El menú debe de repetirse hasta que se escoja la opción 5 (Salir).
         */

        Scanner sc = new Scanner(System.in);
        double num1 = 0.0, num2 = 0.0;
        String opcion = "5";

        IO.println("Intruduzca el primer numero:");
        num1 = sc.nextDouble();
        IO.println("Intruduzca el segundo numero:");
        num2 = sc.nextDouble();

        do{
            sc =  new Scanner(System.in);
            IO.println("Ingrese la opcion del menu que desea realizar: ");
            IO.println("1. Sumar");
            IO.println("2. Restar");
            IO.println("3. Multiplicar");
            IO.println("4. Dividir");
            IO.println("5. Salir");

            opcion = sc.nextLine();

            switch (opcion) {
                case "1" ->{
                    sc = new Scanner(System.in);
                    IO.println("La suma es: "+ (num1 + num2));
                }
                case "2" ->{
                    IO.println("La suma es: "+ (num1 - num2));
                }
                case "3" ->{
                    IO.println("La multiplicacion es: "+ (num1 * num2));
                }
                case "4" ->{
                    if(num2 !=0){
                        IO.println("La division es: "+ (num1 / num2));
                    }else{
                        IO.println("El segundo numero es cero y es una indeterminacion");
                    }

                }
                case "5" ->{
                    IO.println("El programa se cerrara");
                }

                default -> IO.println("Opcion no permitida, introduzca una opcion entre 1 y 5");
            }

        }while(!opcion.equals("5"));


    }
}
