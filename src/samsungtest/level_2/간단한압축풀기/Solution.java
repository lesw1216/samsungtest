package samsungtest.level_2.간단한압축풀기;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class Solution {

	public static void main(String[] args) throws FileNotFoundException {
		// TODO Auto-generated method stub
		System.setIn(new FileInputStream("src/samsungtest/level_2/간단한압축풀기/input.txt"));
		Scanner sc = new Scanner(System.in);
		
		int T = sc.nextInt();
		for	(int tc = 1; tc <= T; tc++) {
			int n = sc.nextInt();
			
			ArrayList<String> list = new ArrayList<String>();
			for (int i = 0; i < n; i++) {
				String c = sc.next();
				int count = sc.nextInt();
				
				for (int j = 0; j < count; j++) 
					list.add(c);
				
			}
			
			System.out.println("#" + tc);
			for	(int i = 0; i < list.size(); i++) {
				if (i % 10 == 0 && i != 0) 
					System.out.println();
				
				System.out.print(list.get(i));
			}
			System.out.println();
		}
	}

}
