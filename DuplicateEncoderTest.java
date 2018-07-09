package codewars;

import java.util.HashMap;

/*
 The goal of this exercise is to convert a string to a new string where each character in the
 new string is '(' if that character appears only once in the original string, or ')' if that
 character appears more than once in the original string. Ignore capitalization when determining
 if a character is a duplicate.

 Examples:
 "din" => "((("
 "recede" => "()()()"
 "Success" => ")())())"
 "(( @" => "))(("

 Notes:
 Assertion messages may be unclear about what they display in some languages.
 If you read "...It Should encode XXX", the "XXX" is actually the expected result, not the input!
 (these languages are locked so that's not possible to correct it).
 */

class DuplicateEncoder {
	static String encode(String word){
		String res="";
		char [] charstr = new char [word.length()];
		for (int i = 0; i < charstr.length; i++) {
			charstr[i] = Character.toLowerCase(word.charAt(i));
		}
		
		HashMap<Character, Integer> map = new HashMap<>();
		for (int i = 0; i < charstr.length; i++) {
			if(map.containsKey(charstr[i])==false) {
				map.put(charstr[i], 1);
			}else {
				map.replace(charstr[i], map.get(charstr[i]), map.get(charstr[i])+1);
			}
		}
		
		for (int i = 0; i < charstr.length; i++) {
			if(map.get(charstr[i])>1) {
				res += ")";
			}else res += "(";
		}
    return res;
  }
}

public class DuplicateEncoderTest {
	public static void main(String[] args) {
		System.out.println(DuplicateEncoder.encode("din"));
		System.out.println(DuplicateEncoder.encode("recede"));
		System.out.println(DuplicateEncoder.encode("Success"));
		System.out.println(DuplicateEncoder.encode("(( @"));

	}
}
