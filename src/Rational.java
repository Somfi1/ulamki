public class Rational {
    private int mianownik, liczebnik;

    public Rational(int mianownik, int liczebnik) {
        if(mianownik == 0) {
            mianownik = 1;
        }

        this.mianownik = mianownik;
        this.liczebnik = liczebnik;
    }

    public int getMianownik() {
        return mianownik;
    }

    public void setMianownik(int mianownik) {
        this.mianownik = mianownik;
    }

    public int getLiczebnik() {
        return liczebnik;
    }

    public void setLiczebnik(int liczebnik) {
        this.liczebnik = liczebnik;
    }

    public Rational dodaj(Rational ulamek){
        Rational a = new Rational(mianownik, liczebnik);
        Rational b = new Rational(ulamek.getMianownik(), ulamek.getLiczebnik());

        a.setMianownik(a.getMianownik()*b.getLiczebnik());
        b.setMianownik(a.getLiczebnik()*b.getMianownik());


    }
}
