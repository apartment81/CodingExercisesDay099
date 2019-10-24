package ro.mirodone;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

        GapInPrimes gapInPrimes = new GapInPrimes();

        System.out.println(Arrays.toString(gapInPrimes.gap(2, 0, 10)));
        System.out.println(Arrays.toString(gapInPrimes.gap(2, 2, 10)));
        System.out.println(Arrays.toString(gapInPrimes.gap(4, 0, 20)));
        System.out.println(Arrays.toString(gapInPrimes.gap(4, 100, 110)));
        System.out.println(Arrays.toString(gapInPrimes.gap(2, 3, 50)));

    }
}
