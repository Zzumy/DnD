package dnd;

import java.util.Random;

public class Karakter {

    private int eletero, ugyesseg, szerencse;
    private Random rnd;

    public Karakter(int eletero, int ugyesseg, int szerencse) {
        this.eletero = (rnd.nextInt(1, 7) * 2) + 12;
        this.ugyesseg = rnd.nextInt(1, 7) + 6;
        this.szerencse = rnd.nextInt(1, 7) + 6;
    }
}
