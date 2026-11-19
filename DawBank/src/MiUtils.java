import model.Movimiento;

import java.util.Scanner;

public class MiUtils {

    public static double leerDoublePantalla(String mensaje){
        Scanner sc = new Scanner(System.in);
        IO.println(mensaje);
        return sc.nextDouble();
    }

    public static String leerTextoPantalla(String mensaje){
        Scanner sc = new Scanner(System.in);
        IO.println(mensaje);
        return sc.nextLine();
    }

    public static boolean comprobarPatron(String patron, String texto){
        boolean isOk = false;
        isOk = texto.matches(patron);
        return isOk;
    }

    public static String comprobarPatronRepetidamente(String patron, String mensaje){
        boolean isOk = false;
        String texto = "";

        do{
            texto = MiUtils.leerTextoPantalla(mensaje);
            isOk = MiUtils.comprobarPatron(patron, texto);
            if(!isOk){
                IO.println("El formato es incorrecto, vuelva a intentarlo");
            }
        }while(!isOk);

        return texto;
    }

    public static String generarMenuOpciones(String[] opciones){
        IO.println("Por favor escoja la opción deseada");
        if(opciones.length > 0){
            for(String opcion : opciones){
                IO.println(opcion);
            }
            Scanner sc = new Scanner(System.in);
         return sc.nextLine();
        }
        return "";
    }
}
