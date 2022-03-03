package pl.edu.pg.eti.ksg.po.lab2;

import java.util.HashSet;
import java.util.Set;

import pl.edu.pg.eti.ksg.po.lab2.symulatorwycieczki.*;
import pl.edu.pg.eti.ksg.po.lab2.symulatorwycieczki.gory.*;
import pl.edu.pg.eti.ksg.po.lab2.symulatorwycieczki.gory.beskidy.DrewnianaCerkiew;
import pl.edu.pg.eti.ksg.po.lab2.symulatorwycieczki.gory.sudety.ObserwatoriumMeterologiczne;
import pl.edu.pg.eti.ksg.po.lab2.symulatorwycieczki.gory.sudety.Panorama;
import pl.edu.pg.eti.ksg.po.lab2.symulatorwycieczki.gory.sudety.Przepasc;
import pl.edu.pg.eti.ksg.po.lab2.symulatorwycieczki.ludzie.Czlowiek;
import pl.edu.pg.eti.ksg.po.lab2.symulatorwycieczki.ludzie.PrzewodnikStudencki;
import pl.edu.pg.eti.ksg.po.lab2.symulatorwycieczki.ludzie.Student;
import pl.edu.pg.eti.ksg.po.lab2.symulatorwycieczki.ludzie.StudentKSG;

public class JavaLab2 {
    public static void main(String[] args) {
//        Wycieczka w = doDydiowki();
//
//        PrzewodnikStudencki przewodnik = new PrzewodnikStudencki("Stefan", "Długonogi", Czlowiek.Plec.MEZCZYZNA);
//        Set<Uczestnik> uczestnicy = new HashSet<>();
//        uczestnicy.add(new Student("Alojzy", "Mechanik", Czlowiek.Plec.MEZCZYZNA));
//        uczestnicy.add(new Student("Ada", "Lovelace", Czlowiek.Plec.KOBIETA));
//        uczestnicy.add(new Student("Jan", "Elektronik", Czlowiek.Plec.MEZCZYZNA));
//        uczestnicy.add(new StudentKSG("Piotr","Teledetekcyjny", Czlowiek.Plec.MEZCZYZNA));
//
//        Grupa g = new Grupa(przewodnik, uczestnicy);
//
//        SymulatorWycieczki symulator = new SymulatorWycieczki(g, w);
//
//        symulator.symuluj();

        Wycieczka w1=wSudety();

        PrzewodnikStudencki przewodnik=new PrzewodnikStudencki("Marek", "Kowalski", Czlowiek.Plec.MEZCZYZNA);
        Set<Uczestnik> uczestnicy=new HashSet<>();
        uczestnicy.add(new Student("Kasia", "Nowak", Czlowiek.Plec.KOBIETA));
        uczestnicy.add(new Student("Maciek", "Majewski", Czlowiek.Plec.MEZCZYZNA));
        uczestnicy.add(new StudentKSG("Kuba", "Mickiewicz", Czlowiek.Plec.MEZCZYZNA));

        Grupa g=new Grupa(przewodnik, uczestnicy);
        SymulatorWycieczki symulator=new SymulatorWycieczki(g,w1);
        Set<SluchaczPostepow> sluchaczPostepow=new HashSet<>();
        symulator.symuluj();
    }

    public static Wycieczka doDydiowki() {
        Wycieczka ret = new Wycieczka("Do Dydiówki");
        ret.dodajElementWycieczki(new Droga(1.0));
        ret.dodajElementWycieczki(new DrewnianaCerkiew("Smolnik"));
        ret.dodajElementWycieczki(new Droga(4.0));
//        ret.dodajElementWycieczki(new PrzeprawaPrzezRzeke(1.0));
//        ret.dodajElementWycieczki(new GestyLas(2.0));
        ret.dodajElementWycieczki(new Las(2.0));
        ret.dodajElementWycieczki(new Droga(5.0));

        return ret;
    }

    public static Wycieczka wSudety() {

        Wycieczka ret=new Wycieczka("W Sudety");
        ret.dodajElementWycieczki(new Droga(2.0));
        ret.dodajElementWycieczki(new Las(3.0));
        ret.dodajElementWycieczki(new Droga(2.0));
        ret.dodajElementWycieczki(new ObserwatoriumMeterologiczne("Wysokogórskie Obserwatorium Meterologiczne"));
        ret.dodajElementWycieczki(new Gran(2.0));
        ret.dodajElementWycieczki(new Przepasc("Macocha"));
        ret.dodajElementWycieczki(new Zbocze(3.0));
        ret.dodajElementWycieczki(new GestyLas(0.5));
        ret.dodajElementWycieczki(new Las(0.5));
        ret.dodajElementWycieczki(new Droga(3.0));

        return ret;
    }
}
