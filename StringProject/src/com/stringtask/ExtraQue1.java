package com.stringtask;

public class ExtraQue1 {

	static boolean SortedString(String s) {
		String[] st = s.split("\\s");

		boolean flag = false;

		for (int i = 0; i < st.length; i++) {
			flag = true;
			if (st[i].length() > 3) {
				for (int j = 0; j < st[i].length(); j++) {
					for (int k = j + 1; k < st[i].length(); k++) {
						if (st[i].charAt(j) > st[i].charAt(k)) {
							flag = false;
							break;
						}
					}
				}
			} else {
				flag = false;
			}
			if (flag == true) {
				break;
			}
		}
		return flag;

	}

	public static void main(String[] args) {
		String s = "Paula has a French accent";
		System.out.println(SortedString(s));

		String s1 = "The biopsy returned negative results";
		System.out.println(SortedString(s1));

		String s2 = "She sells sea shells by the sea shore";
		System.out.println(SortedString(s2));
	}
}