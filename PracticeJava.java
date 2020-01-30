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
		System.out.println(a);
		System.out.println("Index of three: " + a.indexOf("three"));
		System.out.println(a.size());
		a.remove(0);
		System.out.println(a);
		

		// String
		// ############
		String s = "This is String";
		char[] c = s.toCharArray();
		System.out.println(s);
		System.out.println(s.length());

		// StringBuilder
		// ############
		StringBuilder sb = new StringBuilder();
		sb.append("this");
		sb.append(" ");
		sb.append("is");
		sb.append(" ");
		sb.append("String Builder");
		System.out.println(sb.toString());
		System.out.println(sb.length());

		// Scanner
		// ############
		Scanner input = new Scanner(System.in);
		s = input.next();
	}
}
