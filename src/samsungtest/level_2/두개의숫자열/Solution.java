package samsungtest.level_2.두개의숫자열;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

/*
 * 
 */
public class Solution {

	public static void main(String[] args) throws FileNotFoundException {
		// TODO Auto-generated method stub
		System.setIn(new FileInputStream("src/samsungtest/level_2/두개의숫자열/input.txt"));
		Scanner sc = new Scanner(System.in);

		int T = sc.nextInt();

		for(int tc = 1; tc <= T; tc++) {
			int fLen = sc.nextInt();
			int sLen = sc.nextInt();
			int sum = 0;
			int max = 0;

			// 두개 배열 크기 입력받기
			int[] flist = new int[fLen];
			int[] slist = new int[sLen];

			// 첫번째 배열 요소 입력받기
			for (int i = 0; i < flist.length; i++)
				flist[i] = sc.nextInt();

			// 두번째 배열 요소 입력받기
			for (int i = 0; i < slist.length; i++)
				slist[i] = sc.nextInt();

			if (fLen < sLen) {
				// 최대값 구하기
				for	(int i = 0; i <= slist.length - flist.length; i++) {
					for (int j = 0; j < flist.length; j++) {
						sum += flist[j] * slist[j + i];
					}
					
					max = Math.max(max, sum);
					sum = 0;
				}				
			} else {
				// 최대값 구하기
				for	(int i = 0; i <= flist.length - slist.length; i++) {
					for (int j = 0; j < slist.length; j++) {
						sum += flist[j + i] * slist[j];
					}
					
					max = Math.max(max, sum);
					sum = 0;
				}				
			}


			System.out.println("#" + tc + " " + max);
		}
	}

}
