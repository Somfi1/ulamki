public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        Rational a = new Rational(2, 1);
        Rational b = new Rational(4, 3);

        Rational odej = a.odej(b);
        System.out.println(odej);

        Rational dodaj = a.dodaj(b);
        System.out.println(dodaj);
    }
}