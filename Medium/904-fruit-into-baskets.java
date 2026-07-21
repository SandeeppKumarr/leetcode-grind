/**
 * LeetCode #904: Fruit Into Baskets
 * Difficulty: Medium
 * Language: Java
 * Date: 2026-07-21T18:58:14.717Z
 */

class Solution {
    public int totalFruit(int[] fruits) {
        int maxLength = -1;
        int left = 0;
        HashMap<Integer, Integer> frequency = new HashMap<>();
        for(int right = 0; right < fruits.length; right++){
            frequency.put(fruits[right], frequency.getOrDefault(fruits[right], 0) + 1);
            while(frequency.size() > 2){
                frequency.put(fruits[left], frequency.get(fruits[left]) - 1);
                if(frequency.get(fruits[left]) == 0) frequency.remove(fruits[left]);
                left++;
            }
            if(frequency.size() == 2) maxLength = Math.max(maxLength, right - left + 1);
        }
        return maxLength;
    }
}