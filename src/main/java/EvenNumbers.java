//5.Print the first 100 even numbers

public class EvenNumbers {

    void printFirstHundredEvenNumbers(int target){
        int counter = 0;
        int sum = 0;
        for(int i = 0; counter <= target;i++){
            if(i % 2 == 0){
                System.out.println(i);
                counter++;
                sum = sum + i;

            }
        }
        System.out.println(sum);
    }
}
