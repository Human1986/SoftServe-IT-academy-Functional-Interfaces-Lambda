package jom.com.softserve.s5.task3;

import java.util.ArrayList;
import java.util.List;
import java.util.function.BinaryOperator;

public class App {

    public static final BinaryOperator<String> greetingOperator = (p1, p2) ->
            "Hello " + p1 + " " + p2 + "!!!";

    public static List<String> createGreetings(List<Person> people, BinaryOperator<String> binaryOperator) {
        List<String> greatingList = new ArrayList<>();
        for (Person person : people) {
            String great = binaryOperator.apply(person.name, person.surname);
            greatingList.add(great);
        }
        return greatingList;
    }
}
