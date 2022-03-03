package pl.edu.pg.eti.ksg.po.lab2.symulatorwycieczki.ludzie;

import pl.edu.pg.eti.ksg.po.lab2.symulatorwycieczki.Atrakcja;
import pl.edu.pg.eti.ksg.po.lab2.symulatorwycieczki.Wedrowka;
import pl.edu.pg.eti.ksg.po.lab2.symulatorwycieczki.gory.Bagna;

public class BagiennyBiegacz extends Czlowiek {

    public BagiennyBiegacz(String imie, String nazwisko, Plec plec) {
        super(imie, nazwisko, plec, 6.0);
    }
    public BagiennyBiegacz(String imie, String nazwisko, Plec plec, double maksymalnaPredkosc) {
        super(imie, nazwisko, plec, maksymalnaPredkosc, 12, 20);
    }

    public BagiennyBiegacz(String imie, String nazwisko, Plec plec, double maksymalnaPredkosc, double czasPelnejRegeneracji, double czasPelnegoZmeczenia) {
        super(imie, nazwisko, plec, maksymalnaPredkosc, czasPelnejRegeneracji, czasPelnegoZmeczenia);
    }

    @Override
    public int getUmiejetnosciNawigacyjne() {
        return 5;
    }

    @Override
    public void reagujNaWedrowke(Wedrowka w, double czas) {
        if(w instanceof Bagna) {
            mow("Bagna!! To co lubię");
            aktualizujZmeczenie(0.5*czas);
        }
        else
            super.reagujNaWedrowke(w,czas);
    }

    @Override
    public void reagujNaAtrakcje(Atrakcja atrakcja, double czasTrwania){
        super.reagujNaAtrakcje(atrakcja,czasTrwania);
    }
}
