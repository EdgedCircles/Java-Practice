import java.util.*;
public class Frequency {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
        sc.close();
		int len = str.length();
		char[] storeChars = new char[len];
		for (int i=0; i<len; i++) {
			storeChars[i] = str.charAt(i);
		}
		boolean[] counted = new boolean[len];
		for (int i=0; i<len; i++) {
			if (counted[i] == false) {
				char current = storeChars[i];
				int currentCount = 0;
				for (int x=0; x<len; x++) {
					if (storeChars[x] == current) {
						currentCount += 1;
						counted[x] = true;
					}
				}
				System.out.println("'" + current + "' appears " + currentCount + " times.");
			}
		}
	}
}