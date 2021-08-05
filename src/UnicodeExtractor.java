import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.HashSet;
import java.util.Collections;
import java.util.List;

public class UnicodeExtractor {

	static HashSet<String> set;

	public static void addCharsToSet(String text) {
		String word = "";
		for (String c : text.split("")) {
			set.add(c.toString());
		}
	}

	public static void main(String[] args) throws IOException {
		set = new HashSet<String>();

		Scanner scanner = new Scanner(System.in);
		while(scanner.hasNextLine()) {
			addCharsToSet(scanner.nextLine());
		}
		List<String> list = new ArrayList<String>(set);
		Collections.sort(list);
		String result = String.join("",list);
		System.out.println(result);
	}
}

