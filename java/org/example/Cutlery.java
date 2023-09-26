package org.example;

public class Cutlery {
    private int dirtiness; //sporcizia

    public Cutlery() {
        this.dirtiness = 0;
    }

    public Cutlery(int dirtiness) {
        this.dirtiness = dirtiness;
    }

    public int getDirtiness() {
        return dirtiness;
    }

    public void setDirtiness(int dirtiness) {
        this.dirtiness = dirtiness;
    }

    public void onUse(Food food) {
        dirtiness += getDirtiness();
    }


}
