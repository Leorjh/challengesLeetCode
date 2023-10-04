import TwoSum.TwoSum;

public class Main {
    public static void main(String[] args) {
        TwoSum solution = new TwoSum();
        int[] numbs = {3,2,5,8};
        int target = 7;
        int[] result = solution.twoSum(numbs, target);
        System.out.println("Result: [" + result[0] + "," + result[1] + "]");
    }
}