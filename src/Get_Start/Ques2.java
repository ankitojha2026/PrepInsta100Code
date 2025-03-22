package Get_Start;


//Check Whether a Number is Even or Odd in Java
//Given an integer input the objective is to write a Java code
// to Check Whether a Number is Even or Odd. To do so the main idea is
//to divide the number by 2 and check if it’s divisible or not. It’s an Even number
// is it’s perfectly divisible by 2 or an Odd number otherwise.
//
//Here are the Methods to solve the above mentioned problem,
//
//Method 1 : Using Brute Force
//Method 2 : Using Ternary Operator
//Method 3 : Using Bitwise Operators
//We’ll discuss the above mentioned methods in detail in the next section.

import java.util.*;
public class Ques2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter number");
        int num=sc.nextInt();
        System.out.println((num%2==0)? "Number Is Even" : "Number is Odd" );
    }
}
