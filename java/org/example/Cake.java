package org.example;

public class Cake implements Food {

    @Override
    public int getSatiety() {
        return 30;
    }

    @Override
    public int getGreasiness(int dirtiness) {
        return 80;
    }
}
