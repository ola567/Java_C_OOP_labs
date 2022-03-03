package pl.edu.pg.eti.ksg.po.lab2.symulatorwycieczki.gory;

import pl.edu.pg.eti.ksg.po.lab2.symulatorwycieczki.Wedrowka;

public class Bagna extends Wedrowka {

    public Bagna(double odleglosc) {
        super(odleglosc);
    }

    @Override
    public String getNazwa() {
        return "Bagna";
    }

    @Override
    public double modyfikujPredkoscGrupy(double predkosc) {
        return 0.5f * predkosc;
    }

    @Override
    public int getTrudnoscNawigacyjna() {
        return 2;
    }
}
