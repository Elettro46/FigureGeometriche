public class Quadrato extends Forma {
    private double lato;

    public Quadrato(double lato) {
        this.lato = lato;
    }

    public double getLato() {
        return lato;
    }

    public void setLato(double lato) {
        this.lato = lato;
    }

    @Override
    public double area() {
        return lato * lato;
    }

    @Override
    public double perimetro() {
        return lato * 4;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        long temp;
        temp = Double.doubleToLongBits(lato);
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
        Quadrato other = (Quadrato) obj;
        if (Double.doubleToLongBits(lato) != Double.doubleToLongBits(other.lato))
            return false;
        return true;
    }

    @Override
    public String toString() {
        return "Quadrato [lato=" + lato + "]";
    }

}
