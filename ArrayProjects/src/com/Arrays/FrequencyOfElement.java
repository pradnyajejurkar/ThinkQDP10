package com.Arrays;

public class FrequencyOfElement {

	static void findFrequency(char ch[]) {
		int count;
		boolean status;

		for (int i = 0; i < ch.length; i++) {
			count = 1;
			status = false;

			// check if the element is new

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

				// frequency
				System.out.println(ch[i] + "-->" + count);

			}

		}

	}

	public static void main(String[] args) {
		char ch[] = { 'a', 'b', 'c', 'a', 'b','d' ,'e','c'};
		
		findFrequency(ch);

	}

}
