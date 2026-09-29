public class WhileExample {
    public static void main(String[] args) {

        int edad = 0;

        while (edad < 1800) {
            System.out.println("Tu edad es: "+edad);
            System.out.println("Eres menor de edad  y no puedes pasar");
            System.out.println("Esperar un año");
            edad++; //edad = edad + 1;
        }

        if (edad >= 1800) {
            System.out.println("Tu edad es: "+edad);
            System.out.println("Puedes pasar");
        }
    }
}
