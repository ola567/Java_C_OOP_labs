package pl.edu.pg.eti.ksg.po.lab2.symulatorwycieczki.gory.beskidy;

import pl.edu.pg.eti.ksg.po.lab2.symulatorwycieczki.Atrakcja;

public class DrewnianaCerkiew extends Atrakcja {

    private String miejscowosc;

    public void setMiejscowosc(String miejscowosc) {
        this.miejscowosc = miejscowosc;
    }

    public String getMiejscowosc() {
        return miejscowosc;
    }

    public DrewnianaCerkiew(String nazwa){
        super(nazwa);
    }

    @Override
    public double getWymaganyCzas() {
        return 0.5;
    }

    @Override
    public String getNazwa() {
        return "Drewniana cerkiew";
    }
}
