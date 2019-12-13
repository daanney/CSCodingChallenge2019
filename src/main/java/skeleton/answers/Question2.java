package skeleton.answers;

import javax.validation.constraints.Null;
import java.util.*;
import java.util.stream.Collectors;

public class Question2 {

    static class bla implements Comparable<bla> {
        int risk, bonus, score;

        public bla(int risk, int bonus) {
            this.risk = risk;
            this.bonus = bonus;
            score = bonus*100 - risk;
        }

        @Override
        public int compareTo(bla o) {
            return o.score - score;
        }
    }

    public static int riskAndReward(int[] risk, int[] bonus, int[] trader) {
        List<bla> stuff = new ArrayList<>(bonus.length);
        for(int i=0; i<bonus.length; i++) stuff.add(new bla(risk[i], bonus[i]));

        Collections.sort(stuff);
        Arrays.sort(trader);

        int score = 0, i=trader.length, j = 1;
        while(i-->0) {
            bla b = stuff.get(0);
            try {
                while(trader[i] < b.risk && (b = stuff.get(j++)) != null);
                score += b.bonus;
            }catch(Exception e) {}
            j = 1;
        }

        return score;
    }

    public static void main(String[] args) {
        //System.out.println(riskAndReward(new int[]{5, 4, 3, 1, 8}, new int[]{9, 9, 1, 9, 4}, new int[]{6, 7, 2, 8, 1}));
        //System.out.println(riskAndReward(new int[]{9, 1, 1, 6, 1}, new int[]{9, 9, 8, 10, 10}, new int[]{2, 10, 9, 10, 10}));
        System.out.println(riskAndReward(new int[]{1, 2, 4, 6, 1, 6, 4, 9, 1, 7}, new int[]{5, 2, 3, 7, 4, 2, 3, 2, 1, 10}, new int[]{7, 9, 1, 8, 9, 9, 10, 10, 10, 3}));
        System.out.println("expected: 90");
    }
}
