public class Programmers_250137 {

    public static int solution(int[] bandage, int health, int[][] attacks) {
        int attackCnt = attacks.length;
        int endDamage = attacks[attackCnt - 1][1];
        if (endDamage > health) return -1;
        int curHealth = health;
        int timeCnt = 0;

        for (int[] attack : attacks) {
            int gapTime = attack[0] - timeCnt - 1;

            curHealth = getHeal(bandage, curHealth, gapTime);
            if (curHealth > health) curHealth = health;

            curHealth -= attack[1];
            if (curHealth <= 0) return -1;
            System.out.println("curHealth: " + curHealth);

            timeCnt = attack[0];
        }
        return  curHealth;
    }

    private static int getHeal(int[] bandage, int curHealth, int healTime) {
        if (healTime >= bandage[0]) {
            int additionalHeal = healTime / bandage[0];
            curHealth += healTime * bandage[1] + additionalHeal * bandage[2];
        } else {
            curHealth += healTime * bandage[1];
        }
        return curHealth;
    }

    public static void main(String[] args) {
        System.out.println(solution(
                new int[]{5, 1, 5},
                30,
                new int[][]{{2, 10}, {9, 15}, {10, 5}, {11, 5}}));
    }
}