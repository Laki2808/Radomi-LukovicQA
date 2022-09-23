package nedelja4.prodavnica;

public class Proizvodjac {
    private String naziv;
    private String lokacija;


    public Proizvodjac() {};
    public Proizvodjac(String naziv, String lokacija) {
        this.naziv = naziv;
        this.lokacija = lokacija;
    }


    @Override
    public String toString() {
        return "Prozvodjac{" +
                "naziv='" + naziv + '\'' +
                ", lokacija='" + lokacija + '\'' +
                '}';
    }
}
