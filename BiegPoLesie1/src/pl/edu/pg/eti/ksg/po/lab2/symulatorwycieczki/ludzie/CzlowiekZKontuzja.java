package pl.edu.pg.eti.ksg.po.lab2.symulatorwycieczki.ludzie;

import pl.edu.pg.eti.ksg.po.lab2.symulatorwycieczki.Atrakcja;
import pl.edu.pg.eti.ksg.po.lab2.symulatorwycieczki.Wedrowka;

public class CzlowiekZKontuzja extends Czlowiek {

    public CzlowiekZKontuzja(String imie, String nazwisko, Plec plec) {
        super(imie, nazwisko, plec, 3.0);
    }

    protected CzlowiekZKontuzja(String imie, String nazwisko, Plec plec, double maksymalnaPredkosc) {
        super(imie, nazwisko, plec, maksymalnaPredkosc, 18, 12);
    }

    protected CzlowiekZKontuzja(String imie, String nazwisko, Plec plec, double maksymalnaPredkosc, double czasPelnejRegeneracji, double czasPelnegoZmeczenia) {
        super(imie, nazwisko, plec, maksymalnaPredkosc, czasPelnejRegeneracji, czasPelnegoZmeczenia);
    }

    @Override
    public int getUmiejetnosciNawigacyjne()
    {
        return 2;
    }
    @Override
    public void reagujNaAtrakcje(Atrakcja atrakcja, double czasTrwania)
    {
        mow("Uff...W końcu będzie można odpocząć na: "+atrakcja.getNazwa());
        regeneruj(czasTrwania);
    }
    @Override
    public void reagujNaWedrowke(Wedrowka w, double czas) {
        mow("Ehh...I znowu trzeba iść i znosic ból kontuzji idąc " + w.getNazwa());
        aktualizujZmeczenie(czas);
    }
}
