package programers;

import java.util.*;

// 정렬 레벨 2 가장 큰 수
public class BigNumber {

	public static void main(String[] args) {

		int[] numbers = { 3, 30, 34, 5, 9 };

		List<String> answerList = new ArrayList<String>();
		List<String> list1_1 = new ArrayList<String>();
		List<String> list1_2 = new ArrayList<String>();
		List<String> list1_3 = new ArrayList<String>();
		List<String> list2_1 = new ArrayList<String>();
		List<String> list2_2 = new ArrayList<String>();
		List<String> list2_3 = new ArrayList<String>();
		List<String> list3_1 = new ArrayList<String>();
		List<String> list3_2 = new ArrayList<String>();
		List<String> list3_3 = new ArrayList<String>();
		List<String> list4_1 = new ArrayList<String>();
		List<String> list4_2 = new ArrayList<String>();
		List<String> list4_3 = new ArrayList<String>();
		List<String> list5_1 = new ArrayList<String>();
		List<String> list5_2 = new ArrayList<String>();
		List<String> list5_3 = new ArrayList<String>();
		List<String> list6_1 = new ArrayList<String>();
		List<String> list6_2 = new ArrayList<String>();
		List<String> list6_3 = new ArrayList<String>();
		List<String> list7_1 = new ArrayList<String>();
		List<String> list7_2 = new ArrayList<String>();
		List<String> list7_3 = new ArrayList<String>();
		List<String> list8_1 = new ArrayList<String>();
		List<String> list8_2 = new ArrayList<String>();
		List<String> list8_3 = new ArrayList<String>();
		List<String> list9_1 = new ArrayList<String>();
		List<String> list9_2 = new ArrayList<String>();
		List<String> list9_3 = new ArrayList<String>();

		// numbers를 문자열로 변경
		for (int i : numbers) {

			char strI = ("" + i).charAt(0);
			String str = ("" + i);

			if (strI == '1') {

				if (str.length() == 1) {
					list1_1.add(str);
				} else if (str.length() == 2) {
					list1_2.add(str);
				} else if (str.length() == 3) {
					list1_3.add(str);
				}
			} else if (strI == '2') {
				if (str.length() == 1) {
					list2_1.add(str);
				} else if (str.length() == 2) {
					list2_2.add(str);
				} else if (str.length() == 3) {
					list2_3.add(str);
				}
			} else if (strI == '3') {
				if (str.length() == 1) {
					list3_1.add(str);
				} else if (str.length() == 2) {
					list3_2.add(str);
				} else if (str.length() == 3) {
					list3_3.add(str);
				}

			} else if (strI == '4') {
				if (str.length() == 1) {
					list4_1.add(str);
				} else if (str.length() == 2) {
					list4_2.add(str);
				} else if (str.length() == 3) {
					list4_3.add(str);
				}
			} else if (strI == '5') {
				if (str.length() == 1) {
					list5_1.add(str);
				} else if (str.length() == 2) {
					list5_2.add(str);
				} else if (str.length() == 3) {
					list5_3.add(str);
				}
			} else if (strI == '6') {
				if (str.length() == 1) {
					list6_1.add(str);
				} else if (str.length() == 2) {
					list6_2.add(str);
				} else if (str.length() == 3) {
					list6_3.add(str);
				}
			} else if (strI == '7') {
				if (str.length() == 1) {
					list7_1.add(str);
				} else if (str.length() == 2) {
					list7_2.add(str);
				} else if (str.length() == 3) {
					list7_3.add(str);
				}
			} else if (strI == '8') {
				if (str.length() == 1) {
					list8_1.add(str);
				} else if (str.length() == 2) {
					list8_2.add(str);
				} else if (str.length() == 3) {
					list8_3.add(str);
				}
			} else if (strI == '9') {
				if (str.length() == 1) {
					list9_1.add(str);
				} else if (str.length() == 2) {
					list9_2.add(str);
				} else if (str.length() == 3) {
					list9_3.add(str);
				}
			}
		}

		// 정렬 후 리버스함
		for (String str : sortingMethod(list9_1)) {
			answerList.add(str);
		}
		for (String str : sortingMethod(list9_2)) {
			answerList.add(str);
		}
		for (String str : sortingMethod(list9_3)) {
			answerList.add(str);
		}
		
		for (String str : sortingMethod(list8_1)) {
			answerList.add(str);
		}
		for (String str : sortingMethod(list8_2)) {
			answerList.add(str);
		}
		for (String str : sortingMethod(list8_3)) {
			answerList.add(str);
		}
		
		for (String str : sortingMethod(list7_1)) {
			answerList.add(str);
		}
		for (String str : sortingMethod(list7_2)) {
			answerList.add(str);
		}
		for (String str : sortingMethod(list7_3)) {
			answerList.add(str);
		}
		
		for (String str : sortingMethod(list6_1)) {
			answerList.add(str);
		}
		for (String str : sortingMethod(list6_2)) {
			answerList.add(str);
		}
		for (String str : sortingMethod(list6_3)) {
			answerList.add(str);
		}
		
		for (String str : sortingMethod(list5_1)) {
			answerList.add(str);
		}
		for (String str : sortingMethod(list5_2)) {
			answerList.add(str);
		}
		for (String str : sortingMethod(list5_3)) {
			answerList.add(str);
		}
		
		for (String str : sortingMethod(list4_1)) {
			answerList.add(str);
		}
		for (String str : sortingMethod(list4_2)) {
			answerList.add(str);
		}
		for (String str : sortingMethod(list4_3)) {
			answerList.add(str);
		}
		
		for (String str : sortingMethod(list3_1)) {
			answerList.add(str);
		}
		for (String str : sortingMethod(list3_2)) {
			answerList.add(str);
		}
		for (String str : sortingMethod(list3_3)) {
			answerList.add(str);
		}
		
		for (String str : sortingMethod(list2_1)) {
			answerList.add(str);
		}
		for (String str : sortingMethod(list2_2)) {
			answerList.add(str);
		}
		for (String str : sortingMethod(list2_3)) {
			answerList.add(str);
		}
		
		
		for (String str : sortingMethod(list1_1)) {
			answerList.add(str);
		}
		for (String str : sortingMethod(list1_2)) {
			answerList.add(str);
		}
		for (String str : sortingMethod(list1_3)) {
			answerList.add(str);
		}

		// 4번째 자리 수 까지 자리수마다 배치를 하게끔 변경해야 함
		// answerList[ objectList[ strList[9]], [[5]], [[3], [34, 30], [3xx], [3xxx] ]

		// sb로 리스트를 넣어 답 만들기
		StringBuilder sb = new StringBuilder();

		for (String answer : answerList) {
			sb.append(answer);
		}

		System.out.println(sb.toString());

	}

	public static List<String> sortingMethod(List<String> list) {
		Collections.sort(list);
		Collections.reverse(list);

		return list;
	}

}
