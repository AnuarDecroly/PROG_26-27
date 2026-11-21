//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
void main() {
// esto es un cambio   este cambio ahora es el servido
    final String ibanPattern = "[A-Z]{2}[0-9]{22}";
    final String titularPattern = "[a-z A-Z]{3,}";

    String titular = MiUtils.comprobarPatronRepetidamente(titularPattern,"Introduce el titular de la cuenta");
    String iban = MiUtils.comprobarPatronRepetidamente(ibanPattern, "Introduce el IBAN de la cuenta: (ej:ES1234567890123456789012)");

    CuentaBancaria miCuenta = new CuentaBancaria(titular, iban);

    String opcion = "8";
    String [] opciones = {"1. Datos de la cuenta", "2. IBAN", "3. Titular", "4. Saldo",
            "5. Ingreso", "6. Retirada", "7. Movimientos", "8. Salir"};

    do{
        opcion = MiUtils.generarMenuOpciones(opciones);

        switch (opcion){
            case "1" ->
            {
                IO.println(miCuenta.infoCuentaBancaria());
            }

            case "2" ->
            {
                IO.println("El IBAN es: "+miCuenta.getIban());
            }

            case "3" ->
            {
                IO.println("El Titular es: "+miCuenta.getTitular());
            }

            case "4" ->
            {
                IO.println("El saldo es: "+miCuenta.getSaldo());
            }

            case "5" ->
            {
                //Ingresar
                ingresar(miCuenta);
            }

            case "6" ->
            {
                //Retirar
                retirar(miCuenta);
            }

            case "7" ->
            {
                IO.println(miCuenta.infoMovimientos());
            }

            case "8" ->
            {
                IO.println("Gracias por elegir DAWBank, hasta la proxima");
            }

            default ->
            {
                IO.println("Por favor, escoja una opción correcta");
            }

        }

    }while(!opcion.equals("8"));
}

public static void ingresar(CuentaBancaria miCuenta){
    Scanner sc = new Scanner(System.in);
    IO.println("Introduce la cantidad a ingresar");
    double cantidad = 0.0;
    if(sc.hasNextDouble())
    {
        cantidad = sc.nextDouble();
    }
    else{
        IO.println("El formato no es correcto, vuelva a intentarlo");
    }
    if(cantidad != 0.0){
        //ingresar
        if(miCuenta.ingresar(cantidad)){
            IO.println("La operacion se ha realizado correctamente");
            if(Math.abs(cantidad) > 3000){
                IO.println("Se ha notificado a Hacienda de la operacion");
            }
        }
    }else{
        IO.println("La cantidad es igual a 0, por lo que no se realizara el ingreso");
    }

}

public static void retirar(CuentaBancaria miCuenta){
    Scanner sc = new Scanner(System.in);
    IO.println("Introduce la cantidad a retirar");
    double cantidad = 0.0;
    if(sc.hasNextDouble())
    {
        cantidad = sc.nextDouble();
    }
    else{
        IO.println("El formato no es correcto, vuelva a intentarlo");
    }
    if(cantidad != 0.0){
        //ingresar
        if(miCuenta.retirar(cantidad)){
            IO.println("La operacion se ha realizado correctamente");
            if(Math.abs(cantidad) > 3000){
                IO.println("Se ha notificado a Hacienda de la operacion");
            }
        }else{
            IO.println("No se ha podido hacer la retirada, su saldo sería inferior a -50€");
        }
    }else{
        IO.println("La cantidad es igual a 0, por lo que no se realizara el ingreso");
    }

}


