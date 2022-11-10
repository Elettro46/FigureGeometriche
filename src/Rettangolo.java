public class Rettangolo extends Forma {

    private double lunghezza;
    private double altezza;

    public Rettangolo(double lunghezza, double larghezza) {
        this.lunghezza = lunghezza;
        this.altezza = larghezza;
    }

    @Override
    public double area() {
        return lunghezza * altezza;
    }

    @Override
    public double perimetro() {
        return 2 * (altezza * lunghezza);
    }

    public double getLunghezza() {
        return lunghezza;
    }

    public void setLunghezza(double lunghezza) {
        this.lunghezza = lunghezza;
    }

    public double getAltezza() {
        return altezza;
    }

    public void setAltezza(double altezza) {
        this.altezza = altezza;
    }

    @Override
    public int hashCode() {
        final int prime = 17;
        int result = 1;
        long temp;
        temp = Double.doubleToLongBits(lunghezza);
        result = prime * result + (int) (temp ^ (temp >>> 32));
        temp = Double.doubleToLongBits(altezza);
        result = prime * result + (int) (temp ^ (temp >>> 32));
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Rettangolo other = (Rettangolo) obj;
        if (Double.doubleToLongBits(lunghezza) != Double.doubleToLongBits(other.lunghezza))
            return false;
        if (Double.doubleToLongBits(altezza) != Double.doubleToLongBits(other.altezza))
            return false;
        return true;
    }

    @Override
    public String toString() {
        return "Rettangolo [lunghezza=" + lunghezza + ", altezza=" + altezza + "]";
    }

}
