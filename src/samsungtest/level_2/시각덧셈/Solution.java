package samsungtest.level_2.시각덧셈;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Solution {

	/*
	 * 시와 분으로 이루어진 시각을 2개 입력 받는다.
	 * 더한다.
	 * 시는 1 ~ 12, 분은 0 ~ 59
	 */
	public static void main(String[] args) throws FileNotFoundException {
		// TODO Auto-generated method stub
		System.setIn(new FileInputStream("src/samsungtest/level_2/시각덧셈/input.txt"));
		Scanner sc = new Scanner(System.in);
		
		int T = sc.nextInt();
		for (int tc = 1; tc <= T; tc++) {
			int fHour = sc.nextInt();
			int fMinit = sc.nextInt();
			int sHour = sc.nextInt();
			int sMinit = sc.nextInt();
			
			int minit = fMinit + sMinit;
			if (59 < minit) {
				minit = minit - 60;
				fHour++;
			}
			
			int hour = fHour + sHour;
			if (12 < hour) {
				hour = hour - 12;
			}
			
			
			System.out.println("#" + tc + " " + hour + " " + minit);
		}
	}

}
