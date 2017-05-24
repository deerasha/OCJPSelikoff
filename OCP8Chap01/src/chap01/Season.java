/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chap01;

/**
 * p. 20
 *
 * @author Deerasha
 */
public enum Season {

//    WINTER, SPRING, SUMMER, AUTUMN // ; is optional if this is all of enum
//    WINTER("low"), SPRING("Medium"), SUMMER("High"), AUTUMN("Medium"); //note the ;
    WINTER("low") {
        @Override
        public void printHours() {
            System.out.println("9am-3pm");
        }
    }, SPRING("Medium") 
//        {
        //@Override
//        public void printHours() {
//            System.out.println("9am-5pm");
//        }
//    }
, SUMMER("High") {

        @Override
        public void printHours() {
            System.out.println("9am-7pm");
        }
    }, AUTUMN("Medium") 
//        {
//
//        @Override
//        public void printHours() {
//            System.out.println("9am-5pm");
//        }
//    }
        ; //note the ;

//    public abstract void printHours(); //to be implemented for every value
    public void printHours(){System.out.println("default hours");} //or just override on the special cases
    private String expectedVistors;

    //constructor is a must when there are states
    private Season(String expectedVisitors) { //cannot be public
        this.expectedVistors = expectedVisitors;
        System.out.println("called"); //shows that constructor is called once per enum value
    }

    public void printExpectedVisitors() {
        System.out.println(expectedVistors);
    }
}
//enum ExtendedSeason extends Season{} //does not compile

class TestEnum {

    public static void main(String[] args) {
        Season s = Season.SUMMER;
        System.out.println(Season.SUMMER); //SUMMER
        System.out.println(s == Season.SUMMER); //true

        for (Season season : Season.values()) {
            System.out.println(season.name() + " " + season.ordinal());
        }

//        if (Season.SUMMER == 2 //does not compile
        Season s1 = Season.valueOf("SUMMER");
//        Season s2 = Season.valueOf("summer"); //throws IllegalArgumentException

        Season summer = Season.SUMMER;
        switch (summer) { //enum type is implied 
//            case Season.AUTUMN //does not compile
//            case 0:  //does not compile enum != int
            case WINTER:
                System.out.println("Brrr");
                break;
            case SUMMER:
                System.out.println("Aircon");
                break;
            default:
                System.out.println("Ahhh");
                break;
        }

        Season.SUMMER.printExpectedVisitors();

    }
}

enum OnlyOne {

    ONCE(true);

    private OnlyOne(boolean b) {
        System.out.println("constructing");
    }

    public static void main(String[] args) {
        OnlyOne firstCall = OnlyOne.ONCE; //prints
        OnlyOne secondCall = OnlyOne.ONCE;//doesn't print- contsructor is only called one time for program

    }
}
