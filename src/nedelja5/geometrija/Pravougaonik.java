package nedelja5.geometrija;

public class Pravougaonik implements Obim,Povrsina{
    private double a, b;

    public Pravougaonik(double a, double b) {
        this.a = a;
        this.b = b;
    }

    @Override
    public double racunajPovrsinu() {
        return a * b;
    }

    @Override
    public double racunajObim() {
        return 2*a + 2*b;
    }
}
