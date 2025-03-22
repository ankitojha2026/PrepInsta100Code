package Get_Start;
//Find the Greatest of the Three Numbers in Java
//Given three integers num1, num2 and num3 as inputs. The objective is to write a code to Find the Greatest of the Three Numbers in Java Language. To do so we’ll check the numbers with each other and print the largest of them all.
//
//Example
//Input : num1 = 12 num2 = 9 num3 = 14
//Output : 14
public class Ques6 {
    public static void main(String[] args) {

        int num1=12, num2=9 , num3=14;
        if(num1> num2 && num1> num3)
        {
            System.out.println(num1);
        }
        else {
            if(num2>num1 && num2 > num3)
            {
                System.out.println(num2);
            }
            else
            {
                System.out.println(num3);
            }
        }


    }
}
