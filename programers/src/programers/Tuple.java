package programers;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class Tuple {
    public int[] solution(String s) {
     int[] answer = {};

		String str1 = s.substring(2, (s.length() - 2)); // 각 앞, 뒤에 있는 중괄호 삭제
		List<String[]> list = new ArrayList<String[]>();

		String[] strA1 = str1.split("\\},\\{"); // String으로 받은 배열값 배열로 정리
		
		Map<Integer, String[]> map = new HashMap<Integer, String[]>();
		
		for(int i = 0; i<strA1.length;i++) {
			list.add(strA1[i].split(",")); // 정리된 배열값들을 다시 각각의 2차원 배열로 정리
		}
				
		for(int i = 0;i<list.size();i++) { // 2차원 배열로 정리된 배열을 length를 키워드로 정렬
			map.put(list.get(i).length, list.get(i));
		}

		Set<String> set = new LinkedHashSet<String>(); // 순서가 섞이지 않도록 링크셋 사용
		for(int i = 1;i<=map.size();i++) {
			for(int j = 0;j<map.get(i).length;j++) {
				set.add(map.get(i)[j]); // 배열길이로 정렬한 순서대로 배열값을 set에 정리
                						// set은 중복된 값은 저장되지 않음
			}
		}
		answer = new int[set.size()];
		Iterator<String> it = set.iterator(); // set순회방법
		int i = 0;
		while (it.hasNext()) { // set 순회방법 2
			answer[i] = Integer.parseInt(it.next()); // 순회하며 answer에 값 지정
			i++;

		}

		return answer;
    }
}
