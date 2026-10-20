//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
void main() {
    //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
    // to see how IntelliJ IDEA suggests fixing it.
    /*
    Ej 1: Crea un programa que cree una matriz de tamaño 5x5 que almacene
    los números del 1 al 25 y luego muestre la matriz por pantalla.
     */
    Scanner sc = new Scanner(System.in);
    int [] [] matrizEj1 = new int[5][5];

    int numEj1 = 1;

    for(int i = 0; i < matrizEj1.length; i++){
        IO.print("|");
        for(int j = 0; j < matrizEj1[i].length; j++){
            matrizEj1[i][j] = numEj1;
            numEj1++;
            IO.print(matrizEj1[i][j] + " ");
        }
        IO.println("|");
    }
    IO.println();


    /*
    Ej 2: Crea un programa que cree una matriz de 10x10 e introduzca los valores de las tablas de
    multiplicar del 1 al 10 (cada tabla en una fila). Luego mostrará la matriz por pantalla.
     */
    sc = new Scanner(System.in);
    int [] [] matrizEj2 = new int[10][10];

    for(int i = 0; i < matrizEj2.length; i++){
        IO.println("Tabla de multiplicar de: " + (i+1));
        for(int j = 0; j < matrizEj2[i].length; j++){
            matrizEj2[i][j] = (i +1) * (j + 1);
            IO.println((i +1) + " x " + (j + 1) + " = " + matrizEj2[i][j]);
        }
        IO.println();
    }

    /*
    Ej 3: Crea un programa que cree una matriz de tamaño NxM (tamaño introducido por teclado) e
    introduzca en ella NxM valores (también introducidos por teclado). Luego deberá recorrer la
    matriz y al final mostrar por pantalla cuántos valores son mayores que cero, cuántos son
    menores que cero y cuántos son igual a cero.
     */
    sc = new Scanner(System.in);
    IO.println("Introduzca el valor de N: ");
    int n = sc.nextInt();
    IO.println("Introduzca el valor de M: ");
    int m = sc.nextInt();

    if(n > 0 && m > 0){
        double matrizEj3 [][] = new double[n][m];
        int nPositivos = 0, nNegativos = 0, nNulos = 0;

        for(int i = 0; i < matrizEj3.length; i++){
            for(int j = 0; j < matrizEj3[i].length; j++){
                sc = new Scanner(System.in);
                IO.println("Introduzca el valor de i = "+i + " j = "+j);
                matrizEj3[i][j] = sc.nextDouble();

                if(matrizEj3[i][j] == 0){
                    nNulos++;
                }
                else if(matrizEj3[i][j] > 0){
                    nPositivos++;
                }
                else{
                    nNegativos++;
                }
            }
        }

//        for(int i = 0; i < matrizEj3.length; i++){
//            IO.print("|");
//            for(int j = 0; j < matrizEj3[i].length; j++){
//                IO.print(matrizEj3[i][j] + " ");
//            }
//            IO.println("|");
//        }
//        IO.println();

        pintarMatriz(matrizEj3);

        IO.println("Hay "+nPositivos + " valores positivos en la matriz");
        IO.println("Hay "+nNegativos + " valores negativos en la matriz");
        IO.println("Hay "+nNulos + " valores nulos en la matriz");

    }else{
        IO.println("Los valores de N y M deben de ser enteros positivos");
    }


    /*
    Ej 4: Necesitamos crear un programa para almacenar las notas de 4 alumnos (llamados “Alumno
    1”, “Alumno 2”, etc.) y 5 asignaturas. El usuario introducirá las notas por teclado y luego el
    programa mostrará la nota mínima, máxima y media de cada alumno.
     */
    sc = new Scanner(System.in);
    int alumnos = 4, asignaturas = 5;

    double[][] matrizEj4 = new double[alumnos][asignaturas];
    double [][] estadisticas = new double [alumnos][3]; // minima, maxima, media

    for(int i = 0; i < matrizEj4.length; i++){
        for(int j = 0; j < matrizEj4[i].length; j++){
            sc = new Scanner(System.in);
            IO.println("Ingrese el valor de la nota de la asignatura "+ (j+1)+":  ");
            matrizEj4[i][j] = sc.nextDouble();
        }
    }

    for(int i = 0; i < matrizEj4.length; i++){
        estadisticas[i][0] = Double.MAX_VALUE;
        estadisticas[i][1] = - Double.MAX_VALUE;
        estadisticas[i][2] = 0.0;
        for(int j = 0; j < matrizEj4[i].length; j++){
            estadisticas[i][0] = Math.min(estadisticas[i][0], matrizEj4[i][j]);
            estadisticas[i][1] = Math.max(estadisticas[i][1], matrizEj4[i][j]);
            estadisticas[i][2] = estadisticas[i][2] + matrizEj4[i][j];
        }
        estadisticas[i][2] = estadisticas[i][2] / matrizEj4[i].length;
    }

    pintarMatriz(estadisticas);


    /*
    Ej 5: Necesitamos crear un programa para registrar sueldos de hombres y mujeres de una empresa
    y detectar si existe brecha salarial entre ambos. El programa pedirá por teclado la información
    de N personas distintas (valor también introducido por teclado). Para cada persona, pedirá su
    género (0 para varón y 1 para mujer) y su sueldo. Esta información debe guardarse en una única
    matriz. Luego se mostrará por pantalla el sueldo medio de cada género.
     */
    sc = new Scanner(System.in);
    IO.println("Introduzca el numero de personas");
    int nPersonas = sc.nextInt();

    int [][] matrizEj5 = new int[nPersonas][2];
    double mediaH = 0.0, mediaM = 0.0;
    int contadorH = 0, contadorM = 0;

    for(int i = 0; i < matrizEj5.length; i++){

            sc = new Scanner(System.in);
            IO.println("Ingrese el genero de la persona (0 varon, 1 mujer");
            matrizEj4[i][0] = sc.nextInt();
            IO.println("Ingrese el valor del salario");
            matrizEj4[i][1] = sc.nextInt();

        if(matrizEj5[i][0] == 0.0){
            mediaH += matrizEj5[i][1];
            contadorH++;
        }else{
            mediaM += matrizEj5[i][1];
            contadorM++;
        }
    }
    mediaH = mediaH / contadorH;
    mediaM = mediaM /contadorM;

    IO.println("El salario medio de los hombres es: "+mediaH);
    IO.println("El salario medio de lass mujeres es: "+mediaM);

}

/*
Definicion de metodos (funciones) para pintar una matriz,
con sobrecarga de paramentros para que admita diferentes tipos de matrices
 */
public static void pintarMatriz(double[][] matriz){
    for(int i = 0; i < matriz.length; i++){
        IO.print("|");
        for(int j = 0; j < matriz[i].length; j++){
            IO.print(matriz[i][j] + " ");
        }
        IO.println("|");
    }
    IO.println();
}

public static void pintarMatriz(int[][] matriz){
    for(int i = 0; i < matriz.length; i++){
        IO.print("|");
        for(int j = 0; j < matriz[i].length; j++){
            IO.print(matriz[i][j] + " ");
        }
        IO.println("|");
    }
    IO.println();
}

public static void pintarMatriz(String[][] matriz){
    for(int i = 0; i < matriz.length; i++){
        IO.print("|");
        for(int j = 0; j < matriz[i].length; j++){
            IO.print(matriz[i][j] + " ");
        }
        IO.println("|");
    }
    IO.println();
}

public static void pintarMatriz(boolean[][] matriz){
    for(int i = 0; i < matriz.length; i++){
        IO.print("|");
        for(int j = 0; j < matriz[i].length; j++){
            IO.print(matriz[i][j] + " ");
        }
        IO.println("|");
    }
    IO.println();
}
