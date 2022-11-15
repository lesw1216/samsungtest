package samsungtest.level3.flatten;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class Solution {

	public static void main(String[] args) throws FileNotFoundException {
		// TODO Auto-generated method stub
		System.setIn(new FileInputStream("src/samsungtest/level3/flatten/input.txt"));
		Scanner sc = new Scanner(System.in);
		
		for (int tc = 1; tc <= 10; tc++) {
			int dump = sc.nextInt();
			int[] list = new int[100];
			
			for (int i = 0; i < 100; i++) {
				list[i] = sc.nextInt();
			}
			
			
			for (int i = 0; i < dump; i++) {
				Arrays.sort(list);
				if (list[99] - list[0] == 1 || list[99] - list[0] == 0)
					break;
				list[0] += 1;
				list[99] -= 1;
			}
			
			Arrays.sort(list);
			System.out.println("#" + tc + " " + (list[99] - list[0]));
		}
	}	

}
