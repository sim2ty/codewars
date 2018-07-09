package codewars;

import java.util.HashMap;

/*
 Given an array, find the int that appears an odd number of times.
 There will always be only one integer that appears an odd number of times.
 */

class FindOdd {
	public static int findIt(int[] a) {
		int odd=a[0];
		HashMap<Integer, Integer> map = new HashMap<>();
		for (int i = 0; i < a.length; i++) {
			if(map.containsKey(a[i])==false) {
				map.put(a[i], 1);
			}else {
				map.replace(a[i], map.get(a[i]), map.get(a[i])+1);
			}
		}
		for (int i = 0; i < a.length ; i++) {
			if(map.get(a[i])%2==1) {
				odd = a[i];
			}
		}
		return odd;
  }
}

public class FindOddTest {
	public static void main(String[] args) {
		System.out.println(FindOdd.findIt(new int[]{20,1,-1,2,-2,3,3,5,5,1,2,4,20,4,-1,-2,5}));
		System.out.println(FindOdd.findIt(new int[]{1,1,2,-2,5,2,4,4,-1,-2,5}));
		System.out.println(FindOdd.findIt(new int[]{20,1,1,2,2,3,3,5,5,4,20,4,5}));
		System.out.println(FindOdd.findIt(new int[]{10}));
		System.out.println(FindOdd.findIt(new int[]{1,1,1,1,1,1,10,1,1,1,1}));
		System.out.println(FindOdd.findIt(new int[]{5,4,3,2,1,5,4,3,2,10,10}));
	}
}
