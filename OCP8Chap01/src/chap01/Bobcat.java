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
public class Bobcat {
    public void findDen(){}
}

class BobcatMother extends Bobcat{
    @Override
    public void findDen(){}
    
//     @Override public void findDen(boolean b){} //does not compile
}


