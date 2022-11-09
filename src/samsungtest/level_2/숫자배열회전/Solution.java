package samsungtest.level_2.숫자배열회전;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.Scanner;

/*
 * 배열 회전
 * 
 */
public class Solution {

	public static void main(String[] args) throws FileNotFoundException {
		// TODO Auto-generated method stub
		System.setIn(new FileInputStream("src/samsungtest/level_2/숫자배열회전/input.txt"));
		Scanner sc = new Scanner(System.in);
		
		int T = sc.nextInt();
		for	(int tc = 1; tc <= T; tc++) {
			int n = sc.nextInt();
			
			String[][] t = new String[n][n];
			String[] oneCheck = new String[n];
			String[] twoCheck = new String[n];
			String[] threeCheck = new String[n];
			
			for (int i = 0; i < n; i++) {
				for (int j = 0; j < n; j++) {
					t[i][j] = sc.next();
				}
			}
			
			
			// 90도, (j 고정, i 감소) x 3 번
			for (int j = 0; j < t.length; j++) {
				 String temp = "";
				for (int i = t.length - 1; i >= 0; i--) {
					temp += t[i][j];
				}
				
				oneCheck[j] = temp;
			}
			
			// 180도 i고정 j 감소 x 3
			for (int i = t.length - 1; i >= 0; i--) {
				String temp = "";
				for (int j = t.length - 1; j >= 0; j--) {
					temp += t[i][j];
				}
				
				twoCheck[(t.length - 1) - i] = temp;
			}
			
			// 270도
			for (int j = t.length - 1; j >= 0; j--) {
				String temp = "";
				for (int i = 0; i < t.length; i++) {
					temp += t[i][j];
				}
				
				threeCheck[(t.length - 1) - j] = temp;
			}
			
			// 출력
			System.out.println("#" + tc);
			for (int i = 0; i < n; i++) {
				System.out.println(oneCheck[i] + " " + twoCheck[i] + " " + threeCheck[i]);
			}
		}
	}

}
