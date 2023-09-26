package org.example;

public class Apple implements Food {
    @Override
    public int getSatiety() {
        return 30;
    }

    @Override
    public int getGreasiness(int dirtiness) {
        return 20;
    }
}
