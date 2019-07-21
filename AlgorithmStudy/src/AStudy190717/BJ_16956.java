package AStudy190717;

import java.util.Scanner;
//16956 늑대와 양
//190717, 190721 읽음
//늑대량 양이 인접해있는지 판단하기
public class BJ_16956 {
	private static final int[] dy = new int[] { -1, 0, 1, 0 };
	private static final int[] dx = new int[] { 0, 1, 0, -1 };

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int R = sc.nextInt();
		int C = sc.nextInt();

		char[][] map = new char[R][C];
		for (int y = 0; y < R; y++)
			map[y] = sc.next().toCharArray();// 문자열 분해 메소드(char배열로 반환하는
												// String클래스의 메소드)

		for (int y = 0; y < R; y++) {
			for (int x = 0; x < C; x++) {
				for (int i = 0; i < 4; i++) {
					int ny = y + dy[i];
					int nx = x + dx[i];

					if (ny < 0 || ny >= R || nx < 0 || nx >= C)
						continue;

					if (map[y][x] == 'S' && map[ny][nx] == 'W') {
						System.out.println(0);
						System.exit(0);
					}
				}
			}
		}

		System.out.println(1);// 첫째줄에 1 출력
		for (int y = 0; y < R; y++) {
			for (int x = 0; x < C; x++)
				System.out.print((map[y][x] == '.') ? 'D' : map[y][x]);
			System.out.println();
		}

	}

}
