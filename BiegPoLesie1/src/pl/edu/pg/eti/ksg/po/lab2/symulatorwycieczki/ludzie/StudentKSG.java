package pl.edu.pg.eti.ksg.po.lab2.symulatorwycieczki.ludzie;

import pl.edu.pg.eti.ksg.po.lab2.symulatorwycieczki.Atrakcja;
import pl.edu.pg.eti.ksg.po.lab2.symulatorwycieczki.Wedrowka;
import pl.edu.pg.eti.ksg.po.lab2.symulatorwycieczki.gory.PrzeprawaPrzezRzeke;

public class StudentKSG extends Student{

    public StudentKSG(String imie, String nazwisko, Plec plec) {
        super(imie, nazwisko, plec);
    }

    @Override
    public void reagujNaWedrowke(Wedrowka w, double czas) {
       if(w instanceof PrzeprawaPrzezRzeke){
            mow("Uuu! Przeprawa przez rzekę. Gdybym tylko miał podręczną sondę hydrologiczną, to mógłbym pomierzyć EC i pH do pracy magisterskiej.");
            aktualizujZmeczenie(czas);
       }
        else
        super.reagujNaWedrowke(w, czas);
    }
    @Override
    public void reagujNaAtrakcje(Atrakcja atrakcja, double czasTrwania)
    {
        mow("O tak, atrakcja: "+atrakcja.getNazwa());
        regeneruj(czasTrwania);
    }


}
