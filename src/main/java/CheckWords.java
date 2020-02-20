//4.Given 2 words from the keyboard, print “Great” if they are the same, “Good” if they are the same but different case, “Okayish” if they are the same length and “Bad” if they do not meet any of the criteria

public class CheckWords {

    void checkWords(String s1, String s2){

        if(s1.equals(s2)){
            System.out.println("Great");
        }
        else if(s1.equalsIgnoreCase(s2)){
            System.out.println("Good");
        }else if(s1.length() == s2.length()){
            System.out.println("Okeysh");
        }
        else{
            System.out.println("Bad");
        }
    }
}
