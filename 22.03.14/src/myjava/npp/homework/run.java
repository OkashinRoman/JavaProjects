package myjava.npp.homework;

import java.awt.*;

/**
 * Created by okashinR on 29/03/14.
 */
public class run {

    public static void main(String args[])
    {
        Complex c= new Complex(2,3);
        String q = c.ToString();
        double b = c.getModule();
        System.out.println(q);

    }

}
