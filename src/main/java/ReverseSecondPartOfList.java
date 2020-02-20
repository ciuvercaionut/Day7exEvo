//13. Given a list of integers, print its second half in reversed order

import java.util.ArrayList;
import java.util.List;

public class ReverseSecondPartOfList {

    List<Integer> reverseSecondPard(List<Integer> list1){
        List<Integer> list2 = new ArrayList<Integer>();
        for (int i = list1.size() - 1; i >= list1.size() / 2; i--){
            list2.add(list1.get(i));
        }
        return list2;
    }
}
