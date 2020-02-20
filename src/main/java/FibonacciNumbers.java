//8.Generate the first 20 Fibonacci numbers

public class FibonacciNumbers {

    void generateFibonacci(int target){

        int t1 = 0, t2 = 1, t3;

        System.out.println("1 : " + t1);
        System.out.println("2 : " + t2);
        for(int i = 2; i < target; i++){
            t3 = t1 + t2;
            System.out.println(i+1 + " : "  + t3);
            t1 = t2;
            t2 = t3;
        }
    }


}
