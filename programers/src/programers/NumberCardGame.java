package programers;

import java.util.*;

public class NumberCardGame {
	public int solution(int[] arrayA, int[] arrayB) {
		int answer = 0;

		Arrays.sort(arrayA);
		Arrays.sort(arrayB);

		int a = arrayA[0];
		int b = arrayB[0];
		int resultA = 0;
		int resultB = 0;
		for (int i = a; i > 1; i--) {
			boolean isPass = true;
			for (int num : arrayA) {
				if (num % i != 0) {
					isPass = false;
				}
			}
			for (int num : arrayB) {
				if (num % i == 0) {
					isPass = false;
				}
			}
			if (isPass) {
				resultA = i;
				break;
			}
		}
		if (resultA > b) {
			return resultA;
		}
		for (int i = b; i > 1; i--) {

			boolean isPass = true;
			for (int num : arrayB) {
				if (num % i != 0) {
					isPass = false;
				}
			}
			for (int num : arrayA) {
				if (num % i == 0) {
					isPass = false;
				}
			}
			if (isPass) {
				resultB = i;
				break;
			}
		}
		if (resultA > resultB) {
			return resultA;
		} else {
			return resultB;
		}

	}

	public static void main(String[] args) {
		new NumberCardGame().solution(new int[] { 10, 20 }, new int[] { 5, 17 });
	}

}
