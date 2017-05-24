/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chap01.cat.species;

import chap01.cat.BigCat;

/**
 *
 * @author Deerasha
 */
public class Lynx extends BigCat {//requires import to be extended

    public static void main(String[] args) {
        BigCat cat = new BigCat();
        System.out.println(cat.name);
        //System.out.println(cat.hasFur); //not in same package, so cannot be accessed as variable
        //System.out.println(cat.hasPaws); //hasPaws is not public- cannot be accessed outside package
        //System.out.println(cat.id); //is private cannot be accessed
        Lynx lynx = new Lynx();
        System.out.println(lynx.hasFur); //allowed as protected
    }
}
