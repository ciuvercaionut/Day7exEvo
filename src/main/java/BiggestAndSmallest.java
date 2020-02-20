//1.Given 3 numbers, print the biggest and the smallest



public class BiggestAndSmallest {

    public static int largest(int firstInput, int secondInput, int thirdInput) {
        int max = firstInput;
        if (secondInput > max) {
            max = secondInput;
        }

        if (thirdInput > max) {
            max = thirdInput;
        }

        return max;
    }

    public static int smallest(int firstInput, int secondInput, int thirdInput) {
        int min = firstInput;
        if (secondInput < min) {
            min = secondInput;
        }

        if (thirdInput < min) {
            min = thirdInput;
        }

        return min;
    }


}
