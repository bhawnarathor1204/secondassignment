package com.sebone.excr.numeric;
import java.util.Scanner;

/*class Name :- FindFactorialOfNumber 
 * Objective :- This class calculate the factorial of a number
 * Author :- Bhawna Rathor
 * Date :-17/03/2022
 */
public class FindFactorialOfNumber {

	/* Method Name :-findFactorial
	 * Objective :- This Method return factorial of a given number
     * Input Parameter :-this method takes 1 parameter Value of N;
     * return Type :- int;
     * this method is public and non static
	 */
	public int findFactorial(int n) {
		int fact=1;
		for(int i=n;i>0;i--) {
			fact=fact*i;
		}
		return fact;
	}
	
	 /* Method Name :-main method
      * Objective :- This Method is the driver method 
      * Input Parameter :-this method takes string array parameter
      * return Type :- void;
      */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		FindFactorialOfNumber findFactorialOfNumber=new FindFactorialOfNumber();
        System.out.println("Enter value of N = ");
        int n=sc.nextInt();
        System.out.println("factorial of "+ n +"number is ="+findFactorialOfNumber.findFactorial(n));
        sc.close();
	}

}
