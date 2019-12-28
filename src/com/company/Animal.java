package com.company;

public class Animal {


    public Animal() {
    }

    public Animal(int age) {
        System.out.println("Animal");
    }

    class Horse extends Animal {
        public Horse() {
            System.out.println("Horse");
        }
    }


    public static void main(String[] args) {
      new Animal(5);
    }
}
