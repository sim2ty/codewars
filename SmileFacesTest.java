package codewars;

import java.util.*;

/*
 Given an array (arr) as an argument complete the function countSmileys that should return
 the total number of smiling faces.
 
 Rules for a smiling face:
 -Each smiley face must contain a valid pair of eyes. Eyes can be marked as : or ;
 -A smiley face can have a nose but it does not have to. 
  Valid characters for a nose are - or ~
 -Every smiling face must have a smiling mouth that should be marked with either ) or D.
 
 No additional characters are allowed except for those mentioned.
 Valid smiley face examples:
 :) :D ;-D :~)
 Invalid smiley faces:
 ;( :> :} :] 

 Example cases:
 countSmileys([':)', ';(', ';}', ':-D']);       // should return 2;
 countSmileys([';D', ':-(', ':-)', ';~)']);     // should return 3;
 countSmileys([';]', ':[', ';*', ':$', ';-D']); // should return 1;
 */

class SmileFaces {
	public static int countSmileys(List<String> arr) {
		// 방법(1)-----------------------------------------------------------------------
		Iterator<String> iter = arr.iterator();
		int count=0;
		while(iter.hasNext()) {
			String s = iter.next();
			for (int i = 0; i < 1 ; i++) {
				if(s.length()==2) {
					if(s.charAt(0)==':' || s.charAt(0)==';') {
						if(s.charAt(1)==')' || s.charAt(1)=='D') {
							count++;
						}
					}
				}
				if(s.length()==3) {
					if(s.charAt(0)==':' || s.charAt(0)==';') {
						if(s.charAt(1)=='-' || s.charAt(1)=='~') {
							if(s.charAt(2)==')' || s.charAt(2)=='D') {
								count++;
							}
						}
					}
				}
			}
		}
		return count;
		//------------------------------------------------------------------------------
		
		// 방법(2)-----------------------------------------------------------------------
		// return (int)arr.stream().filter( x -> x.matches("[:;][-~]?[)D]")).count();   
		//------------------------------------------------------------------------------
	}
}

public class SmileFacesTest {
	public static void main(String[] args) {
		List<String> a =  new ArrayList<String>();
		a.add(":)"); a.add(":D"); a.add(":-}"); a.add(":-()");
		System.out.print("[");
		for(String s:a) {
			System.out.print(s + " ");
		}
		System.out.println("]   count : " + SmileFaces.countSmileys(a));
		a.removeAll(a);
		
		a.add(":)"); a.add("XD"); a.add(":0}"); a.add("x:-"); a.add("):-"); a.add("D:");
		System.out.print("[");
		for(String s:a) {
			System.out.print(s + " ");
		}
		System.out.println("]   count : " + SmileFaces.countSmileys(a));
		a.removeAll(a);
		
        a.add(":)"); a.add(":D"); a.add("X-}"); a.add("xo)"); a.add(":X"); a.add(":-3"); a.add(":3");
        System.out.print("[");
		for(String s:a) {
			System.out.print(s + " ");
		}
		System.out.println("]   count : " + SmileFaces.countSmileys(a));
		a.removeAll(a);
		
        a.add(":)"); a.add(":)"); a.add("x-]"); a.add(":ox"); a.add(";-("); a.add(";-)"); a.add(";~("); a.add(":~D");
        System.out.print("[");
		for(String s:a) {
			System.out.print(s + " ");
		}
		System.out.println("]   count : " + SmileFaces.countSmileys(a));
		a.removeAll(a);
	}

}
