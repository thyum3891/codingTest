package programers;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class N_num {
    public int[] solution(int[] array, int[][] commands) {
        
    int[] answer = new int[commands.length];
		int num1 = 0;  
		int num2 = 0;   // commands에 있는 [n][1,2,3]값을 추출할 변수값 생성
		int num3 = 0;  
		List<Integer> list = new ArrayList<Integer>();

		for (int i = 0; i < commands.length; i++) { // commands에 있는 [n][1,2,3]값을 변수 추출을 위한 순회

			num1 = commands[i][0] - 1;
			num2 = commands[i][1];
			num3 = commands[i][2] - 1; // 추출 완료

			if (num1 == num2) { // 범위가 없다면 바로 값 입력
				list.add(array[num1]);
			} else {
				for (int j = num1; j < num2; j++) { 

					list.add(array[j]); // 추출한 값으로 범위 지정하여 list에 담기

				}
			}
			Collections.sort(list); // 추출한 범위를 정렬
			answer[i] = (int) list.get(num3); // 정렬하여 요청한 n번째로 큰 값을 추출
			list.removeAll(list); // list를 비우고 다음 n번째 값 받기
		}

		return answer;
    }
}
