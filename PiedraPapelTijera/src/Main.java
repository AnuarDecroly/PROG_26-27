//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
void main() {

    final String [] jugadas = {"P", "L", "T"};
    String jugada = "s";
    Scanner sc = new Scanner(System.in);

    do{
        IO.println("Bienvenido al juego de Piedra, Papel, Tijera de Decroly");
        IO.println("Escoja la jugada a realizar: Piedra (P), Papel (L), Tijera (T). Pulse S para salir");
        sc = new Scanner(System.in);
        jugada = sc.nextLine();

        String jugadaOrdenador = jugadas[(int) (Math.random() * 3)];

        if(jugada.equalsIgnoreCase("p") || jugada.equalsIgnoreCase("l")
        || jugada.equalsIgnoreCase("t")){
            if(jugada.equalsIgnoreCase(jugadaOrdenador)){
                IO.println("Empate: " + jugada + " vs " + jugadaOrdenador);
            }
            else if (jugada.equalsIgnoreCase("p")){
                    if(jugadaOrdenador.equalsIgnoreCase("t")){
                        IO.println("Gana jugador: Piedra gana a tijera: " + jugada + " vs " + jugadaOrdenador);
                    }
                    else if(jugadaOrdenador.equalsIgnoreCase("l")){
                        IO.println("Gana ordenador: Piedra gana a papel: " + jugada + " vs " + jugadaOrdenador);
                    }
            }
            else if (jugada.equalsIgnoreCase("l")){
                if(jugadaOrdenador.equalsIgnoreCase("p")){
                    IO.println("Gana jugador: Piedra gana a papel: " + jugada + " vs " + jugadaOrdenador);
                }
                else if(jugadaOrdenador.equalsIgnoreCase("l")){
                    IO.println("Gana ordenador: Tijera gana a papel: " + jugada + " vs " + jugadaOrdenador);
                }
            }

            else if (jugada.equalsIgnoreCase("t")){
                if(jugadaOrdenador.equalsIgnoreCase("l")){
                    IO.println("Gana jugador: Tijera gana a papel: " + jugada + " vs " + jugadaOrdenador);
                }
                else if(jugadaOrdenador.equalsIgnoreCase("p")){
                    IO.println("Gana ordenador: Piedra gana a tijera: " + jugada + " vs " + jugadaOrdenador);
                }
            }

        }
        else if(jugada.equalsIgnoreCase("s")){
            IO.println("Se va a cerrar el juego");
        }
        else{
            IO.println("Por favor escoja una opcion correcta");
        }

        IO.println();
    }while(!jugada.equalsIgnoreCase("s"));

}
