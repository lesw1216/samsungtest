package samsungtest.level_2.��𿡴ܾ��;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

/*
 * N x N ũ���� �ܾ� ����
 * N 5 ~ 15 ����
 * K 2 ~ N ����
 * ����κ� : 1
 * ������ �κ� : 0
 * 
 */
public class Solution {
	public static void main(String[] args) throws FileNotFoundException {
		System.setIn(new FileInputStream("src/samsungtest/level_2/��𿡴ܾ��/input.txt"));
		Scanner sc = new Scanner(System.in);
		
		int T = sc.nextInt();
		for (int tc = 1; tc <= T; tc++) {
			int sum = 0;
			int N = sc.nextInt();
			int k = sc.nextInt();
			
			int[][] tb = new int[N][N];
			for	(int i = 0; i < N; i++) {
				for (int j = 0; j < N; j++) {
					tb[i][j] = sc.nextInt();
				}
			}
			
			int count = 0;
			for	(int i = 0; i < N; i++) {
				for (int j = 0; j < N; j++) {
//					System.out.println("(tb[" + i + "][" + j + "] = " + tb[i][j]);
					
					if (tb[i][j] == 0) {
//						System.out.println("count = " + count);
						if (count == k) 
							sum++;
						
						count = 0;
						continue;
					}
					
					count++;
					if (j == N - 1) {
						if (count == k)
							sum++;
						
						count = 0;

					}
				}
			}
			System.out.println("sum = " + sum);
			count = 0;
			for	(int i = 0; i < N; i++) {
				for (int j = 0; j < N; j++) {
					if (tb[j][i] == 0) {
						if (count == k) 
							sum++;
						
						count = 0;
						continue;
					}
					
					count++;
					if (j == N - 1) {
						if (count == k) 
							sum++;
						
						count = 0;
					}
				}
			}
			
			System.out.println("#" + tc + " " + sum);
		}		
	}
}
