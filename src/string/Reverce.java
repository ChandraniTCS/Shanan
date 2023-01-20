package string;

public class Reverce {
public static void main(String[] args) {
	String Str1 = "Hello";
	String Str2 = "";
	for (int i = 0; i < Str1.length(); i++) {
	  Str2 =Str1.charAt(i) + Str2;
	}
	System.out.println("Reversed string: "+ Str2);
}
}
