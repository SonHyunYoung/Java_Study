import java.util.Scanner;

class Solution {
    public static void main(String args[]) throws Exception {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();

        for (int test_case = 1; test_case <= T; test_case++) {
            int N = sc.nextInt();
            int[][] arr = new int[N][N];

            // 방향: 오른쪽, 아래, 왼쪽, 위
            int[] dx = {0, 1, 0, -1};
            int[] dy = {1, 0, -1, 0};

            int x = 0, y = 0, dir = 0, num = 1;

            while (num <= N * N) {
                arr[x][y] = num++;

                int nx = x + dx[dir];
                int ny = y + dy[dir];

                // 범위 벗어나거나 이미 채워진 칸이면 방향 전환
                if (nx < 0 || nx >= N || ny < 0 || ny >= N || arr[nx][ny] != 0) {
                    dir = (dir + 1) % 4;
                    nx = x + dx[dir];
                    ny = y + dy[dir];
                }

                x = nx;
                y = ny;
            }

            // 출력
            System.out.printf("#%d\n", test_case);
            for (int i = 0; i < N; i++) {
                for (int j = 0; j < N; j++) {
                    System.out.printf("%d ", arr[i][j]);
                }
                System.out.println();
            }
        }
    }
}