package jom.com.softserve.s5.task6;

import java.util.ArrayList;
import java.util.List;
import java.util.function.BiFunction;
import java.util.function.Predicate;

class MyUtils {
    public static int findMaxByCondition(List<Integer> numbers, Predicate<Integer> pr) {

        return numbers.stream()
                .filter(pr)
                .max(Integer::compareTo)
                .orElse(0);
    }
}

class User {
    public final List<Integer> values = new ArrayList<Integer>();

    int getFilterdValue(BiFunction<List<Integer>, Predicate<Integer>, Integer> findMaxByCondition, Predicate<Integer> predicate) {

        return findMaxByCondition.apply(values, predicate);
    }

    int getMaxValueByCondition(Predicate<Integer> predicate) {
        return getFilterdValue(MyUtils::findMaxByCondition, predicate);

    }
}