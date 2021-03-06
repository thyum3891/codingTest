package programers;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
public class Maraton {

	
	    public String solution(String[] participant, String[] completion) {
	      String answer = "";
	      List<String> list = (List<String>)(Arrays.asList(participant).stream().sorted().collect(Collectors.toList()));
				List<String> list2 =  (List<String>)(Arrays.asList(completion).stream().sorted().collect(Collectors.toList())); // 정렬된 리스트로 변환
	      
		        int idx = list.size()-1; // 만약 list가 for문이 다 돌아도 틀린게 없다면 마지막 인덱스가 리턴되도록 함
		        int i = 0;
				for(String s : list2) {
		            if(s.equals(list.get(i))==false) { // 완주못한 선수는 1명이기 때문에 정렬하여 틀어지는 순간이 완주못한 선수
		            	idx = i;
		            	break;
		            }
		            i++;
					}
		        answer = list.get(idx);
		 
	        return answer;
	    }
	}

