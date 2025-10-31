package 이론;

import java.util.HashMap;

public class 해시 {
    static void main(String[] args) {
        HashMap<String,Integer> map = new HashMap<>();
        map.put("동석",1);
        System.out.println(map.get("동석"));
    }
}
