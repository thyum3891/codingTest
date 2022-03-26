package programers;

import java.util.ArrayList;

public class Test {

public static void main(String[] args) {
		ArrayList<Integer> numbers = new ArrayList<Integer>();
		numbers.add(5);
		numbers.add(6);
		numbers.add(7);
		numbers.add(8);
		numbers.add(9);
	
		// numbers에서 7보다 큰 수들의 카운트 수 구하기
		numbers.stream().forEach( n ->{System.out.println(n);}); 
		
	
	//	System.out.println(count); // 2
	}

}
