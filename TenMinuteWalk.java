package codewars;

/*
 You live in the city of Cartesia where all roads are laid out in a perfect grid. 
 You arrived ten minutes too early to an appointment, so you decided to take the 
 opportunity to go for a short walk. The city provides its citizens with a Walk Generating
 App on their phones -- everytime you press the button it sends you an array of one-letter
 strings representing directions to walk (eg. ['n', 's', 'w', 'e']). You always walk only 
 a single block in a direction and you know it takes you one minute to traverse one city 
 block, so create a function that will return true if the walk the app gives you will take
 you exactly ten minutes (you don't want to be early or late!) and will, of course, return
 you to your starting point. Return false otherwise.
 Note: you will always receive a valid array containing a random assortment of direction
 letters ('n', 's', 'e', or 'w' only). It will never give you an empty array (that's not a
 walk, that's standing still!).
 */

class TenMinWalk {
	  public static boolean isValid(char[] walk) {
	    int n=0, s=0, e=0, w=0;
	    for (int i = 0; i < walk.length; i++) {
			switch(walk[i]) {
			case 'n': n++; break;
			case 's': s++; break;
			case 'e': e++; break;
			case 'w': w++; break;
			}
		}
	    
	    if(walk.length!=10) {
	    	return false;
	    }
	    else if(n*s*e*w!=0 && (n==s | e==w)) {
	    	return true;
	    }else if(n*s!=0 && n==s && e==0 && w==0) {
	    	return true;
	    }else if(e*w!=0 && e==w && n==0 && s==0) {
	    	return true;
	    }
	    else return false;
	  }
}

public class TenMinuteWalk {
	public static void main(String[] args) {
		System.out.println(TenMinWalk.isValid(new char[] {'n','s','n','s','n','s','n','s','n','s'}));;
		System.out.println(TenMinWalk.isValid(new char[] {'w','e','w','e','w','e','w','e','w','e','w','e'}));
		System.out.println(TenMinWalk.isValid(new char[] {'w'}));
		System.out.println(TenMinWalk.isValid(new char[] {'n','n','n','s','n','s','n','s','n','s'}));
	}
}
