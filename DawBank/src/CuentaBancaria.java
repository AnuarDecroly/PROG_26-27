import model.Movimiento;
import model.Tipo;

public class CuentaBancaria {

    private String titular;
    private double saldo;
    private String iban;
    private Movimiento [] movimientos;

    private int contadorMovimientos;

    public CuentaBancaria(String titular, String iban){
        this.titular = titular;
        this.iban = iban;
        this.saldo = 0.0;
        this.movimientos = new Movimiento[100];
        this.contadorMovimientos = 0;
    }

    public String getTitular() {
        return this.titular;
    }

    public String getIban() {
        return this.iban;
    }

    public String getSaldo() {
        return String.format("%.2f",this.saldo)+"€";
    }

    public String infoMovimientos(){
        StringBuilder sb = new StringBuilder();
        if(this.contadorMovimientos > 0){
            for(int i=0; i<this.contadorMovimientos;i++){
                sb.append(this.movimientos[i].mostrarInfoMovimiento()).append("\n");
            }
        }else{
            sb.append("No hay movimientos");
        }

        return sb.toString();
    }

    public String infoCuentaBancaria(){
        StringBuilder sb = new StringBuilder();
        sb.append("Titular: ").append(this.titular).append("\n");
        sb.append("IBAN: ").append(this.iban).append("\n");
        sb.append("Saldo: ").append(this.saldo).append("\n");
        return sb.toString();
    }

    public boolean ingresar(double cantidad){
        boolean resultado = false;
        this.saldo += Math.abs(cantidad);
        resultado = true;
        this.generarMovimiento(Math.abs(cantidad), Tipo.INGRESO);
        return resultado;
    }

    public boolean retirar(double cantidad){
        boolean resultado = false;
        if((this.saldo - Math.abs(cantidad)) >= -50 ){
            this.saldo-= Math.abs(cantidad);
            this.generarMovimiento(Math.abs(cantidad), Tipo.RETIRADA);
            resultado = true;
        }
        return resultado;
    }

    private void generarMovimiento(double cantidad, Tipo tipo) {
        if(this.contadorMovimientos >= this.movimientos.length){
            this.ampliarDimensionMovimientos();
        }
        this.movimientos[this.contadorMovimientos] = new Movimiento(tipo,cantidad);
        this.contadorMovimientos++;
    }

    private void ampliarDimensionMovimientos(){
        Movimiento [] movAux = new Movimiento[this.movimientos.length + 100];
        for(int i=0; i< this.movimientos.length; i++){
            movAux[i] = this.movimientos[i];
        }
        this.movimientos = movAux;
    }

}
