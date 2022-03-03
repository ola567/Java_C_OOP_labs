package pl.edu.pg.eti.ksg.po.lab2.symulatorwycieczki.gory.sudety;

import pl.edu.pg.eti.ksg.po.lab2.symulatorwycieczki.Atrakcja;

public class Panorama extends Atrakcja {
    public Panorama(String nazwa){
        super(nazwa);
    }

    @Override
    public double getWymaganyCzas() {
        return 0.17;
    }
    @Override
    public String getNazwa() {
        return "Panorama";
    }
}
