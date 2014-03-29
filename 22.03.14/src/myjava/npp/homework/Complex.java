package myjava.npp.homework;

import java.util.Map;

/**
 * Created by okashinR on 29/03/14.
 */
public class Complex implements TrigonometricForm, ComplexActions, ComplexMath {

    private double a;
    private double b;
    private static final double def_val = 0;
public void set_a(int a)
{
    this.a = a;

}

    public void set_b(int b)
    {
        this.b = b;
    }

    public double get_a()
    {
        return a;
    }

    public double get_b()
    {
        return b;
    }

public Complex(double a, double b)
{
    this.a = a;
    this.b = b;
}
    public Complex()
    {
       a = def_val;
       b = def_val;

    }



   public String ToString()
   {
       String result = a + "+i*"+b;
       return result;
   }

    public boolean Equals(Complex c1, Complex c2)
    {
      return((c1.a == c2.a)&&(c1.b == c2.b));
    }



public double getModule()
{
    return (Math.sqrt(a*a+b*b));
}

 public double getArg()
 {
     return(Math.atan(b/a));

 }


public void conjugate(){
    b=-b;
}

    public void sum(Complex complex)
    {
        a+=complex.a;
        b+=complex.b;
    }

    public void difference(Complex complex)
    {
        a-=complex.a;
        b-=complex.b;
    }

    public void productOnNumber(double num)
    {
        a*=num;
        b*=num;

    }

}

