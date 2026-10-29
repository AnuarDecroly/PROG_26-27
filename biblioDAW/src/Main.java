import model.Libro;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
void main() {
    //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
    // to see how IntelliJ IDEA suggests fixing it.

    Libro l1 = new Libro("122323nn","El señor de los anillos","JRR Tolkien");

    //IO.println(l1.getAutor());

    IO.println(l1.infoLibro());
}
