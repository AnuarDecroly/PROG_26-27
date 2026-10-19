//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
void main() {
    //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
    // to see how IntelliJ IDEA suggests fixing it.
/*
    Ejercicio 1: Crea un programa que pida una cadena de texto por teclado y luego muestre cada
    palabra de la cadena en una línea distinta
 */
    Scanner sc = new Scanner(System.in);
    IO.println("Introduzca la frase que desee:");
    String frase = sc.nextLine();

    for(String s : frase.split(" ")){
        IO.println(s);
    }

  /*
    Ejercicio 2: Crea un programa que pida dos cadenas de texto por teclado y luego indique si son
    iguales, además de si son iguales sin diferenciar entre mayúsculas y minúsculas
   */
    sc = new Scanner(System.in);
    IO.println("Introduca la primera frase: ");
    String s1 = sc.nextLine();
    IO.println("Introduzca la segunda frase: ");
    String s2 = sc.nextLine();
    if(s1.equals(s2)){
        IO.println("Las frases son iguales");
    }
    else if (s1.equalsIgnoreCase(s2)){
        IO.println("Las frases son iguales ignorando mayusculas y minusculas");
    }
    else  {
        IO.println("Las frases son distintas");
    }

    /*
    Ejercicio 3: Crea un programa que pida por teclado tres cadenas de texto:
    nombre y dos apellidos. Luego mostrará un código de usuario (en mayúsculas)
     formado por la concatenación de las tres primeras letras de cada uno de ellos.
     Por ejemplo, si se introduce “Lionel”,“Tarazón” y “Alcocer” mostrará “LIOTARALC”
     */
    sc = new Scanner(System.in);
    IO.println("Introduca el nombre: ");
    String nombre = sc.nextLine();
    IO.println("Introduzca el primer apellido: ");
    String apellido1 = sc.nextLine();
    IO.println("Introduzca el segundo apellido: ");
    String apellido2 = sc.nextLine();

    String codigo = (nombre.substring(0,3) + apellido1.substring(0,3)
            + apellido2.substring(0,3)).toUpperCase();

    /*
    Ejercico 4: Crea un programa que muestre por pantalla cuantas vocales de cada tipo hay (cuantas
    ‘a’, cuantas ‘e’, etc.) en una frase introducida por teclado. No se debe diferenciar entre
    mayúsculas y minúsculas. Por ejemplo, dada la frase “Mi mama me mima” dirá que hay:
    Nº de A's: 3
    Nº de E's: 1
    Nº de I's: 2
    Nº de O's: 0
    Nº de U's: 0
    */

    sc = new Scanner(System.in);
    IO.println("Introduzca la frase que desee: ");
    String fraseEj4 = sc.nextLine();

    int aes = 0, ees = 0, ies = 0, oes = 0, ues = 0;

    for(char c : fraseEj4.toLowerCase().toCharArray()){
        switch (c){
            case 'a' -> aes++; // aes = aes + 1
            case 'e' -> ees++;
            case 'i' -> ies++;
            case 'o' -> oes++;
            case 'u' -> ues++;
        }
    }

    IO.println("Numero de aes: "+aes);
    IO.println("Numero de ees: "+ees);
    IO.println("Numero de ies: "+ies);
    IO.println("Numero de 0es: "+oes);
    IO.println("Numero de ues: "+ues);

    /*
    Ejercicio 5: Realiza un programa que lea una frase por teclado e indique si la frase
    es un palíndromo o no (ignorando espacios y sin diferenciar entre mayúsculas y minúsculas).
    Supondremos que el usuario solo introducirá letras y espacios (ni comas, ni puntos, ni
    acentos, etc.). Un palíndromo es un texto que se lee igual de izquierda a derecha que de
    derecha a izquierda.
    */
    sc = new Scanner(System.in);
    IO.println("Introduzca la frase que desee: ");
    String fraseEj5 = sc.nextLine();

    IO.println("La frase es un palindromo: "+isPalindromo(fraseEj5));

    sc = new Scanner(System.in);
    IO.println("Introduzca la frase que desee: ");
    String fraseEj5b = sc.nextLine();

    IO.println("La frase es un palindromo: "+isPalindromo(fraseEj5b));


}

public static boolean isPalindromo(String textoOriginal){
    String texto = textoOriginal.replace(" ","").toLowerCase();
    boolean isPalindromo = true;
    int izquerda = 0;
    int derecha = texto.length() - 1;

    while(izquerda < derecha){
        if(texto.charAt(izquerda) != texto.charAt(derecha)){
            isPalindromo = false;
            return isPalindromo;
        }
        izquerda++;
        derecha --;
    }

    return isPalindromo;
}


