/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chap01;

//import java.util.Objects; //for NetBeans auto hash

/**
 * p. 18
 * result of hashCode() must not change within the same program
 * if equals returns true then hashCode must return the same hashCode
 * hashCode does not need to be unique on unequal objects
 * @author Deerasha
 */
public class Card {

    private String rank;
    private String suit;

    public Card(String r, String s) {
        if (r == null || s == null) {
            throw new IllegalArgumentException();
        }
        rank = r;
        suit = s;
    }

    @Override
    public boolean equals(Object obj) {
        if (!(obj instanceof Card)) {
            return false;
        }
        Card c = (Card) obj;
        return rank.equals(c.rank) && suit.equals(c.suit);
    }

    @Override
    public int hashCode() {//autogen multiplies by primes
//        int hash = 7;
//        hash = 53 * hash + Objects.hashCode(this.rank);
//        hash = 53 * hash + Objects.hashCode(this.suit);
//        return hash;
        return rank.hashCode();
    }
}
