//15. Given a list of String, sort it by the length of each element.

import java.util.Comparator;
import java.util.List;

public class SortListByLengthOfElem implements Comparator<String>{

    public int compare(String o1, String o2) {
        return o1.length() - o2.length();
    }
}
