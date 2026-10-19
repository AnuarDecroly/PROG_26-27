import java.util.Scanner;

public class Main2 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        IO.println("Introduzca la fecha");
        String fecha = sc.next();

        //Constante con el patron del formato de DNI
        final String patterDNI = "[0-9]{7,8}[A-Za-z]";

        final String patterFecha = "[0-3]{1}[0-9]{1}-[0-1]{1}[0-2]{1}-[0-9]{4}";
        //Constante con el patron del formato de fecha
        boolean isFechaOk = cumplePatron(fecha, patterFecha);

        IO.println("Introduzca su dni");
        String dni = sc.next();

        boolean isdniOK = cumplePatron(dni, patterDNI);
    }

    public static double suma(double n1, double n2){
        return n1 + n2;
    }

    public static double potenciaN (double n, double exp){
        return Math.pow(n, exp);
    }

    public static boolean cumplePatron(String texto, String patron){
        return texto.matches(patron);
    }

    public static double[] darVueltaDoubleArray (double miArray[]){
        double array [] = new double [miArray.length];
        for(int i = 0; i < miArray.length; i++){
            array[i] = miArray[miArray.length -1 - i];
        }
        return array;
    }
}
