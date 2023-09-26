package org.example;

public class Person {
    private int hunger;

    public Person(int hunger) {
        this.hunger = hunger;
    }

    public int getHunger() {
        return hunger;
    }

//    public void setHunger(int hunger) {
//        this.hunger = hunger;
//    }

    public void eat(Food food, Cutlery cutlery) throws Exception {
        if (cutlery.getDirtiness() > 0) {
            throw new Exception("Posate sporche, che schifo!");
        }

        if (hunger < 0) {
            hunger = 0;
        }
        hunger -= food.getSatiety();
        cutlery.onUse(food);
    }


}
