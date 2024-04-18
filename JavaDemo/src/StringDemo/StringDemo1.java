package StringDemo;

public class StringDemo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str1="Suraj";
		String str2="Rokade";
		String str3=str1.concat(" "+str2);
		System.out.print(str3);
		String str4 = str1 +" "+str2;
		System.out.println(" "+str4);
		System.out.println("Length of String = " + str2.length());
		//String charAt and IndexOf
		System.out.println(str1.charAt(1));
		System.out.println(str1.indexOf('u'));
		//compareTo
		System.out.println(str1.compareTo("SURAJ"));
		// contains
		System.out.println(str1.contains("raj"));
		//endsWith
		System.out.println(str1.endsWith("j"));
		//replaceAll replaceFirst
		System.out.println(str1.replaceFirst("Sur", "mur"));
		//toLowerCase toUpperCase
		System.out.println(str1.toUpperCase());
		System.out.println(str1.toLowerCase());
	}

}
