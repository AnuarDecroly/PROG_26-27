public class Planeta extends Astros{

    private double distanciaSol;
    private double orbitaAlSol;
    private boolean tieneSatelites;


    public Planeta(double radioEcuatorial, double rotacion, double masa, double temperaturaMedia, double gravedad,
                   double distanciaSol, double orbitaAlSol, boolean tieneSatelites) {
        super(radioEcuatorial, rotacion, masa, temperaturaMedia, gravedad);
        this.distanciaSol = distanciaSol;
        this.orbitaAlSol = orbitaAlSol;
        this.tieneSatelites = tieneSatelites;
    }

    public double getDistanciaSol() {
        return this.distanciaSol;
    }

    public double getOrbitaAlSol() {
        return this.orbitaAlSol;
    }

    public boolean isTieneSatelites() {
        return this.tieneSatelites;
    }

    @Override
    public String muestra() {
        return super.toString() + this.toString();
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder();
        sb.append(" , distanciaSol=").append(distanciaSol);
        sb.append(", orbitaAlSol=").append(orbitaAlSol);
        sb.append(", tieneSatelites=").append(tieneSatelites);
        return sb.toString();
    }
}
