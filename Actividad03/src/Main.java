//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
void main() {
    /*
     * Realiza un programa que dada una cantidad de euros que el
     * usuario introduce por teclado (múltiplo de 5 €) mostrará
     * los billetes de cada tipo que serán necesarios para alcanzar
     * dicha cantidad (utilizando billetes de 500, 200, 100, 50, 20, 10 y 5).
     * Hay que indicar el mínimo de billetes posible. Por ejemplo, si el
     * usuario introduce 145 el programa indicará que será necesario
     * 1 billete de 100 €, 2 billetes de 20 € y 1 billete de 5 €
     * (no será válido por ejemplo 29 billetes de 5, que aunque sume 145 €
     * no es el mínimo número de billetes posible).
     */

    Scanner sc = new Scanner(System.in);
    int dinero = 0;
    int dineroRestante = 0;

    //Pido la cantidad de dinero comprobando que es multiplo de 5 y tomando el valor absoluto
    do {
        IO.println("Introduzca la cantidad (debe ser multiplo de de 5");
        dinero = Math.abs(sc.nextInt());
    }while(dinero % 5 != 0);

    int n500 = 0, n200 = 0, n100 = 0, n50 = 0, n20 = 0, n10 = 0, n5 = 0;

    dineroRestante = dinero;
    String textoDinero = "Se necesitan los siguientes billetes:";

    if (dineroRestante >= 500) {
        n500 = dineroRestante / 500;
        dineroRestante =  dineroRestante - (n500 * 500);
        textoDinero = textoDinero + "\n" + n500 + " billetes de 500€";
    }

    if (dineroRestante >= 200) {
        n200 = dineroRestante / 200;
        dineroRestante =  dineroRestante - (n200 * 200);
        textoDinero = textoDinero + "\n" + n200 + " billetes de 200€";
    }
    if (dineroRestante >= 100) {
        n100 = dineroRestante / 100;
        dineroRestante =  dineroRestante - (n100 * 100);
        textoDinero = textoDinero + "\n" + n100 + " billetes de 100€";
    }
    if (dineroRestante >= 50) {
        n50 = dineroRestante / 50;
        dineroRestante =  dineroRestante - (n50 * 50);
        textoDinero = textoDinero + "\n" + n50 + " billetes de 50€";

    }
    if (dineroRestante >= 20) {
        n10 = dineroRestante / 20;
        dineroRestante =  dineroRestante - (n20 * 20);
        textoDinero = textoDinero + "\n" + n20 + " billetes de 20€";
    }
    if (dineroRestante >= 10) {
        n10 = dineroRestante / 10;
        dineroRestante =  dineroRestante - (n10 * 10);
        textoDinero = textoDinero + "\n" + n10 + " billetes de 10€";
    }
    if (dineroRestante >= 5) {
        n5 = dineroRestante / 5;
        dineroRestante =  dineroRestante - (n5 * 5);
        textoDinero = textoDinero + "\n" + n5 + " billetes de 5€";
    }

    IO.println("Se necesitan \n" + n500 + " billetes de 500"
            + "\n" + n200 + " billetes de 200"
            + "\n" + n100 + " billetes de 100"
            + "\n" + n50 + " billetes de 50"
            + "\n" + n20 + " billetes de 20"
            + "\n" + n10 + " billetes de 10"
            + "\n" + n5 + " billetes de 5");

    IO.println("LA OTRA FORMA MAS COOL");
    IO.println(textoDinero);

}
