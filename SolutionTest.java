package codewars;

/*
 Write a program that will calculate the number of trailing zeros in a factorial 
 of a given number.

 N! = 1 * 2 * 3 * ... * N

 Be careful 1000! has 2568 digits...

 For more info, see: http://mathworld.wolfram.com/Factorial.html

 Examples
 zeros(6) = 1
 # 6! = 1 * 2 * 3 * 4 * 5 * 6 = 720 --> 1 trailing zero

 zeros(12) = 2
 # 12! = 479001600 --> 2 trailing zeros
 Hint: You're not meant to calculate the factorial. 
 Find another way to find the number of zeros.
 */

class Solution {
	public static int zeros(int n) {
		 int count_two=0, count_five=0; 
		    
	     for (int i = 2; i <= n; i *= 2) {
	       count_two += n / i;
	     }
	     for (int i = 5; i <= n; i *= 5) {
	       count_five += n / i;
	     }
	     System.out.println("count_two : " + count_two + ", count_five : " + count_five);
	     return Integer.min(count_two, count_five);
	}
}

public class SolutionTest {
	public static void main(String[] args) {
		System.out.println(Solution.zeros(0));
		System.out.println(Solution.zeros(6));
		System.out.println(Solution.zeros(10));
		System.out.println(Solution.zeros(14));
	}
}
