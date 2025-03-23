package Get_Start;
//Check Whether or Not the Year is a Leap Year in Java
//We will write Leap Year Program in Java. Given an integer
// input “year” the objective is to check if the given year
// is a leap year or not using the conditions for a leap year.
// Therefore, keeping them in mind we write a code to Check Whether or
// Not the Year is a Leap Year in Java Language.
//Example
//Input : 2024
//Output: Leap Year

public class Ques7 {

    public static boolean isLeap(int year)
    {
        if(year%400==0)
        {
            return true;
        }
        else {
            if(year%4==0 && year%100!=0)
            {
                return true;
            }
            else {
                return false;
            }
        }
    }
    public static void main(String[] args) {

        int year =1283;
        System.out.println(isLeap(year));

    }
}
