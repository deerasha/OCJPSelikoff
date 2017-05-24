/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chap02;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Deerasha
 */
public class P120 {

    static class Bird {

    }

    static class Sparrow extends Bird {
    }
    
    public static void main(String[] args) {
//        List<? extends Bird> birds = new ArrayList<Bird>();
        List<? extends Bird> birds = new ArrayList<>();
//        birds.add(new Sparrow());
//        birds.add(new Bird());
        ArrayList<Sparrow> flock = new ArrayList<>();
        flock.add(new Sparrow());
//        flock.add(new Bird());
//        ArrayList<Bird> migration = new ArrayList<Sparrow>();
//        ArrayList<Bird> migration = new ArrayList<Bird>();
        ArrayList<Bird> migration = new ArrayList<>();
        migration.add(new Sparrow());
//       ArrayList<Sparrow> newestFlock = (ArrayList<Sparrow>)migration; //does not compile
//        ArrayList<Bird> flock2 = flock;
        
    }
}
