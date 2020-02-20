//14.Given a list of String, remove the elements starting with a vow

import java.util.List;

public class RemoveVowElems {

    List<String> removeElemWithVoW(List<String> list){
        for(int i = 0; i < list.size(); i++){
            if(list.get(i).startsWith("a") || list.get(i).startsWith("e") ||list.get(i).startsWith("i") || list.get(i).startsWith("o") || list.get(i).startsWith("u") ||
                list.get(i).startsWith("A") || list.get(i).startsWith("E") ||list.get(i).startsWith("I") || list.get(i).startsWith("O") || list.get(i).startsWith("U"))
                {
                     list.remove(i);
             }

        }
        return list;
    }
}
