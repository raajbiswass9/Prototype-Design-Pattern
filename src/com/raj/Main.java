package com.raj;
import java.util.Random;

public class Main {
    public static void main(String[] args) throws CloneNotSupportedException{
        Random rand = new Random();
        int randomId = rand.nextInt((4 - 0) + 1) + 0; //generate random number between 0 to 4

        Garrage ob1 = new Garrage();
        Garrage ob2 = (Garrage) ob1.clone();

        ob1.setGarageName("BMW");
        ob1.setCars();

        ob2.setGarageName("Audi");
        ob2.setCars();
        ob2.removeCars(randomId);

        System.out.println(ob1.getGarageName());
        System.out.println(ob1.getCars());

        System.out.println(ob2.getGarageName());
        System.out.println(ob2.getCars());
    }
}
