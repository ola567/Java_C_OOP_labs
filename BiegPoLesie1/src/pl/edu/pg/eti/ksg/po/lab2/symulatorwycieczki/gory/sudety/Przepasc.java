package pl.edu.pg.eti.ksg.po.lab2.symulatorwycieczki.gory.sudety;

import pl.edu.pg.eti.ksg.po.lab2.symulatorwycieczki.Atrakcja;

public class Przepasc extends Atrakcja {

    public Przepasc(String nazwa){
        super(nazwa);
    }

    @Override
    public double getWymaganyCzas() {
        return 0.17;
    }
    @Override
    public String getNazwa() {
        return "Przepaść";
    }
}
