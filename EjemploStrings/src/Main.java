//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
void main() {
    //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
    // to see how IntelliJ IDEA suggests fixing it.
    String prueba = "PRO-001,NARANJAS,naranjas de la huerta valencia,5€,300";
    prueba = prueba.toUpperCase();
    String[] elementos = prueba.split(",");

    for (String e : elementos) {
        System.out.println(e);
    }

    double[] notas = new double[5];
    for(double n: notas) {
        n = Math.random() * 10.0;
        IO.println(String.format("%.2f", n));
    }

    //Constante con el patron del formato de DNI
    final String patterDNI = "[0-9]{7,8}[A-Za-z]";

    String midni;

    //IO.println("Cumple el formato: " + midni.matches(patterDNI));

    Scanner sc = new Scanner(System.in);
    do{
        IO.println("Introduce el DNI del estudiante: ");
        midni = sc.nextLine();
        if(!midni.matches(patterDNI))
        {
            IO.println("El DNI no es valido");
        }
    }while(!midni.matches(patterDNI));

    String fechaNacimiento;
    final String patterFecha = "[0-3]{1}[0-9]{1}-[0-1]{1}[0-2]{1}-[0-9]{4}";
    do{
        IO.println("Introduce la fecha de nacimiento del estudiante: ");
        fechaNacimiento = sc.nextLine();
        if(!fechaNacimiento.matches(patterFecha))
        {
            IO.println("Fecha no  valida");
        }
    }while(!fechaNacimiento.matches(patterFecha));

//    for(int i = 0; i < elementos.length; i++){
//        System.out.println(elementos[i]);
//    }

}
