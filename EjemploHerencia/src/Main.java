//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
void main() {

    String [] modulos = {"Frenada", "Paso por curva", "Adelantamiento","El ultimo pie"};

    Persona pp = new Persona("Pepe", "garcia", LocalDate.now(), "12345678P");

    Alumno a1 = new Alumno("Marc", "Marquez",LocalDate.now(), "10101010M",
            "MOTOGP",2026, modulos);

    AntiguosAlumnos a2 = new AntiguosAlumnos("Valentino", "Rossi",LocalDate.now(), "99999999M",
            "MOTOGP",2022, modulos, LocalDate.now(), false);

//    IO.println(pp);
//    IO.println(a1);

    Persona[] decrolyComunidad = new Persona[5];

    decrolyComunidad[0] = pp;
    decrolyComunidad [1] = a1;
    decrolyComunidad[2] = a2;

    for(int i=0; i < decrolyComunidad.length; i++){
        if(decrolyComunidad[i] != null){
            if(decrolyComunidad[i] instanceof Alumno){
                IO.println(decrolyComunidad[i]);
            }

            //decrolyComunidad[i].getClass().getName().equals("Alumno")
        }
    }


}
