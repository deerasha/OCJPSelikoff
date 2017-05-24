/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chap01.mouse;

import chap01.cat.BigCat;

/**
 *
 * @author Deerasha
 */
public class Mouse {
    public static void main(String[] args) {
        BigCat cat = new BigCat(); //requires import
        System.out.println(cat.name);
        //System.out.println(cat.hasFur); //different package
        //System.out.println(cat.hasPaws); //
        //System.out.println(cat.id); //private
    }
}
