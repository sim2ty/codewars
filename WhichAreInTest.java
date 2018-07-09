package codewars;

import java.util.Arrays;
import java.util.HashSet;

/*
 Which are in?
 
  Given two arrays of strings a1 and a2 return a sorted array in lexicographical order
  and without duplicates of the strings of a1 which are substrings of strings of a2.
  
  Example: 
  a1 = ["arp", "live", "strong"]
  a2 = ["lively", "alive", "harp", "sharp", "armstrong"]
  returns ["arp", "live", "strong"]
  
  a1 = ["tarp", "mice", "bull"]
  a2 = ["lively", "alive", "harp", "sharp", "armstrong"]
  returns []
  
  Note: Arrays are written in "general" notation. See "Your Test Cases" for examples in your language.
 */

class WhichAreIn { 
	public static String[] inArray(String[] array1, String[] array2) {
		HashSet<String> result = new HashSet<>();

		for(String a1 : array1) {
			for(String a2 : array2) {
				if(a2.contains(a1)) {
					result.add(a1);
					break;
				}
			}
		}

		String[] resultArray = result.toArray(new String[result.size()]);
		Arrays.sort(resultArray);
		return resultArray;
	}
}

public class WhichAreInTest {
	public static void main(String[] args) {
		String a[] = new String[]{"arp", "live", "strong"};
    	String b[] = new String[] {"lively", "alive", "harp", "sharp", "armstrong"};
    	String r[] = WhichAreIn.inArray(a, b);
		
    	for (int i = 0; i < r.length; i++) {
			System.out.print(r[i] + " ");
		}
	}
}
