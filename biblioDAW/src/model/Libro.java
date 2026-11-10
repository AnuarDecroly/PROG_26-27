package model;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Libro {

    //Contador estatico propio de la clase, para llevar el numero total de libros creados
    private static int contadorTotal = 0;
    //Formato para fechas
    private final DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");

    //Atributos de la clase
    private final int id;
    private String isbn;
    private String titulo;
    private String autor;
    private int nPaginas;
    private String editorial;
    private Genero genero;
    private LocalDate fechaPublicacion;

    //Contructores
    public Libro(String isbn, String titulo, String autor){
        this.isbn = isbn;
        this.autor = autor;
        this.titulo = titulo;
        this.nPaginas = 0;
        this.editorial = "";
        this.genero = Genero.GENERICO;
        //this.fechaPublicacion = LocalDate.of(2026,11,10);
        this.fechaPublicacion = LocalDate.now(); //la fecha del instante de creacion (igual para el LocalDateTime)
        //LocalDate.parse("10-11-2026",formatter);
        this.id = contadorTotal;
        contadorTotal++;
    }

    public Libro(String isbn, String titulo, String autor, int nPaginas,String editorial,
                 Genero genero, LocalDate fechaPublicacion){
        this.isbn = isbn;
        this.autor = autor;
        this.titulo = titulo;
        this.nPaginas = nPaginas;
        this.editorial = editorial;
        this.genero = genero;
        this.fechaPublicacion = fechaPublicacion;
        this.id = contadorTotal;
        contadorTotal++;
    }

    /*
        Definimos las propiedades: getters y setters
     */

    public String getIsbn(){
        return this.isbn;
    }

    public int getId(){
        return this.id;
    }

    public String getTitulo() {
        return this.titulo;
    }

    public String getAutor(){
        return  this.autor;
    }

    public void setAutor(String autor){
        this.autor = autor;
    }

    public String getEditorial(){
        return this.editorial;
    }

    public void setEditorial(String editorial){
        this.editorial = editorial;
    }

    public LocalDate getFechaPublicacion (){
        return this.fechaPublicacion;
    }

    public Genero getGenero(){
        return this.genero;
    }

    public void setGenero(Genero genero){
        this.genero = genero;
    }

    public int getnPaginas() {
        return this.nPaginas;
    }

    public void setnPaginas(int nPaginas){
        this.nPaginas = nPaginas;
    }

    //Metodo para obtener toda la informacion libro, devuelve un String.
    public String infoLibro(){
        String infoLibro = "";
        infoLibro += "ID: " + this.id + "\n";
        infoLibro += "Titulo: " + this.titulo + "\n";
        infoLibro += "Autor: " + this.autor + "\n";
        infoLibro += "ISBN: " + this.isbn + "\n";
        infoLibro += "model.Genero: " + this.genero.name() + "\n";
        infoLibro += "Fecha de publicacion: " + this.fechaPublicacion.format(formatter) + "\n";
        infoLibro += "Editorial: " + this.editorial + "\n";
        infoLibro += "NPaginas: " + this.nPaginas + "\n";

        return infoLibro;
    }

}//clase
