package 이론;

import java.util.*;

/*
* 값을 기준으로 빨리 찾는다. ==> 해시맵
* 중복 제거               ==> 해시셋
* 순서 유지               ==> LinkedHashMap
* 자동 정렬               ==> TreeMap
* */

public class 해시 {
    static void main(String[] args) {
        HashMap<String,Integer> map = new HashMap<>();
        map.put("미리",1);
        System.out.println(map.get("미리"));

        // 자주 사용하는 패턴

        // 1. 빈도 세기
        ArrayList<String> list = new ArrayList<>(Arrays.asList("미리","기리","리미","미리"));
        for (String s : list) {
            // 해당 값이 몇번 나왔는지 확인
            map.put(s,map.getOrDefault(s,0) + 1);
        }
        System.out.println(map.toString());

        // 2. 중복 제거
        HashSet<String> set = new HashSet<>();
        set.add("미리");
        set.add("리리");
        set.add("미리");
        set.add("기리");

        if (set.contains("기리")) {
            System.out.println("기리가 있다");
        }

        System.out.println(set.toString());
    }
}
