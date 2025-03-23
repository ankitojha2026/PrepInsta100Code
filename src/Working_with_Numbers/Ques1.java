package Working_with_Numbers;

//HCF of two numbers in Java
//Here, in this section we will discuss HCF of two numbers in java.
//GCD(Greatest Common Divisor) or HCF(Highest Common Factor) of two numbers is the number which is
// the largest common factor of both numbers.
// It is also referred as Greatest Common Factor(GCF),
// Greatest Common Measure(GCM), Highest Common Divisor(HCD).
public class Ques1 {
    public static void main(String[] args) {

        int num1 = 36, num2 = 60, hcf=0;

        for (int i = 1; i <= num1 || i <= num2; i++)
        {
            if (num1 % i == 0 && num2 % i == 0)
                hcf = i;
        }

        System.out.println("The HCF: "+ hcf);
    }
}
