package samsungtest.level_2.달팽이숫자;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.Scanner;

import javax.sound.midi.Soundbank;

/*
 * 달팽이 숫자
 * 시계방향으로 회전하면서 저장.
 * 반복되는 순서는 오른쪽 -> 아래 -> 왼쪽 -> 위
 * 
 * 오른쪽으로 저장하다가 끝을 만나거나, 저장된 값이 있다 방향을 아래로
 * 아래로 저장하다가 끝을 만나거나, 저장된 값이 있따면 방향을 왼쪽
 * 왼쪽으로 저장하다가 끝을 만나거나, 저장된 값이 있다면 방향을 위로
 * 위로 저장하다가 끝을 만나거나, 저장된 값이 있다면 방향을 오른쪽으로.
 * 
 * 여기서 오른쪽, 아래, 왼쪽은 배열의 양 끝과도 마주치는지 체크, 위는 다음 값에 저장된 값이 있는지만 체크
 */
public class Solution {

	public static void main(String[] args) throws FileNotFoundException {
		// TODO Auto-generated method stub
		System.setIn(new FileInputStream("src/samsungtest/level_2/달팽이숫자/input.txt"));
		Scanner sc = new Scanner(System.in);
		
		int T = sc.nextInt();
		for(int tc = 1; tc <= T; tc++) {
			System.out.println("#" + tc);
			int n = sc.nextInt();
			int[][] board = new int[n][n];
			
			int count = 1;
			int i = 0;
			int j = 0;
			
			if (n == 1)
				System.out.println("1");
			else if (n == 2)
				System.out.println("1 2");
			else {
				for (; i < n; i++) {
					// 오른족
					System.out.println("오른쪽 탐색 시작");
					for (; j < n; j++) {
						// 다음위치에 값이 존재하면 방향을 아래로 이동, 배열의 끝은 정상적으로 수행되는 반복문의 종료
						System.out.println(i + " " + j);
						if (board[i][j] != 0) {
							j--;
							break;
						}
						
						board[i][j] = count;
						count++;
						
						if (j == n - 1)
							break;
					}
					
					// 아래
					System.out.println("아래 탐색 시작");
					j = i;
					for (; j < n; j++) {
						System.out.println(j + " " + (n-1));
						if (board[j][(n - 1) - i] != 0) {
							j--;
							break;
						}
						// 세로가 증가하는 동안 가로는 고정
						board[j][i] = count;
						count++;
					}
					
					// 왼쪽 <- i고정 j 감소
					System.out.println("왼쪽 탐색 시작");
					for ( ; j >= 0; j--) {
						System.out.println((n-1) + " " + j);
						if (board[(n -1) - i][j] != 0) {
							j++;
							break;
						}
						
						board[(n - 1) - i][j] = count;
						count++;
					}
					
					// 위쪽 j 고정, i감소
					System.out.println("위 탐색 시작");
					for (; j >= 0; j--) {
						if (board[j][i] != 0) {
							j++;
							break;
						}
						
						board[j][i] = count;
						count++;
					}
				}
				
				
				for (int l = 0; l < n; l++) {
					for (int k = 0; k < n; k++) {
						System.out.print(board[l][k] + " ");
					}
					System.out.println();
				}
				
			}
			
		}
	}
}
