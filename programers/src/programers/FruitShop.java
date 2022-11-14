package programers;

import java.util.*;

public class FruitShop {
	
	
	public int solution(int k , int m , int[] score) {
		int answer = 0;
		Integer[] scoreRap = Arrays.stream(score).boxed().toArray(Integer[]::new);
		Arrays.sort(scoreRap, Collections.reverseOrder());
		
		for(int i=m-1;i<scoreRap.length;i+=m) {
			answer += scoreRap[i]*3;
			
		}
		
		return answer;
	}
	
	public static void main(String[] args) {
		 int result = new FruitShop().solution(4,3,new int[]{4, 1, 2, 2, 4, 4, 4, 4, 1, 2, 4, 2});
		 System.out.println(result);
	}

}
