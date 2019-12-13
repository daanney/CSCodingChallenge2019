package skeleton.answers;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Question3 {

    public static int whereDidIFinish(int[] scores, int[] alice) {
        // Streams are slow ..!?
        //List<Integer> sortedScores = IntStream.of(scores).boxed().distinct()
        //    .sorted().collect(Collectors.toList());
        //System.out.println(sortedScores);

        // the above manually for performance.
        Arrays.sort(scores);
        int scoreLength = scores.length;
        if(scoreLength >= 2) {
            int i = 1, j = 0;
            while(i<scores.length) {
                if(scores[i] != scores[j]) scores[++j] = scores[i];
                i++;
            }
            scoreLength = j + 1;
        }
        //System.out.println(IntStream.of(scores).boxed().collect(Collectors.toList()));

        Arrays.sort(alice);
        int x = scoreLength, medianScore = alice[alice.length>1 ? alice.length / 2 : 0];
        while(x-->0 && scores[x] > medianScore);

        //System.out.println(Arrays.asList(medianScore, scores[x], scoreLength, x));
        return scoreLength - x;
    }

    public static void main(String[] args) {
        System.out.println(whereDidIFinish(
            new int[]{0, 0, 2, 2, 4, 11, 13},
            new int[]{4, 12, 17}));
        System.out.println("expected: 3");

        System.out.println(whereDidIFinish(
            new int[]{11},
            new int[]{6, 11, 11, 16}));
        System.out.println("expected: 1");

        System.out.println(whereDidIFinish(
            new int[]{0, 4, 5, 11, 13, 16, 19},
            new int[]{0, 8, 15}));
        System.out.println("expected: 7");

        System.out.println(whereDidIFinish(
            new int[]{75, 90, 90, 80, 100, 60},
            new int[]{50, 77, 77, 90}));
        System.out.println("expected: 4");

        System.out.println(whereDidIFinish(
            new int[]{12, 3, 15, 19, 7, 19, 0, 8, 14, 5, 0, 11, 17, 8, 19, 17, 13, 3, 12},
            new int[]{5, 11, 13, 6}));
        System.out.println("expected: 10");
    }
}
