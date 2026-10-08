//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
void main() {

    double a = 7;
    double b = 5;
    IO.println("El valor de a: " + a);
    IO.println("El valor de b: " + b);

    b = a;
    a = 13;
    IO.println("El valor de a: " + a);
    IO.println("El valor de b: " + b);

    String s1 = "Hola";
    String s2 = "mundo";
    IO.println("El valor de s1: " + s1);
    IO.println("El valor de s2: " + s2);

    s2 = s1;
    s1 = "Hello";

    IO.println("El valor de s1: " + s1);
    IO.println("El valor de s2: " + s2);

    int notas [] = {5, 7, 3};
    int notasRe [] = {7,8, 4};

    //notasRe = notas;

    notas [2] = 5;
    notasRe [2] = notas[2];

    for (int i = 0; i < notas.length; i++) {
        IO.println("Nota orginal "+ (i+1) +" :" + notas[i]);
        IO.println("Nota recuperacion "+ (i+1) +" :" + notasRe[i]);
    }
}
