package ru.javarush;

public class Kawasaki extends Motorbike{

    private int year;

    public Kawasaki(String name, String model, String color, double volume, int year) {
        super(name, model, color, volume);
        this.year = year;
    }

    public Kawasaki() {
        super();
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    @Override
    public String toString() {
        return "Kawasaki{" +
                "year=" + year +
                '}';
    }

    public void jump(){
        System.out.println("Kawasaki jump");
    }



    @Override
    public void drive() {
        super.drive();
        System.out.println("Kawasaki is driving");
    }


    @Override
    public void stop() {
        super.stop();
        System.out.println("Kawasaki has stopped");
    }
}
