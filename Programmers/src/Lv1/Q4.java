package Lv1;

/*
	< 연습문제 : x만큼 간격이 있는 n개의 숫자 > 
	
	함수 solution은 정수 x와 자연수 n을 입력 받아, x부터 시작해 x씩 증가하는 숫자를 n개 지니는 리스트를 리턴해야 합니다.
	다음 제한 조건을 보고, 조건을 만족하는 함수, solution을 완성해주세요.
	
	제한사항)
	x는 -10000000 이상, 10000000 이하인 정수입니다.
	n은 1000 이하인 자연수입니다.
*/

public class Q4 {
	public long[] solution(int x, int n) {
        long[] answer = new long[n];
		long temp = 0;
		for(int i = 0; i < answer.length; i++) {
			if(x < 0) {
				temp -= Math.abs(x); //parseInt 하는거 아니니까 이 코드는 필요없음
			}else {
				temp += x;
			}
			answer[i] = temp;
		}
        return answer;
    }
	
	// 다른분 풀이
	/*
		long[] answer = new long[n];
        answer[0] = x;

        for (int i = 1; i < n; i++) {
            answer[i] = answer[i - 1] + x;
        }

        return answer;
    */
}
