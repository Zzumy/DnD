package dnd;

public class Jatek {

    public static void main(String[] args) {
        tesztesetek();
    }

    private static void tesztesetek() {
        Karakter karakter = new Karakter();
        karakter.felvesz(new Targy("Bőrpáncél", "Könnyű bőrből készült páncél."));
        karakter.felvesz(new Targy("Arany", "Az egyik alapvető valuta."), 10);
        karakter.felvesz(new Targy("Arany", "Az egyik alapvető valuta."), 30);
        karakter.felvesz(new Targy("Arany", "Az egyik alapvető valuta."), 20);
        karakter.felvesz(new Targy("Arany", "Az egyik alapvető valuta."), 40);
        karakter.felvesz(new Targy("Arany", "Az egyik alapvető valuta."), 50);
        karakter.felvesz(new Targy("Tűzbot", "Egy mágikus bot, amely tűz varázslatokat képes dobni."));
        karakter.felvesz(new Targy("Tűzbot", "Egy mágikus bot, amely tűz varázslatokat képes dobni."), 3);
        karakter.felvesz(new Targy("Tűzbot", "Egy mágikus bot, amely tűz varázslatokat képes dobni."));
        karakter.felvesz(new Targy("Gyógyító Bájital", "Visszaállítja az egészséget."), 1);
        karakter.felvesz(new Targy("Láthatatlanság Tekercse", "Egy mágikus tekercs, amely láthatatlanságot biztosít."), 3);
        karakter.hasznal("Bőrpáncél");
        karakter.hasznal("Arany", 45);
        karakter.hasznal("Tűzbot", 8);
        karakter.hasznal("Gyógyító Bájital", 2, false);
        karakter.hasznal("Teleportációs Amulett");
    }
}
