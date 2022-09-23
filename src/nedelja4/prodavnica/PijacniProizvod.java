package nedelja4.prodavnica;

public class PijacniProizvod extends Roba{
    private double tezina; //tezina u gramima
    private boolean uvoz;

    public PijacniProizvod(int barKod, double cena, String naziv, int popust, Proizvodjac proizvodjac, double tezina, boolean uvoz) {
        super(barKod, cena, naziv, popust, proizvodjac);
        this.tezina = tezina;
        this.uvoz = uvoz;
    }

    @Override
    public void obracunajCenu() {
        setCena(getCena() * tezina / Roba.faktorTezine);
    }

    public static void main(String[] args) {
        PijacniProizvod banane =
                new PijacniProizvod(123, 1000, "banane", 0, new Proizvodjac(), 100.00, false);
        banane.obracunajCenu();
        assert banane.getCena() == 100.00;
        System.out.println("Testovi prosli");
    }

    @Override
    public String toString() {
        return super.toString() +
                "tezina=" + tezina +
                ", uvoz='" + uvoz + '\n';
    }
}
