package programmers;

import java.util.ArrayList;
import java.util.List;

public class KakaoClawCrane {
    public int solution(int[][] board, int[] moves) {
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
