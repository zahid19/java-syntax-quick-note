# java-syntax-quick-note

import java.util.ArrayList;
import java.util.Scanner;

public class PracticeJava {
	public static void main(String[] args) {

		// ArrayList
		// ############
		ArrayList<String> a = new ArrayList<String>();
		a.add("one");
		a.add("two");
		a.add("three");
		a.indexOf("three"));
		a.size();
		a.remove(0);
		
		

		// String
		// ############
		String s = "This is String";
		char[] c = s.toCharArray();
		s.length();

		// StringBuilder
		// ############
		StringBuilder sb = new StringBuilder();
		sb.append("this");
		sb.append(" ");
		sb.append("is");
		sb.append(" ");
		sb.append("String Builder");
		sb.toString();
		sb.length();

		// Scanner
		// ############
		Scanner input = new Scanner(System.in);
		s = input.next();
	}
}
