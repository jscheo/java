package day08;

import java.util.Scanner;

public class game1 {

    public static void main(String[] args) {

        String[] yoot = { "도", "개", "걸", "윷" };
        int[][] result1 = new int[4][4];
        int[][] vertex = new int[4][4];

        int end_count = 16;
        int sum = 0;
        int vertex1 = 4;
        int vertex1_1 = 6;
        int vertex2 = 8;
        
        
        
        
        
        
        
        boolean winner = true;

        Scanner sc = new Scanner(System.in);

        while (winner) {
            for (int i = 0; i < 4; i++) {
                System.out.println("윷을 던져주세요!");
                System.out.print("엔터키 입력> ");
                String throw1 = sc.nextLine();
                int result = (int) (Math.random() * 4 + 1);
                System.out.printf("플레이어 %d는 %s이(가) 나왔습니다!\n", i + 1, yoot[result - 1]);
                result1[i][0] += result;
            }
            for (int i = 0; i < 4; i++) {
                if (result1[i][0] == end_count) {
                    System.out.printf("축하합니다! 플레이어 %d가 우승했습니다!\n", i + 1);
                    winner = false;
                }
                if (result1[i][0] == vertex1) {
                    vertex[i][0] = 1;
                    System.out.printf("%d 플레이어가 첫번째 꼭지점 도착! 대각선으로 이동합니다.\n", i + 1);
                }
            }
            for (int i = 0; i < 4; i++) {
                if (vertex[i][0] == 1) {
                    if (result1[i][0] == vertex1_1) {
                        System.out.printf("%d 플레이어가 첫번째의 두번째 꼭지점 도착! 대각선으로 이동합니다.\n", i + 1);
                        vertex[i][0] = 2;
                    } else {
                        if (result1[i][0] >= 12) {
                            System.out.printf("축하합니다! 플레이어 %d가 우승했습니다!\n", i + 1);
                            winner = false;
                        }
                    }
                }
            }
            for (int i = 0; i < 4; i++) {
                if (vertex[i][0] == 2) {
                    if (result1[i][0] >= 8) {
                        System.out.printf("축하합니다! 플레이어 %d가 우승했습니다!\n", i + 1);
                        winner = false;
                    }
                }
            }

            for (int i = 0; i < 4; i++) {
                if ((result1[i][0] == vertex2) && (vertex[i][0] == 0)) {
                    vertex[i][0] = 3;
                    System.out.printf("%d 플레이어가 세번째 꼭지점 도착! 대각선으로 이동합니다.\n", i + 1);
                }
            }

            for (int i = 0; i < 4; i++) {
                if (vertex[i][0] == 3) {
                    if (result1[i][0] >= 12) {
                        System.out.printf("축하합니다! 플레이어 %d가 우승했습니다!\n", i + 1);
                        winner = false;
                    }
                }
            }

            System.out.println("현재 말의 위치는 다음과 같습니다.");

            char[][] graph = new char[5][5];  // 5x5 크기의 그래프 배열 초기화

         // 그래프 배열을 공백으로 초기화
            for (int i = 0; i < graph.length; i++) {
                for (int j = 0; j < graph[i].length; j++) {
                    graph[i][j] = 'ㅇ';  // '　'로 변경
                }
            }

            // 플레이어의 위치에 해당하는 좌표에 별(*)로 그래프 배열 갱신
            for (int i = 0; i < 4; i++) {
                int x = result1[i][0];
                int y = result1[i][1];

                // 좌표를 그래프 배열의 인덱스로 변환
                int row = 4 - x;
                int col = y;

                // 플레이어의 위치에 ★로 그래프 배열 갱신
                if (row >= 0 && row < 5 && col >= 0 && col < 5) {
                    graph[row][col] = '★';
                }
            }

         // 그래프 출력
            for (int i = 0; i < graph.length; i++) {
                for (int j = 0; j < graph[i].length; j++) {
                    System.out.print(graph[i][j]);
                    System.out.print(' ');
                }
                System.out.println();
            }
            }
        

   }
}



