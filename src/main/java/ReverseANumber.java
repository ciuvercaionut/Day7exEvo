//6.Print the reverse of a given number (123 → 321)

public class ReverseANumber {

   void  reverseNumber(int number){

        int reversed = 0,remainder, initial = number;
        while(number != 0){
            remainder = number % 10;
            number = number / 10;
            reversed = reversed * 10 + remainder;
        }
       System.out.println(reversed);
    }
}
