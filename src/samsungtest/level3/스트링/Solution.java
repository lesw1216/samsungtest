package samsungtest.level3.스트링;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Solution {

	public static void main(String[] args) throws FileNotFoundException {
		// TODO Auto-generated method stub
		System.setIn(new FileInputStream("src/samsungtest/level3/스트링/input.txt"));
		Scanner sc = new Scanner(System.in);
		
		for (int tc = 1; tc <= 10; tc++) {
			int T = sc.nextInt();
			String search = sc.next();
			String line = sc.next();
			
			int count = 0;
			for (int i = 0; i <= line.length() - search.length(); i++) {
				String sub = line.substring(i, i + search.length());
				if (sub.equals(search)) {
					count++;
				}
			}
			
			System.out.println("#" + tc + " " + count);
		}
	}

}
