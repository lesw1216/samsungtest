package samsungtest.level_2.���ڹ迭ȸ��;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.Scanner;

/*
 * �迭 ȸ��
 * 
 */
public class Solution {

	public static void main(String[] args) throws FileNotFoundException {
		// TODO Auto-generated method stub
		System.setIn(new FileInputStream("src/samsungtest/level_2/���ڹ迭ȸ��/input.txt"));
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
			
			
			// 90��, (j ����, i ����) x 3 ��
			for (int j = 0; j < t.length; j++) {
				 String temp = "";
				for (int i = t.length - 1; i >= 0; i--) {
					temp += t[i][j];
				}
				
				oneCheck[j] = temp;
			}
			
			// 180�� i���� j ���� x 3
			for (int i = t.length - 1; i >= 0; i--) {
				String temp = "";
				for (int j = t.length - 1; j >= 0; j--) {
					temp += t[i][j];
				}
				
				twoCheck[(t.length - 1) - i] = temp;
			}
			
			// 270��
			for (int j = t.length - 1; j >= 0; j--) {
				String temp = "";
				for (int i = 0; i < t.length; i++) {
					temp += t[i][j];
				}
				
				threeCheck[(t.length - 1) - j] = temp;
			}
			
			// ���
			System.out.println("#" + tc);
			for (int i = 0; i < n; i++) {
				System.out.println(oneCheck[i] + " " + twoCheck[i] + " " + threeCheck[i]);
			}
		}
	}

}
