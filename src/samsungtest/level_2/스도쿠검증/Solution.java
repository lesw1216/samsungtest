package samsungtest.level_2.스도쿠검증;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.Scanner;

public class Solution {

	public static void main(String[] args) throws FileNotFoundException {
		// TODO Auto-generated method stub
		System.setIn(new FileInputStream("src/samsungtest/level_2/스도쿠검증/input.txt"));
		Scanner sc = new Scanner(System.in);
		
		int T = sc.nextInt();
		loop:
		for	(int tc = 1; tc <= T; tc++) {
			int[][] sdocu = new int[9][9];
			
			for (int i = 0; i < sdocu.length; i++) {
				for (int j = 0; j < sdocu.length; j++) {
					sdocu[i][j] = sc.nextInt();
				}
			}
			
			// 가로
			boolean[] num = new boolean[10];
			for (int i = 0; i < sdocu.length; i++) {
				for (int j = 0; j < sdocu.length; j++) {
					// true면 중복
					if (num[sdocu[i][j]]) {
						System.out.println("#" + tc + " " + 0);
						continue loop;
					} else {
						num[sdocu[i][j]] = true;
					}
				}
			}
			
			// 세로
			num = new boolean[10];
			for (int i = 0; i < sdocu.length; i++) {
				for (int j = 0; j < sdocu.length; j++) {
					// true면 중복
					if (num[sdocu[j][i]]) {
						System.out.println("#" + tc + " " + 0);
						continue loop;
					} else {
						num[sdocu[i][j]] = true;
					}
				}
			}
			
			// 사각
			num = new boolean[10];
			boolean sqareCheck = false;
			for (int i = 0; i < sdocu.length - 2; i++) {
				for (int j = 0; j < sdocu.length - 2; j++) {
					// j 3번 반복 후 i 증가?
					if ((j == 3 || j == 6) && sqareCheck) {
						
					}
				}
			}
			
			System.out.println("#" + tc + " 1");
		}
	}

}
