package pl.edu.pg.eti.ksg.po.lab2.symulatorwycieczki.gory;

import pl.edu.pg.eti.ksg.po.lab2.symulatorwycieczki.Wedrowka;

public class Zbocze extends Wedrowka {

    public Zbocze(double odleglosc) {
        super(odleglosc);
    }

    @Override
    public double modyfikujPredkoscGrupy(double predkosc) {
        return 1.1f * predkosc;
    }

    @Override
    public int getTrudnoscNawigacyjna() {
        return 1;
    }

    @Override
    public String getNazwa() {
        return "Zbocze";
    }
}
