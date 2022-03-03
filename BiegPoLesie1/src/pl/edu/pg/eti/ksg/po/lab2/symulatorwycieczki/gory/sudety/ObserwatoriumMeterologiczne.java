package pl.edu.pg.eti.ksg.po.lab2.symulatorwycieczki.gory.sudety;

import pl.edu.pg.eti.ksg.po.lab2.symulatorwycieczki.Atrakcja;

public class ObserwatoriumMeterologiczne extends Atrakcja {

    public ObserwatoriumMeterologiczne(String nazwa) {
        super(nazwa);
    }

    @Override
    public double getWymaganyCzas() {
        return 1;
    }

    @Override
    public String getNazwa() {
        return "Obserwatorium meetrologiczne";
    }
}
