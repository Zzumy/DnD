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

    public int getEletero() {
        return eletero;
    }

    public int getUgyesseg() {
        return ugyesseg;
    }

    public int getSzerencse() {
        return szerencse;
    }

    public void felvesz(Targy targy) {
        felszereles.add(targy);
    }

    public void felvesz(Targy targy, int db) {
        for (int ix = 0; ix < db; ix++) {
            felszereles.add(targy);
        }
    }

    public void hasznal(String targy) {
        hasznal(targy, 1);
    }

    public void hasznal(String targy, int db) {
        hasznal(targy, db, true);
    }

    public void hasznal(String targy, int db, boolean van) {
        if (van) {
            for (int ix = 0; ix < db; ix++) {
                felszereles.remove(db);
            }
        } else {
            System.out.println("Nincs elegendő" + targy + "a használathoz");
        }
    }
}
