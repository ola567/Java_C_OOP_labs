package pl.edu.pg.eti.ksg.po.lab2;

import pl.edu.pg.eti.ksg.po.lab2.symulatorwycieczki.ElementWycieczki;

@FunctionalInterface
public interface SluchaczPostepow {
    void aktualizujPostep(ElementWycieczki elementWycieczki, int lp, int liczbaElementow);
}
