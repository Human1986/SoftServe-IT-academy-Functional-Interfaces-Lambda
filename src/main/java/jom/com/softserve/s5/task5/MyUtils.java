package jom.com.softserve.s5.task5;

import java.util.Set;
import java.util.function.Predicate;

class MyUtils {

    public static Predicate<Integer> getPredicateFromSet(Set<Predicate<Integer>> predicates) {

        return predicates.stream().reduce(predicate -> true, Predicate::and);
    }
}
