/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chap01;

/**
 * p. 14
 * @author Deerasha
 */
public class Hippopotamus {

    private String name;
    private double weight;

    public Hippopotamus(String name, double weight) {
        this.name = name;
        this.weight = weight;
    }
    
    @Override
    public String toString(){
        return "Name: " + name + ", Weight: "+weight;
    }
    
    public static void main(String[] args) {
        Hippopotamus h1 = new Hippopotamus("Harry", 3100);
        System.out.println(h1);  //prints Harry's details
    }
}
