package jom.com.softserve.s5.task1;

import java.util.function.Predicate;

public class MyUtils {
    public static int getCount(int[] array, Predicate<Integer> predicate) {
        int count = 0;
        boolean testedElement;

        for (int element : array) {
            testedElement = predicate.test(element);
            if (testedElement) count++;
        }
        return count;
    }
}