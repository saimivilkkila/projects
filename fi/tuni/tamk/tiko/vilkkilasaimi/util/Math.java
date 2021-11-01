package fi.tuni.tamk.tiko.vilkkilasaimi.util;

public class Math {
    public static int getRandom(int min, int max) {
        return min + (int) (java.lang.Math.random() * ((max - min) + 1));
    }
}