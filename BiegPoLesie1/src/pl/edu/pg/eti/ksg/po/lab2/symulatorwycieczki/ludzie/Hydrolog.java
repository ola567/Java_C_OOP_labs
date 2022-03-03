package pl.edu.pg.eti.ksg.po.lab2.symulatorwycieczki.ludzie;

import pl.edu.pg.eti.ksg.po.lab2.symulatorwycieczki.Wedrowka;
import pl.edu.pg.eti.ksg.po.lab2.symulatorwycieczki.gory.*;

public class Hydrolog extends Czlowiek {

    public Hydrolog(String imie, String nazwisko, Plec plec) {
        super(imie, nazwisko, plec, 6.0);
    }
    public Hydrolog(String imie, String nazwisko, Plec plec, double maksymalnaPredkosc) {
        super(imie, nazwisko, plec, maksymalnaPredkosc, 18, 18);
    }

    public Hydrolog(String imie, String nazwisko, Plec plec, double maksymalnaPredkosc, double czasPelnejRegeneracji, double czasPelnegoZmeczenia) {
        super(imie, nazwisko, plec, maksymalnaPredkosc, czasPelnejRegeneracji, czasPelnegoZmeczenia);
    }

    @Override
    public int getUmiejetnosciNawigacyjne() {
        return 5;
    }

    @Override
    public void reagujNaWedrowke(Wedrowka w, double czas)
    {
        if (w instanceof BlotnistaDroga || w instanceof ZalanaLakaTrawiasta || w instanceof ZalanaLakaTurzyc || w instanceof ZalaneTrzciny || w instanceof ZalanyLas)
        {
            mow("Jaka piękna trasa, w sam raz dla miłośnika hydrologii. Mogę zebrać wiele danych do badań naukowych między innymi o pH wody czy EC");
            aktualizujZmeczenie(czas);
        }
        else
            super.reagujNaWedrowke(w,czas);
    }
}
