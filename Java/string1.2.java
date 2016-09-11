import java.util.Scanner;

public class StringOnePointTwo {

//Objective, write a method to tell if given two strings one is permutation of the other
//Learned Big O is not a measure of efficiency, but rather how well the algorithm will scale with more data

	public static void main(String[] args) {
		String[] arr = input();
		System.out.println(isPermutation(arr));
//		System.out.println(getOccurrences("testing", 't'));
//		System.out.println(arr[1]);
	}

	public static String[] input()
	{
		String[] ret = new String[2];
		Scanner input = new Scanner(System.in);
		System.out.println("Enter string 1");
		ret[0] = input.next();
		System.out.println("Enter string 2");
		ret[1] = input.next();
		return ret;
	}

	//Given array of two strings returns whether or not the strings are permutations of one another
	public static boolean isPermutation(String[] arr)
	{
		String one = arr[0];
		String two = arr[1];
		int occrOne;
		int occrTwo;

		for ( int i = 0; i < arr[0].length(); i++ )
		{
			occrOne = getOccurrences(arr[0], arr[0].charAt(i));
			occrTwo = getOccurrences(arr[1], arr[1].charAt(i));

			if (occrOne != occrTwo)
			{
				return false;
			}
		}

		return true;
	}

	//Return the number of occurrences of a given char in a given string
	public static int getOccurrences(String s, char c)
	{
		int occurrences = 0;

		for(int i = 0; i < s.length(); i++)
		{
			if (s.charAt(i) == c)
			{
				occurrences++;
			}
		}

		return occurrences;
	}


}
