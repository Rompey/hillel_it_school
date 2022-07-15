package homework_5.cats;


import homework_5.cats.Cat;
import homework_5.cats.CatService;
import homework_5.cats.CatServiceImpl;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        CatService catService = new CatServiceImpl();
        List<Cat> catList = new ArrayList<>();
        catList.add(new Cat("Donetsk"));
        catList.add(new Cat("Dnipro"));
        catList.add(new Cat("Kherson"));
        catList.add(new Cat("Kiev"));
        catList.add(new Cat("Lviv"));
        for (Cat cat : catService.eat(catList)) {
            System.out.println(cat.getAddress());
        }
    }
}
