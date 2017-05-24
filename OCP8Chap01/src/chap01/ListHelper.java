package chap01;

/**
 * p. 6 how many different ways to write imports that will make this code
 * compile?
 *
 * @author Deerasha
 */

//alternative 1 for List<E> and ArrayList<E>
//import java.util.List;
//import java.util.ArrayList;

//alternative 2 for List<E> and ArrayList<E>
import java.util.*;



//alternative 1 for sort
//import static java.util.Collections.*;

//doesn't make sort compile
//import java.util.Collections.*;

//alternative 2 for sort
import static java.util.Collections.sort;

//doesn't make sort compile- doesn't compile itself
//import java.util.Collections.sort;

/*
TODO: investigate STATIC imports
*/

public class ListHelper {

    public List<String> copyAndSortList(List<String> original) {
        List<String> list = new ArrayList<String>(original);
        sort(list); //sort is a static method in java.util.Collections
        return list;
    }
}
