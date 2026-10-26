import Model.Persona;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
void main(String[] args) {

    //Mi primer objeto de persona
    Persona pp = new Persona("Pepe","Blanco", 43, "9876543D");

    // Mi segundo objeto
    Persona paco = new Persona("Paco","Garcia", 45);

    Persona ans = new Persona("Fernando", "Alonso", 45, "12345678A");

    Persona p1 = new Persona("Fernando", "Alonso", 45, "12345678A");

    IO.println(pp);
    IO.println((pp.getNombre()));
    pp.setNombre("Don Jose");
    pp.setEdad(44);


    IO.println(pp.getNombre());

    IO.println(pp.personaToString());


    Persona paco1 = new Persona("Paco","Garcia", 45);

    Persona ans1 = new Persona("Fernando", "Alonso", 45, "12345678A");

    Persona p12 = new Persona("Fernando", "Alonso", 45, "12345678A");

    IO.println("La poblacion mundial en el mundo de DeCROLY ES: " +Persona.PoblacionMundial());

    Persona [] miClase = new Persona[2];
    IO.println("Introduzca los datos de las personas");
    Scanner sc = new Scanner(System.in);
    for(int i =0; i< miClase.length; i++){
        sc = new Scanner(System.in);

        IO.println("Introduce el nombre");
        String nombre = sc.nextLine();
        IO.println("Introduce los apellidos");
        String apellidos = sc.nextLine();
        IO.println("Introduce el dni");
        String dni = sc.nextLine();
        IO.println("Introduce la edad");
        int edad = sc.nextInt();

        miClase[i] = new Persona(nombre,apellidos,edad,dni);
        IO.println(miClase[i].personaToString());
        IO.println();
    }






}
