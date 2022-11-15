package samsungtest.level3.sum;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.Scanner;

public class Solution {

	public static void main(String[] args) throws FileNotFoundException {
		// TODO Auto-generated method stub
		System.setIn(new FileInputStream("src/samsungtest/level3/sum/input.txt"));
		Scanner sc = new Scanner(System.in);
		
		for (int t = 0; t < 10; t++) {
			int tc = sc.nextInt();
			
			int[][] map = new int[100][100];
			for (int i = 0; i < map.length; i++) {
				for (int j = 0; j < map.length; j++) {
					map[i][j] = sc.nextInt();
				}
			}
			
			// °¡·Î
			int max = Math.max(col(map), row(map));
			max = Math.max(max, downCross(map));
			max = Math.max(max, upCross(map));
			
			System.out.println("#" + tc + " " + max);
		}
	}
	
	public static int col(int[][] map) {
		int sum = 0;
		int max = 0;
		
		for (int i = 0; i < map.length; i++) {
			sum = 0;
			for (int j = 0; j < map.length; j++) {
				sum += map[i][j];
			}
			
			max = Math.max(max, sum);
		}
		
		return max;
	}
	
	public static int row(int[][] map) {
		int sum = 0;
		int max = 0;
		
		for (int i = 0; i < map.length; i++) {
			sum = 0;
			for (int j = 0; j < map.length; j++) {
				sum += map[j][i];
			}
			
			max = Math.max(max, sum);
		}
		
		return max;
	}
	
	public static int downCross(int[][] map) {
		int sum = 0;
		
		
		int x = 0;
		int y = 0;
		
		while (true) {
			if (x > 99 || y > 99)
				break;
			
			sum += map[x][y];
			x += 1;
			y += 1;
		}
		
		return sum;
	}
	
	public static int upCross(int[][] map) {
		int sum = 0;
		
		int x = 99, y = 0;
		
		while (true) {
			if (x < 0 || y > 99) 
				break;
			
			sum += map[x][y];
			x += -1;
			y += 1;
		}
		
		return sum;
	}
}
