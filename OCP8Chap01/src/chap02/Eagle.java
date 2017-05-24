/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chap02;

/**
 * p.49
 *
 * @author Deerasha
 */
interface Fly {

    int getWingSpan() throws Exception;
    static final int MAX_SPEED = 100;

    default void land() {
        System.out.println("Animal is landing");
    }

    static double calculateSpeed(float distance, double time) {
        return distance / time;
    }
}

public class Eagle implements Fly {

    @Override
//    public int getWingSpan() throws Exception {
    public int getWingSpan() { //does not need to declare throw clause
        return 15;
    }

    @Override
    public void land() {
//    void land(){ //needs the public! can't be less accessible than superclass (interface- all members public)
        System.out.println("Eagle is diving fast");
    }
}

interface Walk {

    boolean isQuadruped();

    double getMaxSpeed(); //automatically public abstract if not static/default
}

interface Run extends Walk {

    abstract boolean canHuntWhileRunning();

//    @Override
//    abstract double getMaxSpeed(); does not need to be redeclared, but may be dupplicated
////- must be implemented by subclasses
}

class Lion implements Run {

    @Override //from Run
    public boolean canHuntWhileRunning() {
        return true;
    }

    @Override //(from Run?) from Walk
    public double getMaxSpeed() {
        return 100;
    }

    @Override //from Walk
    public boolean isQuadruped() {
        return true;
    }

}

//interface Sleep extends Lion{} //does not compile: interface cannot extend class

//class Tiger extends Walk{} //does not compile: class cannot extend interface, only implement


