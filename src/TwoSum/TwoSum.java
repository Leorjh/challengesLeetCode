package TwoSum;

import java.util.HashMap;

public class TwoSum {
    public int[] twoSum(int[] numbs, int target) {
        HashMap<Integer, Integer> numsResult = new HashMap<>();
        for (int i = 0; i < numbs.length; i++) {
            int comp = target - numbs[i];
            if (numsResult.containsKey(comp)) {
                return new int[]{numsResult.get(comp), i};
            }
            numsResult.put(numbs[i], i);
        }
        return new int[0];
    }
}