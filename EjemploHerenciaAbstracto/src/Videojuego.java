public class Videojuego extends Producto implements Stock{

    private String PEG;
    private String plataforma;
    private String desarrolladora;

    public Videojuego(String codigo, String nombre, String descripcion, double precio,
                      String PEG, String plataforma, String desarrolladora) {
        super(codigo, nombre, descripcion, precio);
        this.PEG = PEG;
        this.desarrolladora = desarrolladora;
        this.plataforma = plataforma;
    }

    public String getPEG() {
        return PEG;
    }

    public String getPlataforma() {
        return plataforma;
    }

    public String getDesarrolladora() {
        return desarrolladora;
    }

    @Override
    public double obtenerDescuento() {
        return 0;
    }

    @Override
    public String obtenerCalificacion() {
        return this.PEG;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder();
        sb.append(super.toString()).append("\n");
        sb.append("PEG = ").append(PEG).append("\n");
        sb.append("Plataforma = ").append(plataforma).append("\n");
        sb.append("Desarrolladora = ").append(desarrolladora).append("\n");
        return sb.toString();
    }


    @Override
    public int getStock() {
        return 0;
    }

    @Override
    public void setStock(int stock) {

    }

    @Override
    public void disableItem() {

    }

    @Override
    public void enableItem() {

    }
}
