package chap01;

/**
 *
 * @author Deerasha p. 5 what line added to abstract makes the code compile
 *
 */
abstract class Cat {
   //abstract void clean(); //alternative 1: must be overridden in subclass
    //void clean(){} //alternative 2: default implementation
    //alternative 3: don't include clean in this class at all
    //void clean() throws RuntimeException{}
    //abstract void clean() throws RuntimeException; //"many" other alternatives

   //p. 6 to which lines could you independently add static and/or final without introducing error?
    //String name ="The Cat";
//   void clean(){}
   //static String name ="The Cat"; //ok
    //static final String name ="The Cat"; //ok
    //final String name ="The Cat"; //ok
//   static void clean(){} //breaks Lion
//   final void clean(){} //breaks Lion
    //static final void clean(){} //breaks Lion

}

class Lion extends Cat {

    void clean() {}
//    static void clean() {} //ok if added to superclass too, but the no inheritance
    //final void clean(){} //ok
}
