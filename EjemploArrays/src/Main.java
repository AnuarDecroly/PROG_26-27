//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
void main() {
    double [] notas = new double[20];
    String nombres [] = new String [notas.length];

    for(int i = 0; i < notas.length; i++){
        notas[i] = Math.random() * 10;
        IO.println(notas[i]);

        nombres[i] = "Alumno_" + i;
        IO.println(nombres[i]);
    }






}
