package nedelja5.zivotinje;

import java.util.ArrayList;

public class Park {
    private ArrayList<Zivotinja> zivotinje;
    private double povrsina;

    public Park(ArrayList<Zivotinja> zivotinje, double povrsina) {
        this.zivotinje = zivotinje;
        this.povrsina = povrsina;
    }

    public static void main(String[] args) {
        Zivotinja zivuljka = new Zivotinja("dzeki", "pas", 4);
        int brojNogu = zivuljka.brojNogu;

        //int ime = zivuljka.ime;





        ArrayList<Zivotinja> listaZivotinja = new ArrayList<>();
        double povrsinaParka = 100;

        Macka macka = new Macka("Flekica", "maca", "viskas");
        System.out.println(macka instanceof Macka);
        System.out.println(macka instanceof Zivotinja);
        Zivotinja macka2 = new Macka("Pega", "maca", "granukle");
        Zivotinja pas = new Pas("dzeki", "dog", "crna");
        System.out.println(macka2 instanceof Macka);
        System.out.println(macka2 instanceof Zivotinja);

        listaZivotinja.add(macka);
        listaZivotinja.add(macka2);
        listaZivotinja.add(pas);
        for (Zivotinja ljubimac : listaZivotinja) {
            System.out.println(ljubimac);
        }
    }
}
