import java.util.Arrays;

public class E14 {
    public static void main(String[] args) {
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

        IO.println(Arrays.toString(numerosE14));
    }
}
