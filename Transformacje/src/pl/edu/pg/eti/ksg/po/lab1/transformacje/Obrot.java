package pl.edu.pg.eti.ksg.po.lab1.transformacje;

public class Obrot implements Transformacja {
    private final double kat;
    public Obrot(double kat)
    {
        this.kat=kat;
    }
    public double getkat()
    {
        return kat;
    }
    @Override
    public Punkt transformuj(Punkt p)
    {
        double sinus = Math.sin(Math.toRadians(kat));
        double cosinus = Math.cos(Math.toRadians(kat));

        double xPrim = p.getX()*cosinus - p.getY()*sinus;
        double yPrim = p.getX()*sinus + p.getY()*cosinus;

        return new Punkt(xPrim, yPrim);
    }
    @Override
    public Transformacja getTransformacjaOdwrotna()
    {
        return new Obrot(-kat);
    }
    @Override
    public String toString()
    {
        return "Obrot o kat "+ kat;
    }
}
