package dnd;

import java.util.UUID;

public class Targy {

    private String nev, leiras;
    private UUID id;

    public Targy(String nev, String leiras) {
        this.nev = nev;
        this.leiras = leiras;
        this.id = UUID.randomUUID();
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

    @Override
    public String toString() {
        return String.format("Targy{nev='%s', leiras='%s', id=%s}", nev, leiras, id);
    }

}
