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

        b.setMianownik(b.getMianownik()*a.getMianownik());
        b.setLiczebnik(b.getLiczebnik()*a.getMianownik());

        a.setMianownik(a.getMianownik()*ulamek.getMianownik());
        a.setLiczebnik(a.getLiczebnik()*ulamek.getMianownik());

        a.setLiczebnik(a.getLiczebnik()+b.getLiczebnik());

        return a;
    }
    public Rational odej(Rational ulamek){
        Rational a = new Rational(mianownik, liczebnik);
        Rational b = new Rational(ulamek.getMianownik(), ulamek.getLiczebnik());

        b.setMianownik(b.getMianownik()*a.getMianownik());
        b.setLiczebnik(b.getLiczebnik()*a.getMianownik());

        a.setMianownik(a.getMianownik()*ulamek.getMianownik());
        a.setLiczebnik(a.getLiczebnik()*ulamek.getMianownik());

        a.setLiczebnik(a.getLiczebnik()-b.getLiczebnik());

        return a;
    }
    public Rational mnoz(Rational ulamek){
        return new Rational(ulamek.getMianownik()*mianownik, ulamek.getLiczebnik()*liczebnik);
    }
    public Rational dziel(Rational ulamek){
        Rational a = new Rational(ulamek.getLiczebnik(), ulamek.getMianownik());
        return mnoz(a);
    }
    public double wartosc(){
        return 1.0*liczebnik/mianownik;
    }
    public String toString(){
        return liczebnik+"/"+mianownik;
    }

    public boolean rowne(Rational ulamek){
        double epsilon = 0.000001;
        return Math.abs(ulamek.wartosc()-wartosc())< epsilon;
    }
}
