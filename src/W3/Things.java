package W3;

import java.util.ArrayList;
import java.util.Comparator;

/**
 * Created by Stephen A. on 14/02/2017.
 */
public class Things {

    ArrayList<Integer> list1;
    ArrayList<Integer> list2;

    public boolean sameItems(ArrayList l1, ArrayList l2){
        l1.sort(Comparator.naturalOrder());
        l2.sort(Comparator.naturalOrder());

        for(int i = 0; i < l1.size();i++){
           return l1.contains(l2.get(i));
        }

        return false;
    }

}
