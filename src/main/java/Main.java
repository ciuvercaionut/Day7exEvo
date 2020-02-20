import java.util.*;

public class Main {
    public static void main(String[] args) {

        //1
//        BiggestAndSmallest bandS = new BiggestAndSmallest();
//
        Scanner scanner = new Scanner(System.in);
//        System.out.println("Input the first number");
//        int firstInput = scanner.nextInt();
//        System.out.println("Input the second number");
//        int secondInput = scanner.nextInt();
//        System.out.println("Input the third number");
//        int thirdInput = scanner.nextInt();
//
//        System.out.println("The smallest number is: " + bandS.smallest(firstInput,secondInput,thirdInput));
//        System.out.println("The largest number is: " + bandS.largest(firstInput,secondInput,thirdInput));
//




//
////2
//


//        UpperCaseChar upperCaseChar = new UpperCaseChar();
//       char ch = (char) System.in.read();
//
//        upperCaseChar.printIfUppercaseChar(ch);
//



//3


//        LeapYear ly = new LeapYear();
//        ly.checkIfLeapYear(100);
//        ly.checkIfLeapYear(400);
//        ly.checkIfLeapYear(200);
//        ly.checkIfLeapYear(404);
//        ly.checkIfLeapYear(2004);
//        ly.checkIfLeapYear(1998);

//4
//        System.out.println("enter first string :");
//        String s1 = scanner.nextLine();
//        System.out.println("enter second string");
//        String s2 = scanner.nextLine();
//
//        CheckWords cw = new CheckWords();
//        cw.checkWords(s1, s2);



////5




//        EvenNumbers en = new EvenNumbers();
//        en.printFirstHundredEvenNumbers(100);


// 6
//


//        ReverseANumber reversed = new ReverseANumber();
//        reversed.reverseNumber(12345);



//   7



//        StarPattern pattern = new StarPattern();
//        pattern.generatePattern();



//8


//        FibonacciNumbers fn = new FibonacciNumbers();
//        fn.generateFibonacci(20);



// 9



//        String message = "Tester";
//        CesarEncode cesarEncode = new CesarEncode();
//        cesarEncode.encode(message, 3);



// 10



//        int[] arr = new int[] {1,2,3,4,5,6,7,8};
//        SqrtOfElem elem = new SqrtOfElem();
//        elem.generateSqrtOfElements(arr);




// 11


//        String[] arr = new String[] {"a", "b","c","d"};
//        LongestElement lelem = new LongestElement();
//        lelem.getLongestElement(arr);



// 12



//        List<Integer> list = new ArrayList<Integer>();
//        list.add(1);
//        list.add(5);
//        list.add(12);
//        list.add(20);
//        list.add(2);
//        list.add(100);
//        list.add(1);
//        System.out.println("List before deleting: ");
//
//        for(Integer i: list){
//            System.out.println(i);
//        }
//        HighestAndLowestElements hl = new HighestAndLowestElements();
//        hl.findHandLow(list);
//
//        System.out.println("List before deleting: ");
//        for(Integer i: list){
//            System.out.println(i);
//        }



//13



//        List<Integer> list = new ArrayList<Integer>();
//        list.add(1);
//        list.add(5);
//        list.add(12);
//        list.add(20);
//        list.add(2);
//        list.add(100);
//        list.add(1);
//        list.add(2);
//
//        System.out.println("Initial list           :" + list);
//
//        ReverseSecondPartOfList rev = new ReverseSecondPartOfList();
//
//        List<Integer> reverse = rev.reverseSecondPard(list);
//        System.out.println("Reversed second part of initial list: " + reverse);




// 14



//        List<String> list = new ArrayList<String>();
//        list.add("aba");
//        list.add("Vow");
//        list.add("Ionut");
//
//        System.out.println("List before removing strings starting with vows :");
//        System.out.println(list);
//
//        RemoveVowElems rem = new RemoveVowElems();
//
//        System.out.println("List after removing strings starting with vows :");
//        System.out.println(rem.removeElemWithVoW(list));



//15



        List<String> list = new ArrayList<String>();
        list.add("aba");
        list.add("Vow");
        list.add("Ionut");
        list.add("a");

        System.out.println("List before sorting by  strings length :");
        System.out.println(list);

        SortListByLengthOfElem sortlist = new SortListByLengthOfElem();
        System.out.println("List after sorting by strings length :");
        Collections.sort(list, sortlist);
        System.out.println(list);
    }



}
