package dnd;

import java.util.UUID;

public class Targy {

    private String nev, leiras;
    UUID id;

    public Targy(String nev, String leiras, UUID id) {
        this.nev = nev;
        this.leiras = leiras;
        this.id = id;
    }

    public String getNev() {
        return nev;
    }

    public String getLeiras() {
        return leiras;
    }

    public UUID getId() {
        return id;
    }

}
