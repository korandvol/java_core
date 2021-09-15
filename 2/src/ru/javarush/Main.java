package ru.javarush;

public class Main {

    public static void main(String[] args) {

       Kawasaki kawasaki = new Kawasaki("Kawasaki", "super model", "white", 5.5, 2000);
        kawasaki.jump();
        kawasaki.drive();

        Ural ural = new Ural("Ural", "new model", "red", 5.7, true);
        ural.showinfo();
    }
}
