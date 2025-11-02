package 프로그래머스.알고리즘고득점킷.해시;

/* 문제
* 전화번호부에 적힌 전화번호 중, 한 번호가 다른 번호의 접두어인 경우가 있는지 확인하려 합니다.
* 전화번호가 다음과 같을 경우, 구조대 전화번호는 영석이의 전화번호의 접두사입니다.
* 구조대 : 119
* 박준영 : 97 674 223
* 지영석 : 11 9552 4421
* 전화번호부에 적힌 전화번호를 담은 배열 phone_book 이 solution 함수의 매개변수로 주어질 때,
* 어떤 번호가 다른 번호의 접두어인 경우가 있으면 false를 그렇지 않으면 true를 return 하도록 solution 함수를 작성해주세요.
*
* 제한 사항
* phone_book의 길이는 1 이상 1,000,000 이하입니다.
* 각 전화번호의 길이는 1 이상 20 이하입니다.
* 같은 전화번호가 중복해서 들어있지 않습니다.
* */

import java.util.Arrays;

/* 생각
* 중첩 포문을 이용해 하나하나 다 비교하는 방법 x => 시간복잡도가 O(n^2)이기 때문에 시간초과가 일어남.
* 숫자인 String을 sort로 정렬하게 되면 왼쪽 숫자부터 우선순위로 정렬되기 때문에
* 정렬 한 후에 인접한 값 끼리 비교하면 O(n*문자열길이)로 효율적으로 비교 할 수 있다.
* */
public class 전화번호목록 {
    public boolean solution(String[] phone_book) {
        Arrays.sort(phone_book);

        for (int i = 0; i < phone_book.length - 1; i++) {
            if (phone_book[i+1].startsWith(phone_book[i])) {
                return false;
            }
        }
        return true;
    }
}
