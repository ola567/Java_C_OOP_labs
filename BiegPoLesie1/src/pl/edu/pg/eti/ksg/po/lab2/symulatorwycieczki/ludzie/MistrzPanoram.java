package pl.edu.pg.eti.ksg.po.lab2.symulatorwycieczki.ludzie;

import pl.edu.pg.eti.ksg.po.lab2.symulatorwycieczki.Atrakcja;
import pl.edu.pg.eti.ksg.po.lab2.symulatorwycieczki.Wedrowka;
import pl.edu.pg.eti.ksg.po.lab2.symulatorwycieczki.gory.sudety.Panorama;

public class MistrzPanoram extends Czlowiek {

    public MistrzPanoram(String imie, String nazwisko, Plec plec) {
        super(imie, nazwisko, plec, 5.0);
    }

    public MistrzPanoram(String imie, String nazwisko, Plec plec, double maksymalnaPredkosc) {
        super(imie, nazwisko, plec, maksymalnaPredkosc, 18,18);
    }

    public MistrzPanoram(String imie, String nazwisko, Plec plec, double maksymalnaPredkosc, double czasPelnejRegeneracji, double czasPelnegoZmeczenia) {
        super(imie, nazwisko, plec, maksymalnaPredkosc, czasPelnejRegeneracji, czasPelnegoZmeczenia);
    }

    @Override
    public void reagujNaAtrakcje(Atrakcja a, double czasTrwania)
    {
        if (a instanceof Panorama)
        {
            mow("Oh jak tu pięknie...Nic mnie nie relaksuje bardziej niż piękne widoki.");
            regeneruj(2*czasTrwania);
        }
        else
            super.reagujNaAtrakcje(a, czasTrwania);
    }
    @Override
    public int getUmiejetnosciNawigacyjne() {
        return 4;
    }
}
