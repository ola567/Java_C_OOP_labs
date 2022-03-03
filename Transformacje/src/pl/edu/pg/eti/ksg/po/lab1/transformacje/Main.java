package pl.edu.pg.eti.ksg.po.lab1.transformacje;

import pl.edu.pg.eti.ksg.po.lab1.transformacje.Translacja;
import pl.edu.pg.eti.ksg.po.lab1.transformacje.Skalowanie;
import pl.edu.pg.eti.ksg.po.lab1.transformacje.BrakTransformacjiOdwrotnejException;
import pl.edu.pg.eti.ksg.po.lab1.transformacje.Punkt;
import pl.edu.pg.eti.ksg.po.lab1.transformacje.Transformacja;
import pl.edu.pg.eti.ksg.po.lab1.transformacje.Obrot;
import pl.edu.pg.eti.ksg.po.lab1.transformacje.ZlozenieTransformacji;

public class Main
{

    public static void main(String[] args)
    {
        Punkt p = new Punkt(5,6);
        System.out.println("Pobieranie punktu:");
        System.out.println(p.getX());
        System.out.println(p.getY());
        System.out.println("Drukowanie całego obiektu: ");
        System.out.println(p);

        Punkt p1 = new Punkt(5,6);
        System.out.println("Porównanie ref p==p");
        System.out.println(p==p);
        System.out.println("Porówannie ref p==p1");
        System.out.println(p==p1);
        System.out.println("Metoda p.equals(p)");
        System.out.println(p.equals(p));
        System.out.println("Metoda p.eguals(p1)");
        System.out.println(p.equals(p1));

        System.out.println("Metoda p.hashCode()");
        System.out.println(p.hashCode());
        System.out.println("Metoda p1.hashCode()");
        System.out.println(p1.hashCode());

        /*try {
            Punkt p1 = Punkt.E_X;
            System.out.println(p1);
            Transformacja tr = new Translacja(5, 6);
            System.out.println(tr);
            Punkt p2 = tr.transformuj(p1);
            System.out.println(p2);
            Transformacja trr = tr.getTransformacjaOdwrotna();
            System.out.println(trr);
            Punkt p3 = trr.transformuj(p2);
            System.out.println(p3);

        } catch (BrakTransformacjiOdwrotnejException ex)
        {
            ex.printStackTrace();
        }
        System.out.println();

        try
        {
            Punkt p1 = new Punkt(2, 2);
            System.out.println(p1);
            Transformacja tr2 = new Skalowanie(5, 4);
            System.out.println(tr2);
            Punkt p2 = tr2.transformuj(p1);
            System.out.println(p2);
            Transformacja trr2 = tr2.getTransformacjaOdwrotna();
            System.out.println(trr2);
            Punkt p3 = trr2.transformuj(p2);
            System.out.println(p3);
        }
        catch(BrakTransformacjiOdwrotnejException ex)
        {
            ex.printStackTrace();
        }
        System.out.println();
        try
        {
            Punkt p1 = new Punkt(2, 2);
            Transformacja tr2 = new Skalowanie(5, 0);
            System.out.println(tr2);
            System.out.println(p1);
            Punkt p2 = tr2.transformuj(p1);
            System.out.println(p2);
            Transformacja trr2 = tr2.getTransformacjaOdwrotna();
            System.out.println(trr2);
            Punkt p3 = trr2.transformuj(p2);
            System.out.println(p3);
        }
        catch(BrakTransformacjiOdwrotnejException ex)
        {
            ex.printStackTrace();
        }
        System.out.println();*/

        /*try
        {
            Punkt p1 = new Punkt(2,3);
            System.out.println(p1);
            Transformacja tr = new Obrot(80);
            System.out.println(tr);
            Punkt p2 = tr.transformuj(p1);
            System.out.println(p2);
            Transformacja trr = tr.getTransformacjaOdwrotna();
            System.out.println(trr);
            Punkt p3 = trr.transformuj(p2);
            System.out.println(p3);
        }
        catch (BrakTransformacjiOdwrotnejException ex)
        {
            ex.printStackTrace();
        }
        System.out.println();*/

        /*try
        {
            Punkt p4 = new Punkt(2,3);
            System.out.println("p4: " + p4);
            Transformacja[] tr4 = new Transformacja[] {
                    new Translacja(1,2), new Skalowanie(2,3)
            };
            Transformacja zr4=new ZlozenieTransformacji(tr4);
            System.out.println(zr4);
            Punkt p5 = zr4.transformuj(p4);
            System.out.println("p5: " + p5);
            Transformacja trr4= zr4.getTransformacjaOdwrotna();
            System.out.println(trr4);
            Punkt p6 = trr4.transformuj(p5);
            System.out.println("p6: " + p6);
        }
        catch (BrakTransformacjiOdwrotnejException ex)
        {
            ex.printStackTrace();
        }
        System.out.println();*/
    }
}
