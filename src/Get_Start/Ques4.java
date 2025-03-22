package Get_Start;


//For the given integer input intervals number1 and number2
//
//Initialize the required variables.
//Apply the given formula sum = b*(b+1)/2 – a*(a+1)/2 + a.
//Print the sum variable as output.

public class Ques4 {
    public static void main(String[] args) {
        int num1 = 2;
        int num2 = 5;
        int sum = num2*(num2+1)/2 - num1*(num1+1)/2 + num1;
        System.out.println("The Sum is "+ sum);
    }
}
