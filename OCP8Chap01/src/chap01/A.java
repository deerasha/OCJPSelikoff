/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chap01;

/**
 * p. 26
 * @author Deerasha
 */
public class A {
    private int x =10;
    class B{
        private int x =20;
        class C{
            private int x = 30;
            public void allTheX(){
                System.out.println(x); //30
                System.out.println(this.x); //30
                System.out.println(B.this.x); //20
                System.out.println(A.this.x); //10
            }
        }
    }
    
    public static void main(String[] args) {
        A a = new A();
        A.B b = a.new B();
//        B b = a.new B(); //alt
        A.B.C c = b.new C();
//        B.C c = b.new C(); //alt
//        C c = b.new C(); //does not compile- C not found
        c.allTheX();
    }
}

class CaseOfThePrivateInterface{
    private interface Secret{
        public void shh();
//        void shh(); //alt- all methods of interface are public
    }
    class DontTell implements Secret{

        @Override
        public void shh() { //must be public
        }
        
    }
}
