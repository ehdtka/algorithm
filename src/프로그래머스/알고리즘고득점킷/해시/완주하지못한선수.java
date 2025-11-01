package 프로그래머스.알고리즘고득점킷.해시;

/* 문제
* 수많은 마라톤 선수들이 마라톤에 참여하였습니다.
* 단 한 명의 선수를 제외하고는 모든 선수가 마라톤을 완주하였습니다.
* 마라톤에 참여한 선수들의 이름이 담긴 배열 participant와 완주한 선수들의 이름이 담긴
* 배열 completion이 주어질 때, 완주하지 못한 선수의 이름을 return 하도록 solution 함수를 작성해주세요.
*
* 마라톤 경기에 참여한 선수의 수는 1명 이상 100,000명 이하입니다.
* completion의 길이는 participant의 길이보다 1 작습니다.
* 참가자의 이름은 1개 이상 20개 이하의 알파벳 소문자로 이루어져 있습니다.
* 참가자 중에는 동명이인이 있을 수 있습니다.
* */

/* 생각
* contains를 이용해서 리스트의 값이 키에 없는 값을 리턴하면 될 것 같음. x ==> 동명이인일 경우 실패
* map을 이용해서 키에 이름, 값에 0+1 의 값을 넣는다. 리스트 값을 돌리면서 숫자를 하나씩 뺀다
*   0이 아닌 값이 정답.
* */

import java.util.*;

public class 완주하지못한선수 {

    public String solution(String[] participant, String[] completion) {

        HashMap<String, Integer> map = new HashMap<>();

        for (String s : participant) {
            map.put(s,map.getOrDefault(s, 0) + 1);
        }

        for (String s : completion) {
            map.put(s,map.getOrDefault(s, 0) - 1);
        }

        for (Map.Entry<String,Integer> entry : map.entrySet()) {
            if (entry.getValue() == 1) {
                return entry.getKey();
            }
        }



        return "";
    }
}
