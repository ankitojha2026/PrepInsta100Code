package Get_Start;

//Check Whether a Given Number is Prime or Not in Java
//Given an integer input greater than 0. The objective is to Check Whether or Not the Number is a Prime. To do so we’ll write a code to Check Whether a Given Number is Prime or Not in Java that checks for the factors of the Number besides 1 and the number itself.
//
//Example
//Input : 23
//Output : Prime
public class Ques8 {

    public static boolean isPrime(int num)
    {
        if(num%2==0)return false;

        for(int i=3;i<=num/2 ;i++)
        {
            if(num%i==0)
            {
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        int num=4;
        System.out.println(isPrime(num));
    }
}
