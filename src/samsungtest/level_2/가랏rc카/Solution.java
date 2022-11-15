package samsungtest.level_2.°¡¶ùrcÄ«;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Solution {

	public static void main(String[] args) throws FileNotFoundException {
		// TODO Auto-generated method stub
		System.setIn(new FileInputStream("src/samsungtest/level_2/°¡¶ùrcÄ«/input.txt"));
		Scanner sc = new Scanner(System.in);
		
		int T = sc.nextInt();
		for	(int tc = 1; tc <= T; tc++) {
			int time = sc.nextInt();
			int speed = 0;
			int distance = 0;
			
			for	(int i = 0; i < time; i++) {
				int cmm = sc.nextInt();
				if (cmm == 0) {
					distance += speed;
					continue;
				}
				
				int tempSpeed = sc.nextInt();
				
				if (cmm == 1) {
					speed += tempSpeed;
					distance += speed;
				} else if (cmm == 2) {
					if (speed < tempSpeed) {
						speed = 0;
					} else {
						speed -= tempSpeed;
						distance += speed;
					}
				} 				
			}
			
			System.out.println("#" + tc + " " + distance);
		}
	}

}
