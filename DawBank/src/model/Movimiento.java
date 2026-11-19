package model;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Movimiento {
    private int id;
    private LocalDateTime fecha;
    private double cantidad;
    private Tipo tipo;

    private static int contadorMovimiento = 0;
    private final DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");

    public Movimiento(Tipo tipo, double cantidad){
        this.tipo = tipo;
        this.cantidad = cantidad;
        this.fecha = LocalDateTime.now();
        this.id = contadorMovimiento;
        contadorMovimiento++;
    }

    public int getId() {
        return this.id;
    }

    public double getCantidad() {
        return this.cantidad;
    }

    public Tipo getTipo() {
        return this.tipo;
    }

    public LocalDateTime getFecha() {
        return this.fecha;
    }

    public String mostrarInfoMovimiento(){
        StringBuilder sb = new StringBuilder();
        sb.append("ID: ").append(this.id).append("\n").
            append("Fecha: ").append(this.fecha.format(dtf)).append("\n").
            append("Tipo: ").append(this.tipo).append("\n").
            append("Cantidad: ").append(this.cantidad).append("\n");

        return sb.toString();
    }
}
