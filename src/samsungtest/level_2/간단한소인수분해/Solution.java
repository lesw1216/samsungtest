package samsungtest.level_2.간단한소인수분해;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class Solution {

	public static void main(String[] args) throws FileNotFoundException {
		// TODO Auto-generated method stub
		System.setIn(new FileInputStream("src/samsungtest/level_2/간단한소인수분해/input.txt"));
		Scanner sc = new Scanner(System.in);
		HashMap<Integer, Integer> map = new HashMap<>();

		
		int T = sc.nextInt();

		for	(int tc = 1; tc <= T; tc++) {
			map.put(2, 0);
			map.put(3, 0);
			map.put(5, 0);
			map.put(7, 0);
			map.put(11, 0);

			int n = sc.nextInt();
			int k = 2;
			int sqrtN = (int) Math.sqrt(n);

			while (k <= sqrtN && n != 1) {
				if (n % k == 0) {
					int v = map.get(k);
					map.put(k, v + 1);
					n /= k;
				} else
					k++;
			}

			System.out.print("#" + tc + " " + map.get(2) + " " + map.get(3)+ " " + map.get(5)+ " " + map.get(7)+ " " + map.get(11));
			System.out.println();
		}


	}

}
