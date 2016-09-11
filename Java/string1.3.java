/**Notes
*Objective given a string turn it into char array and then turn all spaces into %20%
*Learned to concatenate to a char array turn it into a string first then back to array
*	To compare char to empty space use c == ' '
*	Java strings are immutable, char arrays are mutable
*
*/
import java.util.Scanner;

public class StringOnePointThree {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter string");
		String s = input.nextLine();
		char[] arr = s.toCharArray();
		System.out.println("Enter length");
		int l = input.nextInt();

		System.out.println(URLify(arr, l));
	}

	//ATTEMPT ONE DID NOT WORK
	public static String URLify(char[] arr, int l){
		if(l>0) {
			//if the char is an empty space, add three to l and append %20% to front of arr
			String s = new String(arr);
			if(arr[arr.length-1] == ' '){
				l+=3;
				//trim last character
				s = "%20%"+s.substring(0, s.length()-1);
			} else {
				//get the last character and place to front of string
				s = s.substring(s.length()-1, s.length()) + s.substring(0, s.length()-1);
			}
			//recurse
			URLify(s.toCharArray(), l--);
		}
		return new String(arr);
	}

}
