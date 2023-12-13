package dnd;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Karakter {

    private static final Random RND = new Random();
    private int eletero, ugyesseg, szerencse;
    private ArrayList<Targy> felszereles;

    public Karakter() {
        eletero = kockadobas(2) + 12;
        ugyesseg = kockadobas() + 6;
        szerencse = kockadobas() + 6;
        felszereles = new ArrayList<>();
    }

    private int kockadobas() {
        return kockadobas(1);
    }

    private int kockadobas(int db) {
        int osszeg = 0;
        for (int i = 0; i < db; i++) {
            osszeg += RND.nextInt(1, 6 + 1);
        }
        return osszeg;
    }

    public void felvesz(Targy targy, int db) {
        for (int i = 0; i < db; i++) {
            felvesz(targy);
        }
    }

    public void felvesz(Targy targy) {
        felszereles.add(targy);
    }

    public void hasznal(String targyNev) {
        hasznal(targyNev, 1);
    }

    public void hasznal(String targyNev, int db) {
        hasznal(targyNev, db, true);
    }

    public void hasznal(String targyNev, int db, boolean hasznalHaKevesebbVan) {
        List<Integer> targyIndexek = new ArrayList<>();

        for (int i = 0; i < felszereles.size() && targyIndexek.size() < db; i++) {
            if (felszereles.get(i).getNev().equals(targyNev)) {
                targyIndexek.add(i);
            }
        }
        int talaltTargyDb = targyIndexek.size();

        if (talaltTargyDb > 0) {
            if (hasznalHaKevesebbVan || talaltTargyDb == db) {
                for (int index : targyIndexek) {
                    felszereles.remove(index);
                }
                System.out.printf("%d db %s | Felhasználva!\n", talaltTargyDb, targyNev);
            } else {
                System.out.printf("%s | Felhasználás sikertelen! (%d/%d)\n", targyNev, db, talaltTargyDb);
            }
        } else {
            System.out.printf("%d db %s | Nem található!\n", talaltTargyDb, targyNev);
        }
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

    @Override
    public String toString() {
        return String.format("Karakter{eletero=%d, ugyesseg=%d, szerencse=%d, felszerelesek=%s}", eletero, ugyesseg, szerencse, felszereles);
    }

}
