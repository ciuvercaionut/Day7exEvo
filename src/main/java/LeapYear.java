//3.Given a a strictly positive integer, find out whether it is a leap year(366 days) or not

public class LeapYear {

    void checkIfLeapYear(int year){

        if(year % 400 == 0){
            System.out.println(year + " is a leap year");
        }else if(year % 4 == 0 && year % 100 != 0){
            System.out.println(year + " is a leap year");
        }
        else{
            System.out.println(year + " is not a leap year");
        }
    }

}
