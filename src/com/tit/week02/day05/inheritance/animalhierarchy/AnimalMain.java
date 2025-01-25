package com.tit.week02.day05.inheritance.animalhierarchy;

public class AnimalMain {
    public static void main(String[] args) {
        Dog dog1 = new Dog();
        Cat cat1 = new Cat();
        Bird bird1 = new Bird();
        dog1.name = "Damru";
        dog1.age = 2;
        dog1.makeSound();

        cat1.name = "Coco";
        cat1.age = 1;
        cat1.makeSound();

        bird1.name = "Jack Sparrow";
        bird1.age = 2;
        bird1.makeSound();
    }
}
