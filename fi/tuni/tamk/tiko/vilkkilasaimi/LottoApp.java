
package fi.tuni.tamk.tiko.vilkkilasaimi;

import java.util.function.ToIntBiFunction;

import javax.lang.model.element.ModuleElement.UsesDirective;

import fi.tuni.tamk.tiko.vilkkilasaimi.util.Myconsole;
import fi.tuni.tamk.tiko.vilkkilasaimi.util.Math;
import fi.tuni.tamk.tiko.vilkkilasaimi.util.Arrays;
import java.io.Console;
public class LottoApp {

    public static void main(String [] args) {
        Console c = System.console();

        int [] userLottoNumbers = new int[7];

        for (int i = 0; i < 7; i++) {
            int lottoNumber = Myconsole.readInt(1, 40, "Please give a real number", "Please give a unique number between ");
            while (Arrays.contains(lottoNumber, userLottoNumbers)) {
                System.out.println("Not a unique number");
                lottoNumber = Myconsole.readInt(1, 40, "Please give a real number", "Please give a unique number between ");
            }
            userLottoNumbers[i] = lottoNumber;
        }
        int [] lottoResults = new int[7];
        lottoResults = calculateLotto();

        int results = Arrays.containsSameValues(userLottoNumbers, lottoResults);
        int weeks = 1;
        int[] years = new int[7];

        for(int i=0; i<7; i++) {
            years[i] = Integer.MAX_VALUE;
        }
        while (results < 7) {
            if (results != 0 && years[results - 1] > weeks/52) {
                years[results - 1] = weeks/52;
            }
            weeks++;
            lottoResults = calculateLotto();
            results = Arrays.containsSameValues(userLottoNumbers, lottoResults);
        }
        years[6] = weeks/52;
        for (int i=0; i<7; i++) {
            int j = i + 1;
            System.out.println("got " + j + " right! Took " + years[i] + " years");
        }

    }

    private static int[] calculateLotto() {
    
    int [] LottoNumbers = new int[7];
        for (int i = 0; i < 7; i++) {
            int lottoNumber = Math.getRandom(1, 40);
            while (Arrays.contains(lottoNumber, LottoNumbers)) {
                lottoNumber = Math.getRandom(1, 40);
            }
            LottoNumbers[i] = lottoNumber;
        }
        return LottoNumbers;
    }
}


