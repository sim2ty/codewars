package codewars;

/*
 Implement a method that accepts 3 integer values a, b, c. 
 The method should return true if a triangle can be built with the sides of given length
 and false in any other case.
 (In this case, all triangles must have surface greater than 0 to be accepted).
*/

class TriangleTester{
	  public static boolean isTriangle(int a, int b, int c){
		  if(a<=0 || b<=0 || c<=0) {
			  return false;
		  }else if(a+b>c && b+c>a && a+c>b) {
			  return true;
		  }else return false;
	  }
}

public class TriangleTesterTest {
	public static void main(String[] args) {
		System.out.println(TriangleTester.isTriangle(1,2,2));
		System.out.println(TriangleTester.isTriangle(7,2,2));
	}
}
