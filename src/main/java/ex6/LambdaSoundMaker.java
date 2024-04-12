package ex6;

import java.util.function.Function;
import java.util.function.Supplier;

public class LambdaSoundMaker {
    public static void main(String[] args) {
        Cat cat = new Cat();
        Dog dog = new Dog();
        Supplier<String> catSound = () -> cat.getSound();
        Supplier<String> dogSound = () -> dog.getSound();

        makeSound(catSound);
        makeSound(dogSound);
    }

    static void makeSound(Supplier<String> animal){
        System.out.println(animal.get());
    }
}
