package dnd;

import java.util.ArrayList;
import java.util.Random;

public class Karakter {

    private Random rnd;
    private int eletero, ugyesseg, szerencse;
    ArrayList<Targy> felszereles;

    public Karakter(int eletero, int ugyesseg, int szerencse) {
        this.eletero = (rnd.nextInt(1, 7) * 2) + 12;
        this.ugyesseg = rnd.nextInt(1, 7) + 6;
        this.szerencse = rnd.nextInt(1, 7) + 6;
    }

    public void felvesz(Targy targy) {
        felszereles.add(targy);
    }

    public void felveszTobb(Targy targy, int mennyi) {
        for (int ix = 0; ix < mennyi; ix++) {
            felszereles.add(targy);
        }
    }
}
