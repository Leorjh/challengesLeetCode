import Challenges.TwoSum.TwoSum;

public class Main {
    public static void main(String[] args) {
        TwoSum solution = new TwoSum();
        int[] numbs = {3,2,5,8,10};
        int target = 18;
        int[] result = solution.twoSum(numbs, target);
        System.out.println("Expect Result: [3,4]");
        System.out.println("Result: [" + result[0] + "," + result[1] + "]");
    }
}