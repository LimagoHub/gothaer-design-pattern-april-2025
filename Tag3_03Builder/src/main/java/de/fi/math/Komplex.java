package de.fi.math;

public class Komplex {

    private Komplex(double real, double imaginary) {
    }

    public static Komplex fromKoord(double real, double imaginary){
        return new Komplex(real, imaginary);
    }
    public static Komplex fromPolar(double betrag, double winkel){
        return new Komplex(betrag, winkel);
    }


}
