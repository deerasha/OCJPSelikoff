/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chap01;

/**
 * p.25
 *
 * @author Deerasha
 */
public class Outer {

    private String greeting = "Hi";

    protected class Inner {

        public int repeat = 3;

        public void go() {
            for (int i = 0; i < repeat; i++) {
                System.out.println(greeting);
            }
        }
    }

    public void callInner() {
        Inner inner = new Inner();
        inner.go();

    }

    private int length = 5; //"effectively final"- introduced in Java 8

    public void calculate() {
        final int width = 20;
        class Inner2 {

            public void multiply() {
//                System.out.println(length * width);
            }
        }
        Inner2 inner2 = new Inner2();
        inner2.multiply();
    }

    /**
     * which variables are effectively final?
     */
    public void isItFinal() {
        int one = 20;
//        final int one = 20;
        int two = one;
        two++;
        int three;
//        final int three;
//        if (one ==4) three =3;
//        else three = 4;
        three = one == 4 ? 3 : 4;
        int four = 4;
        class Inner {
//        int test = one + two + three + four; //does not compile
        int test2 = one + three; //on 7 still does not compile- on 8 - FAA DAA! makes them effectively final
        
        }
        four = 5;
    }

    public static void main(String[] args) {
        Outer outer = new Outer();
//        outer.callInner();
        Inner inner = outer.new Inner(); //calling new as if it's a method
        inner.go();
        outer.calculate();
    }
}
