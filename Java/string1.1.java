import java.util.Scanner;


//Problem find if a given string contains duplicate letters.
//Questions to ask: if the given string boils down to ascii or can be
//Notes,
//Learned: in java to change char to ascii cast as an (int)


public class StringOnePointOne {

	public static void main(String[] args) {
		String entered = input();
		System.out.println(isUniqueTwo(entered));
	}

	public static String input() {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter a String");
		return input.next();
	}

	public static boolean isUniqueTwo(String entered) {
		//ascii can only be to 128
		boolean[] array = new boolean[128];
		for( int i=0; i<entered.length(); i++ )
		{
			//flag the index that is the ascii letter to true
			if(array[(int) entered.charAt(i)] == true) {
				return false;
			} else {
				array[(int) entered.charAt(i)] = true;
			}

		}
		return true;
	}


	//*FIRST ATTEMPT FAILED TECHNIQUE Checking for a false statement
	public static boolean isUnique(String entered) {
		for(int i = 0; i <= entered.length()+1; i++ ) {
			//Assign temp variable to current letter
			String temp = entered.substring(0, 1);
				//Iterate through the string, if contains the letter return false, else remove letter from string
				for(int j = 1; j < entered.length(); j++ ) {
					if(temp.equals(entered.substring(j, j+1))) {
						return false;
					} else {
						entered = entered.substring(1, entered.length());
					}
				}

		}

		return true;
	}

}
