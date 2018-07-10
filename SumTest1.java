package codewars;

/*
 Given two integers a and b, which can be positive or negative, find the sum of all the numbers
 between including them too and return it. If the two numbers are equal return a or b.
 Note: a and b are not ordered!

 Examples
 GetSum(1, 0) == 1   // 1 + 0 = 1
 GetSum(1, 2) == 3   // 1 + 2 = 3
 GetSum(0, 1) == 1   // 0 + 1 = 1
 GetSum(1, 1) == 1   // 1 Since both are same
 GetSum(-1, 0) == -1 // -1 + 0 = -1
 GetSum(-1, 2) == 2  // -1 + 0 + 1 + 2 = 2
*/

class Sum{
   public int GetSum(int a, int b){
	   if(a==b) {
		   return a;
	   }else {
		   return ((a+b)*(Math.abs(a-b)+1))/2;
	   }
   }
}

public class SumTest1 {
	public static void main(String[] args) {
		Sum s = new Sum();
		System.out.println(s.GetSum(3, -1));
		System.out.println(s.GetSum(0, 1));
		
	}
}
