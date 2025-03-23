package Get_Start;



//prime number in a given range in java
//Find the Prime Numbers in a Given Interval in Java
//Given an integer input the objective is to check whether or not there are any Prime Numbers in the given interval or range. Therefore, we write a code to Find the Prime Numbers in a Given Interval in Java Language.
//
//Example
//Input : 2 10
//Output : 2 3 5 7
public class Ques9 {
    public static boolean isPrime(int num)
    {
        if(num%2==0)return false;
        for(int i=3 ; i<= num/2 ;i++)
        {
            if(num % i==0)return false;
        }
        return true;
    }
    public static void main(String[] args) {
        int num1=2 , num2=10;

        for(int i =num1 ;i<= num2 ;i++) {
            if (isPrime(i)) {
                System.out.print(i+" ,");
            }
        }


    }
}
