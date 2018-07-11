package codewars;

import java.util.ArrayList;
import java.util.List;

/*
 A friend of mine takes a sequence of numbers from 1 to n (where n > 0).
 Within that sequence, he chooses two numbers, a and b.
 He says that the product of a and b should be equal to the sum of all numbers in the 
 sequence, excluding a and b.
 Given a number n, could you tell me the numbers he excluded from the sequence?
 The function takes the parameter: n (n is always strictly greater than 0) and returns 
 an array or a string (depending on the language) of the form:

 [(a, b), ...] or [[a, b], ...] or {{a, b}, ...} or or [{a, b}, ...]
 with all (a, b) which are the possible removed numbers in the sequence 1 to n.

 [(a, b), ...] or [[a, b], ...] or {{a, b}, ...} or ...will be sorted in increasing order 
 of the "a".

 It happens that there are several possible (a, b). The function returns an empty array 
 (or an empty string) if no possible numbers are found which will prove that my friend has 
 not told the truth! (Go: in this case return nil).

 (See examples of returns for each language in "RUN SAMPLE TESTS")

 Examples:
 removNb(26) should return [(15, 21), (21, 15)]
 or

 removNb(26) should return { {15, 21}, {21, 15} }
 or

 removeNb(26) should return [[15, 21], [21, 15]]
 or

 removNb(26) should return [ {15, 21}, {21, 15} ]
 or

 removNb(26) should return "15 21, 21 15"
 or

 in C:
 removNb(26) should return  **an array of pairs {{15, 21}{21, 15}}**
 tested by way of strings. 
 */

class RemovedNumbers {
	public static List<long[]> removNb(long n) {
		List<long[]> result = new ArrayList<long[]>();
		for(int i = 1; i<=n; i++){
            double j =  (n*(n+1)-2*i)/(2*(i+1d));		//(n*n+n)/2-i-j = i*j 식 변형
            if(j<=n && j%1==0) {
            	result.add(new long[]{i,(long)j});		//list에는 long배열의 주소값을 담는다. 
            }
        }
        return result;
	}
}

public class RemovedNumbersTest {
	public static void main(String[] args) {
		List<long[]> list = RemovedNumbers.removNb(26);
		for (int i = 0; i < list.size(); i++) {
			System.out.print("{" + list.get(i)[0] + ", " + list.get(i)[1] + "}");
			/* 	list에는 각각 두칸짜리 long배열의 0번지 주소값이 담겨져 있다. 따라서, list.get(i)[0]와
			 	같은 방법으로 요소를 출력해야 한다. 	*/
		}
	}
}
