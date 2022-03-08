package programers;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

public class bestAlbum {
	public int[] solution(String[] genres, int[] plays) {
		List<Integer> answerList = new ArrayList<Integer>();
		Map<String, Integer> genresMap = new HashMap<String, Integer>();

		List<String> genresList = new ArrayList<String>(Arrays.asList(genres));
		Map<Integer, Integer> playList = new HashMap<Integer, Integer>();
		for (int i = 0; i < plays.length; i++) {
			playList.put(i, plays[i]);
		}

		for (int i = 0; i < genresList.size(); i++) {
			// 장르의 총 재생수를 파악하기 위한 순회
			if (!genresMap.containsKey(genresList.get(i))) {
				// 맵이 중복된 키를 가질수없는 것을 활용하여 맵안에 현재 키가 있는지 확인 없으면 추가
				genresMap.put(genresList.get(i), playList.get(i));
			} else {
				// 현재 키가 들어있다면 키에 대한 밸류값에 순회중인 id의 재생수를 추가하여 다시 밸류값으로 넣기
				genresMap.put(genresList.get(i), (genresMap.get(genresList.get(i)) + playList.get(i)));
			}
		}

		List<Map.Entry<String, Integer>> genresRank = new ArrayList<Map.Entry<String, Integer>>(genresMap.entrySet());

		genresRank.sort(new Comparator<Map.Entry<String, Integer>>() {
			@Override
			public int compare(Entry<String, Integer> o1, Entry<String, Integer> o2) {
				int result = o2.getValue() - o1.getValue();
				return result;
			}
		});
		// 엔트리로 바꿔 장르 순위 정렬
		List<Map.Entry<Integer, Integer>> playRank = new ArrayList<Map.Entry<Integer, Integer>>(playList.entrySet());
		playRank.sort(new Comparator<Map.Entry<Integer, Integer>>() {

			@Override
			public int compare(Entry<Integer, Integer> o1, Entry<Integer, Integer> o2) {
				int result = o2.getValue() - o1.getValue();
				return result;
			}

		});
		// 엔트리로 바꿔 플레이리스트 재생순위 정렬

		for (Map.Entry<String, Integer> entry : genresRank) {
			// 정렬된 장르 순회
			int count = 0;
			for (Map.Entry<Integer, Integer> playsEntry : playRank) {
				// 정렬된 플레이리스트 순회
				if (genresList.get(playsEntry.getKey()).equals(entry.getKey())) {
					// 플레이스트의 id(인덱스)가 현재 순회중인 장르와 같다면
					answerList.add(playsEntry.getKey());
					// 답안지에 추가
					count++;
					// 각 장르별 2개씩이니 카운트
					if (count == 2) {
						// 2개가 되었다면 순회 종료
						break;
					}
				}
			}

		}

		int[] answer = new int[answerList.size()];

		for (int i = 0; i < answerList.size(); i++) {
			answer[i] = answerList.get(i);
		}

		return answer;
	}

}
