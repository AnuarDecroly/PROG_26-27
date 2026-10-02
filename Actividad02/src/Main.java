//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
void main() {
/* Ejercicio 1: Escribe un programa que pide la edad por teclado
y nos muestra el mensaje de “Eres mayor de edad” solo si lo somos.
 */
    IO.println("EJERCICIO 1");
    Scanner sc = new Scanner(System.in);
    IO.println("Introduzca la edad de la persona: ");
    int edad = sc.nextInt();

    if(edad >= 18) {
        IO.println("Eres mayor de edad");
    }

    /* Ejercicio 2:Escribe un programa que pide la edad por teclado
    y nos muestra el mensaje de “eres mayor de edad” o el mensaje de “eres menor de edad”..
    */
    IO.println("EJERCICIO 2");
    sc = new Scanner(System.in);
    IO.println("Introduzca la edad de la persona: ");
    int edad2 = sc.nextInt();

    if(edad2 >= 18) {
        IO.println("Eres mayor de edad");
    }else if(edad2 < 18 && edad2 >= 0) {
        IO.println("Eres menor de edad (NO PUEDES PASAR!!!!)");
    }
    else{
        IO.println("La edad de una persona no puede ser un numero negativo");
    }

    /* Ejercicio 3: Realiza un programa que muestre por pantalla los 20 primeros
    números naturales (1, 2, 3... 20).
     */
    IO.println("EJERCICIO 3");
    sc = new Scanner(System.in);
    for(int i = 1; i <= 20; i++) {
        IO.println("Numero natural: "+i);
    }

    /* Ejercicio 4: Realiza un programa que muestre los números pares comprendidos
    entre el 1 y el 200. Para ello utiliza un contador y suma de 2 en 2.
     */
    IO.println("EJERCICIO 4");
    sc = new Scanner(System.in);
    for(int i = 0; i <= 200; i = i + 2) {
        if(i != 0){
            IO.println("El numero par es: "+i);
        }
    }

    /* Ejercicio 5: Realiza un programa que muestre los números pares comprendidos
    entre el 1 y el 200. Para ello utiliza un contador de 1 en 1.
     */
    IO.println("EJERCICIO 5");
    sc = new Scanner(System.in);
    for(int i = 1; i <= 200; i++) {
        if(i % 2 == 0){
            IO.println("El numero par es: "+i);
        }
    }

    /* Ejercicio 6: Realiza un programa que muestre los
        números desde el 1 hasta un número N que se introducirá por teclado.
    */
    IO.println("EJERCICIO 6");
    sc = new Scanner(System.in);
    IO.println("Introduzca el valor del numero final: ");
    int valor = sc.nextInt();

    for(int i = 1; i <= valor; i++) {
        IO.println("El valor es: "+i);
    }

    /* Ejercicio 7: Escribe un programa que lea una calificación numérica entre 0 y 10
    y la transforma en calificación alfabética, escribiendo el resultado.
    • de 0 a < 3 Muy Deficiente.
    • de 3 a < 5 Insuficiente.
    • de 5 a < 6 Suficiente.
    • de 6 a < 7 Bien.
    • de 7 a < 9 Notable
    • de 9 a 10 Sobresaliente
    */
    IO.println("EJERCICIO 7");
    sc = new Scanner(System.in);
    IO.println("Por favor, introduzca el valor de su nota");
    double nota = sc.nextDouble();

    if(nota >= 0 && nota < 3) {
        IO.println("MUY DEFICIENTE");
    }else if(nota >= 3 && nota < 5) {
        IO.println("INSUFICIENTE");
    }else if(nota >= 5 && nota < 6) {
        IO.println("SUFICIENTE");
    }else if(nota >= 6 && nota < 7) {
        IO.println("BIEN");
    }else if(nota >= 7 && nota < 9) {
        IO.println("NOTABLE");
    }else if(nota >= 9 && nota <= 10) {
        IO.println("SOBRESALIENTE");
    }else{
        IO.println("El valor de la nota tiene que estar entre 0 y 10");
    }

    /* Ejercicio 8: Realiza un programa que lea un número positivo N
    y calcule y visualice su factorial N!
     */
    IO.println("EJERCICIO 8");
    sc = new Scanner(System.in);
    IO.println("Introduzca el valor del numero para calcular el factorial: ");
    int num = sc.nextInt();

    double factorial = 1;
    for(int i = 1; i <= num; i++) {
        factorial = factorial * i;
    }
    IO.println("El factorial de " + num + "es :" + Math.abs(factorial));

    /*EJERCICIO 9: Escribe un programa que recibe como datos de entrada
    una hora expresada en horas, minutos y segundos que nos calcula y
    escribe la hora, minutos y segundos que serán, transcurrido un segundo.
    */
    IO.println("EJERCICIO 9");
    sc = new Scanner(System.in);
    IO.println("Introduzca el valor de la hora: ");
    int hora = sc.nextInt();
    IO.println("Introduzca el valor de los minutos: ");
    int minutos = sc.nextInt();
    IO.println("Introduzca el valor de los segundos: ");
    int segundos = sc.nextInt();

    //Pasa un segundo
    segundos ++;
    if(segundos >= 60) {
        segundos = 0;
        minutos ++;
        if(minutos >= 60) {
            minutos = 0;
            hora++;
            if(hora >= 24){
                hora = 0;
            }
        }
    }
    IO.println(hora + ":" + minutos + ":" + segundos);


}
