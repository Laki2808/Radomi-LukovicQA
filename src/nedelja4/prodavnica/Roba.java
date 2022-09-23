package nedelja4.prodavnica;

public class Roba {
    private int barKod;
    private double cena; //cena u startu je u KG
    private String naziv;
    private int popust;
    private Proizvodjac proizvodjac;
    public static final int faktorTezine = 1000;

    public Roba(int barKod, double cena, String naziv, int popust, Proizvodjac proizvodjac) {
        this.barKod = barKod;
        this.cena = cena;
        this.naziv = naziv;
        this.popust = popust;
        this.proizvodjac= proizvodjac;
    }

    public int getBarKod() {
        return barKod;
    }

    public double getCena() {
        return cena;
    }

    public String getNaziv() {
        return naziv;
    }

    public int getPopust() {
        return popust;
    }

    public Proizvodjac getProzvodjac() {
        return proizvodjac;
    }

    public void setCena(double cena) {
        this.cena = cena;
    }

    public void setNaziv(String naziv) {
        this.naziv = naziv;
    }

    public void setPopust(int popust) {
        this.popust = popust;
    }

    public void obracunajPopust() {
        this.cena = this.cena - (this.cena * popust / 100);
    }

    public void obracunajCenu(){

    }

    @Override
    public String toString() {
        return "barKod=" + barKod +
                ", cena=" + cena +
                ", naziv='" + naziv + '\'' +
                ", popust=" + popust +
                ", prozvodjac=" + proizvodjac;
    }

    public static void main(String[] args) {
        Roba roba = new Roba(123, 100, "mleko", 1, new Proizvodjac());
        roba.obracunajPopust();
        assert roba.getCena() == 99.0;
        System.out.println("Testovi prosli");

    }
}
