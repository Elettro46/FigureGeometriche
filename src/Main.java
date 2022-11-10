public class Main {
    public static void main(String[] args) {
        Forma f1 = new Cerchio(20);
        System.out.println("area: " + f1.area() + " perimetro: " + f1.perimetro());
        Forma f2 = new Rettangolo(10, 5);
        System.out.println("area: " + f2.area() + " perimetro: " + f2.perimetro());

        Forma f3 = new Cerchio(50);
        System.out.println("area: " + f3.area() + " perimetro: " + f3.perimetro());
        Forma f4 = new Rettangolo(100, 50);
        System.out.println("area: " + f4.area() + " perimetro: " + f4.perimetro());

        //useless comment

        System.out.println("Circulo :"+f1.toString());
        System.out.println("Rectangulo:"+f2.toString());
        System.out.println("Press (F) in the chat");
    }
}
