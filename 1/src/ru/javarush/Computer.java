package ru.javarush;

public class Computer {
   private String name;

    public Computer(String name) {
        this.name = name;
    }

    public Computer() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void on(){
        System.out.println(name + " on");
    }

    public void off(){
        System.out.println(name + " off");
    }
}
