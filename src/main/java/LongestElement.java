//11. Find the index of the longest element in a 1D String array.

public class LongestElement {

    void getLongestElement(String[] arr) {
        int maxLength = 0;
        String longest = "";
        for (int i = 0; i < arr.length; i++) {
            if(arr[i].length() > maxLength){
                maxLength = arr[i].length();
                longest = arr[i];
                }
            }
        System.out.println(longest);
    }
}
