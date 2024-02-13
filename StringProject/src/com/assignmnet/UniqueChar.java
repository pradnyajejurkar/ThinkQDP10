package com.assignmnet;

public class UniqueChar {
	static void finduniqueChar(String s) {

		char ch[] = s.toCharArray();
		int count;
		boolean status;

		for (int i = 0; i < ch.length; i++) {
			count = 1;
			status = false;

			for (int j = i - 1; j >= 0; j--) {
				if (ch[i] == ch[j]) {
					status = true;
					break;
				}
			}

			if (status == false) {
				for (int k = i + 1; k < ch.length; k++) {
					if (ch[i] == ch[k])
						count++;
				}

				// unique
				if (count == 1)
					System.out.println(ch[i]);
			}

		}

	}

	public static void main(String[] args) {
		String s = " pradnya jejurkar";
		finduniqueChar(s);
	}
}