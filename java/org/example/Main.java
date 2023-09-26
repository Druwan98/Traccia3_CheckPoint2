package org.example;

import java.util.HashMap;

public class Main {
    public static void main(String[] args) {

        Person person = new Person(100);
        Cutlery fork = new Cutlery(50); //levando il 50 di "sporcizia" la persona mangia la pasta.
        Cutlery knife = new Cutlery();
        Cutlery spoon = new Cutlery();

        HashMap<String, Food> menu = new HashMap<>();
        menu.put("first_course", new Pasta(25));
        menu.put("fruit", new Apple());
        menu.put("snack", new Cake());


        System.out.println("La persona ha " + person.getHunger() + " di fame.");

        try {
            person.eat(menu.get("first_course"), fork);
            System.out.println("Dopo aver mangiato la pasta ha " + person.getHunger() + " di fame.");
            person.eat(menu.get("fruit"), knife);
            menu.remove("fruit");
            person.eat(menu.get("snack"), spoon);
            menu.remove("snack");
        } catch (Exception e) {
            System.out.println("La posata è sporca, la persona non mangia.");
        }


    }
}
