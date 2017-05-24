package chap01;

/**
 * p. 7 instanceof
 *
 * @author Deerasha
 */
class HeavyAnimal {

}

class Hippo extends HeavyAnimal{}

class Elephant extends HeavyAnimal {

}

interface Mother {
}

class MotherHippo extends Hippo implements Mother {
}

class TestInstanceOf {

    void testingIt() {
        HeavyAnimal hippo = new Hippo();
        boolean b1 = hippo instanceof Hippo; //true
        boolean b2 = hippo instanceof HeavyAnimal; //true
        boolean b3 = hippo instanceof Elephant; //false

        boolean b4 = hippo instanceof Object; //true
        Hippo nullHippo = null;
        boolean b5 = nullHippo instanceof Object; //false
        //only time instanceof Object returns false is when testing a null

        Hippo anotherHippo = new Hippo();
//        boolean b6 = anotherHippo instanceof Elephant; //does not compile
        //compiler knows a Hippo is not sub/super of Elephant
        //when instanceof used against interface, can only check at runtime
        boolean b7 = hippo instanceof Mother; //compiles- cannot be checked by compiler
    }

    public static void main(String[] args) {

        Animal animal = new Tiger();
        animal.printName(); //prints ???
        Tiger tiger = new Tiger();
        tiger.printName(); //also prints ??? - field in Tiger not looked at!
        animal.careFor(); //toss in meat
        tiger.careFor(); //toss in meat
        ((Animal)animal).careFor();//toss in meat - why? still a tiger! superclass is abstract
        //what is super class was not abstract- which would be called then? still the override.
        //therefore, override is always the one called!
        //Animal anotherAnimal = new Animal(); //cannot be instantiated ofc
        Animal cow = new Cow();
        cow.careFor();//should be pet animal as no play has been defined in Cow
    }

    /**
     * Use of instanceof to determine correct subclass method Overriding
     * implementation would be a better way to code instanceof used most often
     * in libraries
     *
     * @param animal
     */
    public void feedAnimal(Animal animal) {
//        if (animal instanceof Cow) {
//            ((Cow) animal).addHay();
//        } else if (animal instanceof Tiger) {
//            ((Tiger) animal).addMeat();
//        } else if (animal instanceof Bird) {
//            ((Bird) animal).addSeed();
//        }else{
//            throw new RuntimeException("Unsupported animal");
//        }
       // animal.feed(); //virtual method invocation: jvm finds the right method to use
    }
}

//class Animal {
//}
//
//class Cow extends Animal {
//
//    void addHay() {
//    }
//}
//
//class Tiger extends Animal {
//
//    void addMeat() {
//    }
//}
//
//class Bird extends Animal {
//
//    void addSeed() {
//    }
//}
//abstract class Animal {
 class Animal {

    String name = "???";

    public void printName() {
        System.out.println(name);
    }

   // public abstract void feed();
   public void feed(){}
    
    public void careFor(){
        play();
    }
    public void play(){
        System.out.println("pet animal");
    }
}

class Cow extends Animal {

    @Override
    public void feed() {
        addHay();
    }

    private void addHay() {
    }
}

class Bird extends Animal {

    @Override
    public void feed() {
        addSeed();
    }

    private void addSeed() {
    }

}

class Tiger extends Animal {

    String name = "Tony"; //field hides Animal.name

    @Override
    public void feed() {
        addMeat();
    }

    private void addMeat() {

    }
    
    @Override
    public void play(){
        System.out.println("toss in meat");
    }
}
