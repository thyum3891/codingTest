package programers;

import java.util.*;
import java.util.stream.Collectors;

public class NumberCardGame {
	public int solution(int[] arrayA, int[] arrayB) {

		Arrays.sort(arrayA);
		Arrays.sort(arrayB);

		List<Integer> listA = convertList(arrayA);
		List<Integer> listB = convertList(arrayB);
		
		int resultA = result(listA,arrayB);
		int resultB = result(listB,arrayA);
		
		return Math.max(resultA, resultB);
		

	}
	public List<Integer> convertList(int[] intArr){
		List<Integer> result = new ArrayList<Integer>();
		int min = intArr[0];
		for(int i = min; i>2;i--) {
			boolean flag = true;
			for(int j : intArr) {
				if(j % i != 0) {
					flag = false;
					break;
				}
			}
			if(flag) {
				result.add(i);
			}
		}
		
		return result;
		
	}
	
	public int result(List<Integer> intList,int[] intArr) {
		for(int i : intList) {
			boolean flag = true;
			for(int j : intArr) {
				if(j % i == 0) {
					flag = false;
					break;
				}
			}
			if(flag) {
				return i;
			}
		}
		return 0;
	}
	
	
	public static void main(String[] args) {
		new NumberCardGame().solution(new int[] { 10, 20 }, new int[] { 5, 17 });
	}

}
