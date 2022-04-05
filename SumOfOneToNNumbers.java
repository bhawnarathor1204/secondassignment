package com.sebone.excr.numeric;
import java.util.Scanner;
/*class Name :- SumOfOneToNNumbers
 * Objective :- This class calculate the sum of 1 to n numbers
 * Author :- Bhawna Rathor
 * Date :-17/03/2022
 */
public class SumOfOneToNNumbers {
	
	/* Method Name :-calculateSumOfOneTONNumbe
	 * Objective :- This Method return sum of 1 to n number
     * Input Parameter type int:-this method takes 1 parameter Value of N;
     * return Type :- int;
     * this method is public and non static
	 */
    public int calculateSumOfOneTONNumber(int n) {
    	int sum=0;
    	for(int i=1;i<=n;i++) {
    		sum=sum+i;
    	}
    	return sum;
    }
    
     /* Method Name :-main method
      * Objective :- This Method is the driver method 
      * Input Parameter :-this method takes string array parameter
      * return Type :- void;
      */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner sc=new Scanner(System.in);
        SumOfOneToNNumbers sumOfOneToNNumbers=new SumOfOneToNNumbers();
        System.out.println("Enter value of N = ");
        int n=sc.nextInt();
        System.out.println("sum of 1 to "+ n +"number is ="+sumOfOneToNNumbers.calculateSumOfOneTONNumber(n));
        sc.close();
	}

}
