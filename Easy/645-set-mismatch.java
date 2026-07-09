/**
 * LeetCode #645: Set Mismatch
 * Difficulty: Easy
 * Language: Java
 * Date: 2026-07-09T04:46:37.684Z
 */

class Solution {
    public int[] findErrorNums(int[] nums) {
        int n = nums.length;
        long sumOfArray = 0;
        for(int num : nums){
            sumOfArray += num;
        }
        long sumOfNatural = (long)n * (n + 1) / 2;
        long xMinusY = sumOfArray - sumOfNatural;

        long sumOfArray2 = 0;
        for(int num : nums){
            sumOfArray2 += (long)num * num;
        }
        long sumOfNatural2 = (long)n * (n + 1) * (2 * n + 1) / 6;

        long xPlusY = (sumOfArray2 - sumOfNatural2) / xMinusY;

        int x = (int)((xMinusY + xPlusY) / 2);
        int y = (int)(xPlusY - x);
        return new int[]{x,y};
    }
}