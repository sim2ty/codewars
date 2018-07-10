package codewars;

import java.util.ArrayList;
import java.util.LinkedList;

/*
 Your task is to sort a given string. Each word in the String will contain a single number. 
 This number is the position the word should have in the result.
 Note: Numbers can be from 1 to 9. So 1 will be the first word (not 0).
 If the input String is empty, return an empty String. 
 The words in the input String will only contain valid consecutive numbers.

 For an input: "is2 Thi1s T4est 3a" the function should return "Thi1s is2 3a T4est"
 your_order("is2 Thi1s T4est 3a")
 [1] "Thi1s is2 3a T4est"
*/

class Order {
	public static String order(String words) {
		if (words.isEmpty()) {
            return "";
        }
		String[] arr = words.split(" ");
        StringBuilder result = new StringBuilder("");
        for (int i = 1; i < 10; i++) {
            for (String s : arr) {
                if (s.contains(String.valueOf(i))) {
                    result.append(s + " ");
                }
            }
        }
        return result.toString().trim();
	}
}

public class OrderTest {
	public static void main(String[] args) {
		System.out.println(Order.order("is2 Thi1s T4est 3a"));
		System.out.println(Order.order("4of Fo1r pe6ople g3ood th5e the2"));
		System.out.println(Order.order("d4o dru7nken sh2all w5ith s8ailor wha1t 3we a6"));
		System.out.println(Order.order(""));
		System.out.println(Order.order("3 6 4 2 8 7 5 1 9"));
	}
}
