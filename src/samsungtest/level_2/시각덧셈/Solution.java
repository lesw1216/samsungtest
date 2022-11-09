package samsungtest.level_2.�ð�����;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Solution {

	/*
	 * �ÿ� ������ �̷���� �ð��� 2�� �Է� �޴´�.
	 * ���Ѵ�.
	 * �ô� 1 ~ 12, ���� 0 ~ 59
	 */
	public static void main(String[] args) throws FileNotFoundException {
		// TODO Auto-generated method stub
		System.setIn(new FileInputStream("src/samsungtest/level_2/�ð�����/input.txt"));
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
