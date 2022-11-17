public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        Rational a = new Rational(2, 1);
        Rational b = new Rational(2, 1);

        Rational dodaj = a.dodaj(b);
        System.out.println(dodaj);

        Rational odej = a.odej(b);
        System.out.println(odej);

        Rational mnoz = a.mnoz(b);
        System.out.println(mnoz);

        Rational dziel = a.dziel(b);
        System.out.println(dziel);

        System.out.println(dziel.wartosc());

        Rational c = new Rational(8, 4);
        Rational d = new Rational(2, 1);
        System.out.println(a.rowne(b));
    }
}