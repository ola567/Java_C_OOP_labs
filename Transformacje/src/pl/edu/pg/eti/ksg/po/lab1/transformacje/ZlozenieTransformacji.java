package pl.edu.pg.eti.ksg.po.lab1.transformacje;

public class ZlozenieTransformacji implements Transformacja
{
    private Transformacja[] tab;
    public ZlozenieTransformacji(Transformacja[] tab)
    {
        this.tab=tab;
    }
    @Override
    public ZlozenieTransformacji getTransformacjaOdwrotna() throws BrakTransformacjiOdwrotnejException
    {
        Transformacja[] odwrotnaTransformacja = new Transformacja[tab.length];
        for (int i = tab.length - 1; i >= 0; i--)
        {
            odwrotnaTransformacja[tab.length-1-i]=tab[i].getTransformacjaOdwrotna();
        }
        return new ZlozenieTransformacji(odwrotnaTransformacja);
    }
    @Override
    public Punkt transformuj(Punkt p)
    {
        Punkt[] punkty = new Punkt[tab.length];
        for (int i=0; i<tab.length; i++)
        {
            if (i==0){
                punkty[0]=tab[i].transformuj(p);
            }else
                {
                punkty[i]=tab[i].transformuj(punkty[i-1]);
            }
        }
        return punkty[punkty.length-1];
    }
    @Override
    public String toString()
    {
        String transformacje="Złożenie " + tab.length + " transformacji: ";
        for (int i=0; i<tab.length; i++)
        {
            transformacje = transformacje + tab[i] + " ";
        }
        return transformacje;
    }
}
