//2. Given one character, print it if it is an upper case letter, otherwise print an error message
public class UpperCaseChar {

    void printIfUppercaseChar(char character){
        if(Character.isUpperCase(character)){
            System.out.println(character);
        }else {
            System.out.println("Error message: this is not an uppercase char");
        }
    }
}
