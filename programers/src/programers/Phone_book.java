package programers;

/*
 *전화번호부에 적힌 전화번호 중, 한 번호가 다른 번호의 접두어인 경우가 있는지 확인하려 합니다.
 *전화번호가 다음과 같을 경우, 구조대 전화번호는 영석이의 전화번호의 접두사입니다.
 *
 *구조대 : 119
 *박준영 : 97 674 223
 *지영석 : 11 9552 4421
 *전화번호부에 적힌 전화번호를 담은 배열 phone_book 이 solution 함수의 매개변수로 주어질 때,
 *어떤 번호가 다른 번호의 접두어인 경우가 있으면 false를 그렇지 않으면 true를 return 하도록 solution 함수를 작성해주세요.
 */
import java.util.Set;
import java.util.HashSet;
import java.util.Arrays;
public class Phone_book {

    public boolean solution(String[] phone_book) {
    
   boolean answer = true;

		Set<String> list = new HashSet<String>(Arrays.asList(phone_book)); // phone_book 배열을 hashSet으로 변환

		for (String s : list) { // set으로 변환한 값을 순회
    
			for (int j = 0; j < s.length(); j++) { // 순회한 값의 길이만큼 반복 및 인덱스를 받음
      
				if(list.contains(s.substring(0, j))) { //순회한 값의 length만큼 subString에 인덱스 대입 및 대입된 만큼의 subString으로 추출한 값이 전체 Set에 포함된게 있는지 확인
					return false; // 있다면 false로 반환
          
				}
        //순회 for문 continue;
			}
		}

		return answer; //없다면 true로 반환
    
    }
}

