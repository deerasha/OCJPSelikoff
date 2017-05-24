/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chap02;

import java.util.function.Predicate;

/**
 * p. 53
 *
 * @author Deerasha
 */
public class Tiger implements Sprint {

    @Override
    public void sprint(Animal animal) {
        System.out.println("Animal is sprinting fast!" + animal.toString());
    }

}

//@FunctionalInterface   //interface with exactly one abstract method
interface Sprint {

    public void sprint(Animal animal);
}

class Animal {

    private String species;
    private boolean canHop;
    private boolean canSwim;

    public Animal(String speciesName, boolean hopper, boolean swimmer) {
        species = speciesName;
        canHop = hopper;
        canSwim = swimmer;
    }

    public boolean canHop() {
        return canHop;
    }

    public boolean canSwim() {
        return canSwim;
    }

    public String toString() {
        return species;
    }
}

@FunctionalInterface
interface CheckTrait {

    public boolean test(Animal a);
}

class FindMatchingAnimals {

//    private static void print(Animal animal, CheckTrait trait) {
//        if (trait.test(animal)) {
//            System.out.println(animal);
//        }
//    }
    private static void print(Animal animal, Predicate<Animal> trait) {
        if (trait.test(animal)) {
            System.out.println(animal);
        }
    }

    /**
     * a -> a.canHop() is the lambda
     * a is the animal instance
     * parameter  -> body
     * @param args 
     */
    public static void main(String[] args) {
        print(new Animal("fish", false, true), a -> a.canHop()); //doesn't print
        print(new Animal("kangaroo", true, false), a -> a.canHop()); //prints
        print(new Animal("kangaroo", true, false), (Animal a) -> {return a.canHop();}); //prints
        print(new Animal("kangaroo", true, false), a -> {return a.canHop();}); //prints
        print(new Animal("kangaroo", true, false), (a) -> {return a.canHop();}); //prints
//        print(new Animal("kangaroo", true, false), a -> {a.canHop();}); //syntax error- missing return type
//        print(new Animal("kangaroo", true, false), Animal a -> a.canHop()); //syntax error- needs brackets around parameter
        
        
    }
}
