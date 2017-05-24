/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chap01;

/**
  p. 15 instead of Lion
 * @author Deerasha
 */
public class Capybara {
    private int idNumber;
    private int age;
    private String name;
    
    public Capybara(int idNumber, int age, String name){
        this.idNumber = idNumber;
        this.age = age;
        this.name = name;
    }
    
    @Override
    public boolean equals(Object obj){
        if (!(obj instanceof Capybara)) return false;
       Capybara other = (Capybara)obj ;
       return this.idNumber == other.idNumber;
//       return this.idNumber == ((Capybara)obj).idNumber; //should work the same way
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 11 * hash + this.idNumber;
        return hash;
    }
}
