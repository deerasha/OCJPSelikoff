package chap01;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Deerasha
 */
public class BobcatKitten extends Bobcat{
    @Override
    public void findDen(){} //override
    public void findDen(boolean b){} //overload
    public int findden() throws Exception{return 0;} //neither override nor overload
    //overload = same method name
    //override = same method name AND parameter list (method signature)
}
