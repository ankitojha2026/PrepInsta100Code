package Get_Start;

//Find the Sum of the Digits of a Number in Java
//Given an integer input number, the objective is t0 Find the Sum of the Digits of a Number in Java Language. To do we’ll break the number into it’s digits. Then we add them one by one as we extract them from the number using modulo operator “%”.
//
//Example
//Input : 1234
//Output : 1 + 2 + 3 + 4 = 10
public class Ques10 {

    public static int sumOfDigite(int num)
    {
        int sum=0;

        while(num>0)
        {
             sum = sum + num%10;
            num /=10;
        }
        return sum;
    }


    public static void main(String[] args) {

        int num=1234;
        System.out.println(sumOfDigite(num));

    }
}
