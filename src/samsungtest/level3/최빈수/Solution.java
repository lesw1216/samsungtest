package samsungtest.level3.ÃÖºó¼ö;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.Scanner;

public class Solution {

	public static void main(String[] args) throws FileNotFoundException {
		// TODO Auto-generated method stub
		System.setIn(new FileInputStream("src/samsungtest/level3/ÃÖºó¼ö/input.txt"));
		Scanner sc = new Scanner(System.in);
		
		int T = sc.nextInt();
		
		for(int tc = 1; tc <= T; tc++) {
			int tn = sc.nextInt();
			int[] list = new int[101];
			
			for (int i = 0; i < 1000; i++) {
				int score = sc.nextInt();
				list[score] += 1;
			}
			
			int max = 0;
			int maxIndex = 0;
			for (int i = 0; i < 101; i++) {
				if (max < list[i]) {
					max = list[i];
					maxIndex = i;
				} else if (max == list[i]) {
					maxIndex = i;
				}
				
			}
			
			System.out.println("#" + tc + " " + maxIndex);
		}
	}

}
