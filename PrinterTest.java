package codewars;

/*
 In a factory a printer prints labels for boxes. 
 For one kind of boxes the printer has to use colors which, for the sake of simplicity, 
 are named with letters from a to m.
 The colors used by the printer are recorded in a control string. 
 For example a "good" control string would be aaabbbbhaijjjm meaning that the printer used
 three times color a, four times color b, one time color h then one time color a...
 Sometimes there are problems: lack of colors, technical malfunction and a "bad" control string
 is produced e.g. aaaxbbbbyyhwawiwjjjwwm.
 You have to write a function printer_error which given a string will output the error rate of
 the printer as a string representing a rational whose numerator is the number of errors and the 
 denominator the length of the control string. 
 Don't reduce this fraction to a simpler expression.
 The string has a length greater or equal to one and contains only letters from ato z.

 #Examples:
 s="aaabbbbhaijjjm"
 error_printer(s) => "0/14"

 s="aaaxbbbbyyhwawiwjjjwwm"
 error_printer(s) => "8/22"
 */

class Printer {
	public static String printerError(String s) {
		// 방법 (1)--------------------------------------------------------
		int errcnt=0;
		for (int i = 0; i < s.length(); i++) {
			if(s.charAt(i)<97 || s.charAt(i)>109) {
				errcnt++;
			}
		}
		return errcnt + "/" + s.length();
		// --------------------------------------------------------------
		
		// 방법 (2)-------------------------------------------------------
		// return s.replaceAll("[a-m]", "").length() + "/" + s.length();
		// --------------------------------------------------------------
		
		// 방법 (3)-------------------------------------------------------
		// long errcnt = s.chars().filter( ch -> ch > 'm').count();
		// return errcnt+"/"+s.length();
		// --------------------------------------------------------------
		
	}
}

public class PrinterTest {
	public static void main(String[] args) {
		System.out.println("printerError Fixed Tests");
        String s="aaaaaaaaaaaaaaaabbbbbbbbbbbbbbbbbbmmmmmmmmmmmmmmmmmmmxyz";
        System.out.println(Printer.printerError(s));
	}
}
