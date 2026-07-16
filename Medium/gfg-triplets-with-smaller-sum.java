/**
 * GeeksForGeeks: Triplets with Smaller Sum
 * Difficulty: Medium
 * Language: Java
 * Date: 2026-07-16T12:10:44.074Z
 */
class Solution {
    int countTriplets(int sum, int arr[]) {
        // code here
        Arrays.sort(arr);
        int count = 0;
        for(int i = 0; i < arr.length - 2; i++){
            int j = i + 1;
            int k = arr.length - 1;
            while(j < k){
                int currSum = arr[i] + arr[j] + arr[k];
                if(currSum < sum){
                    count += (k - j);
                    j++; 
                }
                else k--;
            }
        }
        return count;
    }
}
