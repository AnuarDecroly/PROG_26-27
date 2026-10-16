//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
void main() {

    Scanner sc = new Scanner(System.in);
    /*
    Ej 1: Crea un programa que pida diez números reales por teclado,
    los almacene en un array, y luego muestre todos sus valores.
     */
    sc = new Scanner(System.in);
    double numerosE1 [] = new double[10];
    for(int i = 0; i < numerosE1.length; i++){
        IO.println("Introduzca el numero " + (i+1) + ": ");
        numerosE1[i] = sc.nextDouble();
        //Mas efeciente
        //IO.println(numerosE1[i]);
    }

    for(double n : numerosE1){ //For each
        IO.println(n);
    }

    /*
    Ej 2: Crea un programa que pida diez números reales por teclado,
    los almacene en un array, y luego muestre la suma de todos los valores.
     */
    sc = new Scanner(System.in);
    double numerosE2 [] = new double[10];
    double sumaE2 = 0.0;
    for(int i = 0; i < numerosE2.length; i++){
        IO.println("Introduzca el numero " + (i+1) + ": ");
        numerosE2[i] = sc.nextDouble();
        sumaE2 += numerosE2[i]; // sumaE2 = sumaE2 + numerosE2[i];
    }
    IO.println("La suma de todos los valores del array E2: " + sumaE2);

    /*
    Ej 3: Crea un programa que pida diez números reales por teclado,
    los almacene en un array, y luego lo recorra para averiguar
    el máximo y mínimo y mostrarlos por pantalla.
     */
    sc = new Scanner(System.in);
    double numerosE3 [] = new double[10];
    double maxE3 = - Double.MAX_VALUE, minE3 = Double.MAX_VALUE;
    for(int i = 0; i < numerosE3.length; i++){
        sc = new Scanner(System.in);
        IO.println("Introduzca el numero " + (i+1) + ": ");
        numerosE3[i] = sc.nextDouble();
        maxE3 = Math.max(numerosE3[i], maxE3);
        minE3 = Math.min(numerosE3[i], minE3);

    }
    IO.println("El maximo de todos los valores del array E3: " + maxE3);
    IO.println("El minimo de todos los valores del array E3: " + minE3);

    /*
    Ej 4: Crea un programa que pida veinte números enteros por teclado,
    los almacene en un array y luego muestre por separado la suma de todos
    los valores positivos y negativos.
     */
    sc = new Scanner(System.in);
    int numerosE4 [] = new int [20];
    int sumaE4Pos = 0, sumaE4Neg = 0;

    for(int i = 0; i < numerosE4.length; i++){
        IO.println("Introduzca el numero " + (i+1) + ": ");
        numerosE4[i] = sc.nextInt();

        if(numerosE4[i] < 0){
            sumaE4Pos += numerosE4[i];
        }else {
            sumaE4Neg += numerosE4[i];
        }
    }
    IO.println("La suma de todos los valores positivos del array E4: " + sumaE4Pos);
    IO.println("La suma de todos los valores negativos del array E4: " + sumaE4Neg);

    /*
    Ej 5: Crea un programa que pida veinte números reales por teclado, los almacene en un array
    y luego lo recorra para calcular y mostrar la media: (suma de valores) / nº de valores.
     */
    sc = new Scanner(System.in);
    double numerosE5 [] = new double [20];
    double sumaE5 = 0.0, mediaE5 = 0.0;

    for(int i = 0; i < numerosE5.length; i++){
        IO.println("Introduzca el numero " + (i+1) + ": ");
        numerosE5[i] = sc.nextDouble();
        sumaE5 += numerosE5[i];
    }
    mediaE5 = sumaE5 / numerosE5.length;
    IO.println("La suma de todos los valores del array E5: " + sumaE5);
    IO.println("La media de todos los valores del array E5: " + mediaE5);

    /*
    Ej 6: Crea un programa que pida dos valores enteros N y M,
    luego cree un array de tamaño N, escriba M en todas sus posiciones
    y lo muestre por pantalla.
     */
    sc = new Scanner(System.in);
    int N, M;
    IO.println("Introduce el valor de N: ");
    N = sc.nextInt();
    IO.println("Introduce el valor de M: ");
    M = sc.nextInt();

    if(N > 0){
        double numerosE6 [] = new double [N];

        for(int i = 0; i < numerosE6.length; i++){
            numerosE6[i] = M;
            IO.println(numerosE6[i]);
        }

        //Arrays.fill(numerosE6, M);

    }else{
        IO.println("El valor de N no puede ser menor igual que 0");
    }

/*
    Ej 7: Crea un programa que pida dos valores enteros P y Q,
    luego cree un array que contenga todos los valores
    desde P hasta Q, y lo muestre por pantalla.
*/
    sc = new Scanner(System.in);
    int P, Q;
    IO.println("Introduce el valor de P: ");
    P = sc.nextInt();
    IO.println("Introduce el valor de Q: ");
    Q = sc.nextInt();

    // P =5 y Q = 9 --> q-p = 4
    // P = 9 y Q = 5 --> q-p = -4
    int dimension = Math.abs(P - Q) + 1;

    int numerosE7 [] = new int[dimension];
    for(int i = 0; i < numerosE7.length; i++){
        if(Q > P) {
            numerosE7[i] = P + i;
        }
        else{
            numerosE7[i] = Q + i;
        }
        IO.println(numerosE7[i]);
    }

    /*
    Ej 8: Crea un programa que cree un array con 100 números reales aleatorios
    entre 0.0 y 1.0, utilizando Math.random(), y luego le pida al usuario
    un valor real R. Por último, mostrará cuántos valores del array son igual o superiores a R.
     */
    sc = new Scanner(System.in);
    double numerosE8 [] = new double [100];

    for(int i = 0; i < numerosE8.length; i++){
        numerosE8[i] = Math.random();
    }

    sc = new Scanner(System.in);
    IO.println("Introduce el valor del numero R: ");
    double r = sc.nextDouble();
    double contMenores = 0.0, contadorMayores = 0.0;

    if(r >= 0.0 && r <= 1.0){
        for(double n : numerosE8){
            if(r < n){
                contMenores ++;
            }else{
                contadorMayores++;
            }
            IO.println("El numero total de numeros mayores iguales que R es: " + contadorMayores);
            IO.println("El numero total de numeros mayores iguales que R es: " + contMenores);
        }
    }
    else{
        IO.println("Por favor lea el enunciado y deje de ser tan tonto");
    }

    /*
    Ej 9: Crea un programa que cree un array de enteros de tamaño 100
    y lo rellene con valores enteros aleatorios entre 1 y 10 (utiliza 1 + Math.random()*10).
    Luego pedirá un valor N y mostrará en qué posiciones del array aparece N.
     */
    sc = new Scanner(System.in);
    int numerosE9 [] = new int [100];

    for(int i = 0; i < numerosE9.length; i++){
        numerosE8[i] = 1 + (int) (Math.random() * 10);
    }

    sc = new Scanner(System.in);
    IO.println("Introduce el valor del numero N: ");
    int n = sc.nextInt();

    if(n >= 1 && n <= 10){
        for(int i = 0; i < numerosE9.length; i++){
            if(n == numerosE9[i]){
                IO.println("El numero se encuentra en la posicion: "+i);
            }
        }
    }
    else{
        IO.println("Por favor lea el enunciado y deje de ser tan tonto");
    }

    /*
    Ej 10: Crea un programa para realizar cálculos relacionados con la altura (en metros)
     de personas. Pedirá un valor N y luego almacenará en un array N alturas introducidas
     por teclado. Luego mostrará la altura media, máxima y mínima,
     así como cuántas personas miden por encima y por debajo de la media.
     */
    sc = new Scanner(System.in);
    IO.println("Por favor el valor del numero N: ");
    int n10 = sc.nextInt();

    double sumaE10 = 0.0, mediaE10 = 0.0, maxE10 = - Double.MAX_VALUE, minE10 = Double.MAX_VALUE;
    int contadorE10 = 10;

    if(n10 > 0){
        double numerosE10 [] = new double [n10];
        for(int i = 0; i < numerosE10.length; i++){
            IO.println("Introduzca la altura en metros: ");
            numerosE10[i] = Math.abs(sc.nextDouble());

            sumaE10 += numerosE10[i];
            maxE10 = Math.max(numerosE10[i], maxE10);
            minE10 = Math.min(numerosE10[i], minE10);
        }

        mediaE10 = sumaE10 / numerosE10.length;

        IO.println("La suma total es: "+sumaE10);
        IO.println("La media total es: "+mediaE10);
        IO.println("El maxima es: "+maxE10);
        IO.println("El minimo es: "+minE10);

        for(int i = 0; i < numerosE10.length; i++){
            if(numerosE10[i] >= mediaE10){
                contadorE10++;
            }
        }

        IO.println("El numero de personas por encima de la media es: "+contadorE10);
    }
    else{
        IO.println("Por favor lea el enunciado y deje de ser tan tonto");
    }

    /*
    Ej 11: Crea un programa que cree dos arrays de enteros de tamaño 100. Luego introducirá en el
    primer array todos los valores del 1 al 100. Por último, deberá copiar todos los valores del
    primer array al segundo array en orden inverso, y mostrar ambos por pantalla.
    */

    sc = new Scanner(System.in);
    int array1[] = new int[100];
    int array2[] = new int[100];
    for(int i = 0; i < array1.length; i++){
        array1[i] = i+1;
    }

    for(int i = 0; i < array2.length; i++){
        array2[i] = array1[(array1.length - 1) - i];
    }

    // Otra forma, decrementando la i en el array
    for(int i = array2.length - 1; i >= 0; i--){
        array2[array2.length - i] = array1[i];
    }

    for(int i = 0; i < array2.length; i++){
        IO.println("Array1[]: "+array1[i]);
        IO.println("Array2[]: "+array2[i]);
    }
    //IO.println(Arrays.toString(array2));

    /*
        Ej 12: Crea un programa que cree un array de 10 enteros y luego muestre el siguiente menú con
        distintas opciones:
            a. Mostrar valores.
            b. Introducir valor.
            c. Salir.
        La opción ‘a’ mostrará todos los valores por pantalla. La opción ‘b’ pedirá un valor V y una posición P,
        luego escribirá V en la posición P del array. El menú se repetirá indefinidamente hasta que el usuario
        elija la opción ‘c’ que terminará el programa.
    */

    sc = new Scanner(System.in);
    int numerosE12 [] = new int[10];
    String opcion = "c";
    do{
        IO.println("Bienvenido a nuestro programa, escoja una de las opciones propuestas ");
        IO.println("a) Mostrar valores");
        IO.println("b) Introducir valor");
        IO.println("c) Salir");

        opcion = sc.nextLine();

        switch(opcion){
            case "a" ->{
                IO.println(Arrays.toString(numerosE12));
            }

            case "b" ->{
                sc.nextLine();
                IO.println("Por favor, introduzca el valor del numero entero que quiere insertar");
                int v = sc.nextInt();
                IO.println("Por favor, introduzca la posicion del array donde quiere insertar el valor");
                int p = sc.nextInt();
                if(p >= 0 && p < numerosE12.length){
                    numerosE12[p] = v;
                }
                else{
                    IO.println("El valor de la posicion no es correcto");
                }

            }

            case "c" ->{
                IO.println("Gracias por utiliar nuestra APP, el programa se cerrara a continuación");
            }

            default ->{
                IO.println("Opcion invalida, escoja otra opcion");
            }
        }

    }while(!opcion.equals("c"));


    /*
        Ej 13: Crea un programa que permita al usuario almacenar una secuencia aritmética en un array y
        luego mostrarla. Una secuencia aritmética es una serie de números que comienza por un valor inicial V,
        y continúa con incrementos de I. Por ejemplo, con V=1 e I=2, la secuencia sería 1, 3, 5, 7, 9…
        Con V=7 e I=10, la secuencia sería 7, 17, 27, 37… El programa solicitará al usuario V, I además de
        N (nº de valores a crear).
        */
    sc = new Scanner(System.in);
    IO.println("Introduce el valor inicial v: ");
    int v = sc.nextInt();
    IO.println("Introduce el incremento de la serie: ");
    int incremento = sc.nextInt();
    IO.println("Introduce el numero de elementos a crear: ");
    int nE13 = sc.nextInt();

    int numerosE13 [] = new int[nE13];

    numerosE13[0] = v; // 7, 10, 13, 16, 19 ...... v = 7 incremnto = 3
    IO.println(numerosE13[0]);
    for(int i = 1; i < numerosE13.length; i++){
        numerosE13[i] = numerosE13[i-1] + incremento;
        IO.println(numerosE13[i]);
    }

    /*
        Ej 14: Crea un programa que cree un array de enteros e introduzca la siguiente secuencia de valores:
        1, 2, 2, 3, 3, 3, 4, 4, 4, 4, 5, 5, 5, 5, etc. hasta introducir 10 diez veces,
        y luego la muestre por pantalla.

    */
    int numE14 = 10;
    int tamanoArray = numE14 * (numE14 + 1) / 2; //Suma de la serie aritmetica
    int numerosE14 [] = new int[tamanoArray];

    int indiceActual = 0;
    for(int numero = 1; numero <= numE14; numero++){

        for(int i = 0; i < numero; i++){
            numerosE14[indiceActual] = numero;
            indiceActual++;
        }
    }





}
