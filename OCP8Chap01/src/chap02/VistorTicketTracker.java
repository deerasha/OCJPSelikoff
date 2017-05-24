/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chap02;

/**
 * p. 79 - lazy instantiation of Singleton
 *
 * @author Deerasha
 */
public class VistorTicketTracker {

    private static VistorTicketTracker instance; //cannot be final

    private VistorTicketTracker() {

    }

//    public static VistorTicketTracker getInstance() {
//        if (instance == null) {
//            instance = new VistorTicketTracker(); //not thread safe
//        }
//        return instance;
//    }
    public static synchronized VistorTicketTracker getInstance() {
        if (instance == null) {
            instance = new VistorTicketTracker(); //thread safe
        }
        return instance;
    }
}
