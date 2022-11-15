package samsungtest.level3.날짜계산기;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Solution {

	public static void main(String[] args) throws FileNotFoundException {
		// TODO Auto-generated method stub
		System.setIn(new FileInputStream("src/samsungtest/level3/날짜계산기/input.txt"));
		Scanner sc = new Scanner(System.in);
		int[] day = {0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
		
		
		int T = sc.nextInt();
		for	(int tc = 1; tc <= T; tc++) {
			
			int fMonth = sc.nextInt();
			int fDay = sc.nextInt();
			int sMonth = sc.nextInt();
			int sDay = sc.nextInt();
			
			int sum = 0;
			for	(int i = fMonth; i <= sMonth; i++) {
				if (i == fMonth) 
					sum += day[i] - fDay + 1;
				else if (i == sMonth) 
					sum += sDay;
				else
					sum += day[i];
			}
			
			System.out.println("#" + tc + " " + sum);
		}
	}

}
