package fi.tuni.tamk.tiko.vilkkilasaimi.util;

public class Arrays {
    public static int [] toIntArray(String [] array) {
        int size = array.length;
        int [] arr = new int [size];
        for (int i=0; i<size; i++) {
            arr[i] = Integer.parseInt(array[i]);
        }
        return arr;
    }

    public static int containsSameValues(int [] array1, int [] array2) { 

        int sameValues = 0;

        for (int i=0; i < array1.length; i++) {
            for (int j=0; j < array2.length; j++) {
                if (array1[i] == array2[j]) {
                    sameValues++;
                }
            }
        }

        return sameValues;
    }

    public static boolean contains (int value, int [] array) {

        boolean inArray = false;
        for (int i=0; i<array.length; i++) {
            if (array[i] == value) {
                inArray = true;
                break;
            } else {
                inArray = false;
            }
        } return inArray;
    }
}
