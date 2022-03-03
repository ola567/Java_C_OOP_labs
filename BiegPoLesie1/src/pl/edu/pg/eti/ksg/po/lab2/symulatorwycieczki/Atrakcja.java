package pl.edu.pg.eti.ksg.po.lab2.symulatorwycieczki;

public abstract class Atrakcja implements ElementWycieczki{

    private double czasTrwania;
    private String nazwa;

    public Atrakcja(int czasTrwania)
    {
        this.czasTrwania = czasTrwania;
    }

    public Atrakcja(String nazwa)
    {
        this.nazwa=nazwa;
    }

    public double getCzasTrwania() {
        return czasTrwania;
    }

    public double getWymaganyCzas()
    {
        return czasTrwania;
    };

//    public String getMiejscowosc()
//    {
//        return miejscowosc;
//    };
}
