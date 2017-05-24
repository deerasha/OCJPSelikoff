/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chap01;

import java.util.ArrayList;

/**
 * p. 13
 * @author Deerasha
 */
public class TestingToString {
    public static void main(String[] args) {
        System.out.println(new ArrayList()); //human readable
        System.out.println(new String[0]); //array instance in printstream prints reference
    }
}
