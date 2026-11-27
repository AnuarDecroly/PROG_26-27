public class Satelites extends Astros{

    private double distanciaPlanetaria;
    private double orbitaPlanetaria;
    private Planeta planeta;

    public Satelites(double radioEcuatorial, double rotacion, double masa, double temperaturaMedia, double gravedad,
                     double distanciaPlanetaria,double orbitaPlanetaria, Planeta planeta) {
        super(radioEcuatorial, rotacion, masa, temperaturaMedia, gravedad);
        this.distanciaPlanetaria = distanciaPlanetaria;
        this.orbitaPlanetaria = orbitaPlanetaria;
        this.planeta = planeta;
    }

    public double getDistanciaPlanetaria() {
        return this.distanciaPlanetaria;
    }

    public double getOrbitaPlanetaria() {
        return this.orbitaPlanetaria;
    }

    public Planeta getPlaneta() {
        return this.planeta;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder();
        sb.append(", distanciaPlanetaria=").append(distanciaPlanetaria);
        sb.append(", orbitaPlanetaria=").append(orbitaPlanetaria);
        sb.append(", planeta=").append(planeta);
        return sb.toString();
    }

    @Override
    public String muestra() {
        return super.toString() + this.toString();
    }


}
