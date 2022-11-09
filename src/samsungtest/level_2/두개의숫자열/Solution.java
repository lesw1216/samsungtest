package samsungtest.level_2.�ΰ��Ǽ��ڿ�;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

/*
 * 
 */
public class Solution {

	public static void main(String[] args) throws FileNotFoundException {
		// TODO Auto-generated method stub
		System.setIn(new FileInputStream("src/samsungtest/level_2/�ΰ��Ǽ��ڿ�/input.txt"));
		Scanner sc = new Scanner(System.in);

		int T = sc.nextInt();

		for(int tc = 1; tc <= T; tc++) {
			int fLen = sc.nextInt();
			int sLen = sc.nextInt();
			int sum = 0;
			int max = 0;

			// �ΰ� �迭 ũ�� �Է¹ޱ�
			int[] flist = new int[fLen];
			int[] slist = new int[sLen];

			// ù��° �迭 ��� �Է¹ޱ�
			for (int i = 0; i < flist.length; i++)
				flist[i] = sc.nextInt();

			// �ι�° �迭 ��� �Է¹ޱ�
			for (int i = 0; i < slist.length; i++)
				slist[i] = sc.nextInt();

			if (fLen < sLen) {
				// �ִ밪 ���ϱ�
				for	(int i = 0; i <= slist.length - flist.length; i++) {
					for (int j = 0; j < flist.length; j++) {
						sum += flist[j] * slist[j + i];
					}
					
					max = Math.max(max, sum);
					sum = 0;
				}				
			} else {
				// �ִ밪 ���ϱ�
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
