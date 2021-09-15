package ru.javarush;

import java.util.Arrays;

public class Ural extends Motorbike {

    private boolean firstAidKit;

    public Ural() {
    }

    public Ural(String name, String model, String color, double volume, boolean firstAidKit) {
        super(name, model, color, volume);
        this.firstAidKit = firstAidKit;
    }

    public boolean isFirstAidKit() {
        return firstAidKit;
    }

    public void setFirstAidKit(boolean firstAidKit) {
        this.firstAidKit = firstAidKit;
    }

    public void showinfo(){
        System.out.println("name - "+getName());
        System.out.println("volume - " +getVolume());
        System.out.println("aid - "+isFirstAidKit());


    }
}
