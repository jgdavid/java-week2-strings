package java_week3_strings;

public class string_exercises {
	public static void main(String[] args) {

		String myString = "Yesterday it was raining,";
		String myString2 = " today its sunny";

		String subS = myString2.substring(0, 10);
		String subS2 = myString.substring(16, 24);

		System.out.println(myString + myString2);
		System.out.println(subS + subS2);

		String myString3 = "how are you ";
		for (int i = 0; i < myString3.length(); i++)
			;
		System.out.println(i);

		String subSt = myString3.substring(0, 4);
		String subSt2 = myString3.substring(4, 8);
		String subSt3 = myString3.substring(8, 11);
		System.out.println(myString3.substring(0, 4).equals("how"));

		System.out.println(subSt);

//		exercise 2/2

		System.out.println(subSt);
		System.out.println(subSt2);
		System.out.println(subSt3);

//		char[] stArray = myString3.toCharArray();
//		for (char a : stArray)
//
//			System.out.println(a);
//
//		System.out.println(myString3.length());

	}
}
