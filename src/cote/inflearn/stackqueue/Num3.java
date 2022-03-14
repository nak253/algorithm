package cote.inflearn.stackqueue;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Num3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int size = scanner.nextInt();
        int[][] board = new int[size][size];
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                board[i][j] = scanner.nextInt();
            }
        }
        size = scanner.nextInt();
        int[] moves = new int[size];
        for (int i = 0; i < size; i++) {
            moves[i] = scanner.nextInt();
        }

        System.out.println(solution(board, moves));

    }

    public static int solution(int[][] board, int[] moves) {
        int answer = 0;
        List<Integer> basket = new ArrayList<>();

        for (int i = 0; i < moves.length; i++) {
            int num = moves[i];
            //board 배열 초과하는 경우
            if (board[0].length < num) {
                continue;
            }

            for (int index = 0; index < board.length; index++) {
                if (board[index][num - 1] != 0) { //인형이 존재할 경우
                    basket.add(board[index][num - 1]);
                    board[index][num - 1] = 0;
                    break;
                }
            }
            if (2 <= basket.size()) {
                if (basket.get(basket.size() - 1).equals(basket.get(basket.size() - 2))) {
                    answer += 2;
                    basket.remove(basket.size() - 1);
                    basket.remove(basket.size() - 1);
                }
            }
        }
        return answer;
    }
}
