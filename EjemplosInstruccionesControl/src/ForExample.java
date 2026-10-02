public class ForExample {
    public static void main(String[] args) {

        //Sumar los 10 primeros naturales
        int suma = 0;
        for(int i = 0; i <= 100; i++){
            suma = suma + i;
        }

        System.out.println("La suma total es:" + suma);

        int suma2 = 0;
        for(int i = 100; i >= 0; i--){
            suma2 = suma2 + i;
        }
        System.out.println("La suma total es:" + suma2);

    }
}
