package jom.com.softserve.s5.task4;

import java.util.ArrayList;
import java.util.List;

@FunctionalInterface
interface DecisionMethod {
    boolean decide(String name, int discount);
}

class Person {
    String name;
    DecisionMethod goShopping = (pName, discount) -> pName.equals("product1") && discount > 10;

    Person(String name) {
        this.name = name;
    }
}

class Shop {
    public List<DecisionMethod> clients = new ArrayList<>();

    public int sale(String product, int percent) {
        int countOfPeople = 0;
        for (DecisionMethod client : clients) {
            boolean decide = client.decide(product, percent);
            if (decide) countOfPeople++;
        }
        return countOfPeople;
    }
}