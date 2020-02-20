//12.  Find the index of the highest and lowest elements in a list of integers and remove them

import java.util.List;

public class HighestAndLowestElements {

    void findHandLow(List<Integer> list){
        int highestIndex = 0;
        int lowestIndex = 0;
        int gretest = 0;
        int smallest = 0;

        for(int i = 0; i < list.size(); i++){
            if(list.get(i) > gretest){
                gretest = list.get(i);
                highestIndex = list.indexOf(gretest);
            }else if(list.get(i) < smallest){
                smallest = list.get(i);
                lowestIndex = list.indexOf(smallest);
            }

        }
        list.remove(highestIndex);
        list.remove(lowestIndex);
    }
}
