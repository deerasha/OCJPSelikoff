/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chap01;

/**
 * p.29
 *
 * @author Deerasha
 */
public class AnonInner {

//    abstract class SaleTodayOnly {
//
//        abstract int dollarsOff();
//
//    }
    interface SaleTodayOnly {

        int dollarsOff();

    }

    public int admission(int basePrice) {
        SaleTodayOnly sale = new SaleTodayOnly() { //extends (absrtact) SaleTodayOnly or implements interface SaleTodayOnly
            @Override
            public int dollarsOff() {
                return 3;
            }
        };
        return basePrice - sale.dollarsOff();
    }

    public int admission(int basePrice, SaleTodayOnly sale) {
        return basePrice - sale.dollarsOff();
    }

    public int pay() {
        return admission(5, new SaleTodayOnly() {
            public int dollarsOff() {
                return 3;
            }
        });
    }
    
    void TestingNested(){
        Enclosing en = new Enclosing();
//        Enclosing.Nested.price //cannot be accessed- private
        Enclosing.Nested enNe =  new Enclosing.Nested(); //allowed- static means en not needed
    }
}

class Enclosing {

    static class Nested {

        private int price = 6;
    }

    public static void main(String[] args) {
        Nested nested = new Nested();
        System.out.println(nested.price);
//        Nested.price //not allowed
    }
}
