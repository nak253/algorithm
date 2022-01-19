package programmers;

import java.util.ArrayList;
import java.util.List;

class Supo {
    private int index;
    private int[] answers;
    private int correctCount;

    public Supo(int[] answers) {
        index = 0;
        this.answers = answers;
    }

    public int getCorrect() {
        return this.correctCount;
    }

    public int getAnswer() {
        if (answers.length <= index) {
            index = 0;
        }
        int result = answers[index];
        index++;
        return result;
    }

    public void increaseCorrectCount() {
        this.correctCount++;
    }

}

public class Mock {
    public int[] solution(int[] answers) {
        List<Integer> answerList = new ArrayList<>();
        int max = 0;
        Supo sp1 = new Supo(new int[]{1, 2, 3, 4, 5});
        Supo sp2 = new Supo(new int[]{2, 1, 2, 3, 2, 4, 2, 5});
        Supo sp3 = new Supo(new int[]{3, 3, 1, 1, 2, 2, 4, 4, 5, 5});

        List<Supo> supoList = new ArrayList<>();
        supoList.add(sp1);
        supoList.add(sp2);
        supoList.add(sp3);

        for (int i = 0; i < answers.length; i++) {
            for (Supo s : supoList) {
                if (s.getAnswer() == answers[i]) {
                    s.increaseCorrectCount();
                }
            }
        }

        for (Supo s : supoList) {
           if (max < s.getCorrect()) {
               max = s.getCorrect();
           }
        }

        for (int i = 0; i < supoList.size(); i++) {
            if (max == supoList.get(i).getCorrect()) {
                answerList.add(i+1);
            }
        }

        return answerList.stream().mapToInt(i->i).toArray();
    }
}
