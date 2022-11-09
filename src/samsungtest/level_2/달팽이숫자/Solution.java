package samsungtest.level_2.�����̼���;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.Scanner;

import javax.sound.midi.Soundbank;

/*
 * ������ ����
 * �ð�������� ȸ���ϸ鼭 ����.
 * �ݺ��Ǵ� ������ ������ -> �Ʒ� -> ���� -> ��
 * 
 * ���������� �����ϴٰ� ���� �����ų�, ����� ���� �ִ� ������ �Ʒ���
 * �Ʒ��� �����ϴٰ� ���� �����ų�, ����� ���� �ֵ��� ������ ����
 * �������� �����ϴٰ� ���� �����ų�, ����� ���� �ִٸ� ������ ����
 * ���� �����ϴٰ� ���� �����ų�, ����� ���� �ִٸ� ������ ����������.
 * 
 * ���⼭ ������, �Ʒ�, ������ �迭�� �� ������ ����ġ���� üũ, ���� ���� ���� ����� ���� �ִ����� üũ
 */
public class Solution {

	public static void main(String[] args) throws FileNotFoundException {
		// TODO Auto-generated method stub
		System.setIn(new FileInputStream("src/samsungtest/level_2/�����̼���/input.txt"));
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
					// ������
					System.out.println("������ Ž�� ����");
					for (; j < n; j++) {
						// ������ġ�� ���� �����ϸ� ������ �Ʒ��� �̵�, �迭�� ���� ���������� ����Ǵ� �ݺ����� ����
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
					
					// �Ʒ�
					System.out.println("�Ʒ� Ž�� ����");
					j = i;
					for (; j < n; j++) {
						System.out.println(j + " " + (n-1));
						if (board[j][(n - 1) - i] != 0) {
							j--;
							break;
						}
						// ���ΰ� �����ϴ� ���� ���δ� ����
						board[j][i] = count;
						count++;
					}
					
					// ���� <- i���� j ����
					System.out.println("���� Ž�� ����");
					for ( ; j >= 0; j--) {
						System.out.println((n-1) + " " + j);
						if (board[(n -1) - i][j] != 0) {
							j++;
							break;
						}
						
						board[(n - 1) - i][j] = count;
						count++;
					}
					
					// ���� j ����, i����
					System.out.println("�� Ž�� ����");
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
