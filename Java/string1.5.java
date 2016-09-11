//Objective: strings have three ways to be edited, insert, replace or remove a character
//Given two strings do a check to see if they are one or two edits away
//Learned
	//Stringbuilder class best for insert(int, char), replace(int, int, string), and remove( , ) methods
	//Tutorials point is a neat site for quick java examples

public class StringOnePointFive {


	public static void main(String[] args) {
		String one = "pale";
		String two = "ple";
		oneEdit(one, two);

	}


//FIRST ATTEMPT DOES NOT CURRENTLY WORK
	public static void oneEdit(String one, String two) {
		one = one.toLowerCase();
		two = two.toLowerCase();
		System.out.println(checkInsert(one, two));
//		System.out.println(checkEdited(one, two));
//		System.out.println(checkReplace(one, two));
	}

	//Returns true if the first string is one insert away from the second string
	public static boolean checkInsert(String one, String two) {
		String a = "abcdefghijklmnopqrstuvwxyz";
		//create a stringbuilder of string one for insert manipulations
		StringBuilder sbOne = new StringBuilder(one);
		//Attempt inserting a letter into the first string, comparing to the second string each time to see if there is a match
			//i is cycling through the alphabet
			for(int i = 0; i<a.length(); i++ ) {
				//j is cycling through string one
				for(int j = 0; j<one.length(); j++) {
					System.out.println(sbOne.insert(j, a.charAt(i)));
					//sbOne.insert(j, a.charAt(i) Move this here and remove after on else
					if(sbOne.insert(j, a.charAt(i)).equals(two) ) {
						return true;
					} else {

					}
				}
			}

		return false;
	}

	//Returns true if the first string is one replacement away from the second string
	public static boolean checkReplace(String one, String two) {
		String a = "abcdefghijklmnopqrstuvwxyz";
		//create a stringbuilder of string one for insert manipulations
		StringBuilder sbOne = new StringBuilder(one);
		//Attempt inserting a letter into the first string, comparing to the second string each time to see if there is a match
			//i is cycling through the alphabet
			for(int i = 0; i<a.length(); i++ ) {
				//j is cycling through string one
				for(int j = 0; j<one.length(); j++) {
					if(sbOne.replace(j, j+1, String.valueOf(a.charAt(i)) ).equals(two) ) {
						return true;
					}
				}
			}

		return false;
	}

	//Returns true if the first string is one edit away from the second string
	public static boolean checkEdited(String one, String two) {
		String a = "abcdefghijklmnopqrstuvwxyz";
		//create a stringbuilder of string one for insert manipulations
		StringBuilder sbOne = new StringBuilder(one);
		//Attempt inserting a letter into the first string, comparing to the second string each time to see if there is a match
			//i is cycling through the alphabet
			for(int i = 0; i<a.length(); i++ ) {
				//j is cycling through string one
				for(int j = 0; j<one.length(); j++) {
					if(sbOne.deleteCharAt(j).equals(two) ) {
						return true;
					}
				}
			}

		return false;
	}

}
