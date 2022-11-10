public class Cerchio extends Forma {

    private double raggio;
    
    public Cerchio(double raggio) {
        this.raggio = raggio;
    }

    @Override
    public double area() {
        return raggio * raggio * Math.PI;
    }

    public double getRaggio() {
        return raggio;
    }

    @Override
    public String toString() {
        return "Cerchio [raggio=" + raggio + "]";
    }

    @Override
    public double perimetro() {
        return extracted();
    }

    public void setRaggio(double raggio) {
        this.raggio = raggio;
    }

    private double extracted() {
        return 2*raggio*Math.PI;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        long tmp;
        tmp = Double.doubleToLongBits(raggio);
        result = prime * result + (int) (tmp ^ (tmp >>> 32));
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
        Cerchio other = (Cerchio) obj;
        if (Double.doubleToLongBits(raggio) != Double.doubleToLongBits(other.raggio))
            return false;
        return true;
    }
    
}