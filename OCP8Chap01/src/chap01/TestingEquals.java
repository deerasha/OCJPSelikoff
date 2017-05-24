/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chap01;

/**
 * p. 15-16
 *
 * @author Deerasha
 */
public class TestingEquals {
    public static void main(String[] args) {
        String s1 = "lion";
        String s2 = "lion";
        System.out.println(s1.equals(s2)); //true
        StringBuilder sb1 = new StringBuilder("lion");
        StringBuilder sb2 = new StringBuilder("lion");
        System.out.println(sb1.equals(sb2)); //false
        
//         x.equals(x); //true //reflexive
//         x.equals(y) && y.equals(x); //true //symmetric
//         x.equals(y) && y.equals(z) then x.equals(z); //true //transitive
//         x.equals(y); //always true or always false //consistent
//         x.equals(null) //false for any non-null not NullPointerException
        
    }
}
