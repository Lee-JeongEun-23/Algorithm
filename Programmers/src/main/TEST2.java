package main;

import java.util.*;

public class TEST2 {
/*
	정수 n을 입력받아 n의 약수를 모두 더한 값을 리턴하는 함수, solution을 완성해주세요.

	n은 0 이상 3000이하인 정수입니다.
	
	12	28
	5	6

 */
	public static void main(String[] args) {
		int n = 5;
		int answer = 0;
		/*for(int i = 1; i <= n; i++) {
			if(n % i == 0) {
				System.out.println(i);
				answer += i;
			}
		}*/
		for(int i =1 ; i<=n/2;i++){
		      if(n%i==0){
		        answer+=i;
		        System.out.println(i);
		      }
		}
		System.out.println(answer);
	}
}

