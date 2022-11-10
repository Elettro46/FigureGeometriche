public class Main {
    public static void main(String[] args) {
        Forma f1 = new Cerchio(20);
        System.out.println("area: " + f1.area() + " perimentro: " + f1.perimetro());
        Forma f2 = new Rettangolo(10, 5);
        System.out.println("area: " + f2.area() + " perimentro: " + f2.perimetro());

        Forma f3 = new Cerchio(50);
        System.out.println("area: " + f3.area() + " perimentro: " + f3.perimetro());
        Forma f4 = new Rettangolo(100, 50);
        System.out.println("area: " + f4.area() + " perimentro: " + f4.perimetro());

        //useless comment
    }
}
