package model;

public class Libro {

    //Atributos de la clase
    private String isbn;
    private String titulo;
    private String autor;
    private int nPaginas;
    private String editorial;
    private String genero;
    private String fechaPublicacion;

    public Libro(String isbn, String titulo, String autor){
        this.isbn = isbn;
        this.autor = autor;
        this.titulo = titulo;
        this.nPaginas = 0;
        this.editorial = "";
        this.genero = "";
        this.fechaPublicacion = "";
    }

    public Libro(String isbn, String titulo, String autor, int nPaginas,String editorial,
                 String genero, String fechaPublicacion){
        this.isbn = isbn;
        this.autor = autor;
        this.titulo = titulo;
        this.nPaginas = nPaginas;
        this.editorial = editorial;
        this.genero = genero;
        this.fechaPublicacion = fechaPublicacion;
    }


}//clase
