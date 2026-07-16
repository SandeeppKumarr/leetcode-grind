/**
 * GeeksForGeeks: Segregate 0s and 1s
 * Difficulty: Easy
 * Language: Java
 * Date: 2026-07-15T01:35:44.074Z
 */
class Solution {
    void segregate0and1(int[] arr) {
        // code here
        int left = 0;
        int right = arr.length - 1;
        while(left < right){
            if((arr[left] == 0) && (arr[right] == 0)) left++;
            else if((arr[left] == 1) && (arr[right] == 1)) right--;
            else if((arr[left] == 1) && (arr[right] == 0)){
                swap(arr, left, right);
                left++;
                right--;
            }
            else{
                left++;right--;
            }
        }
    }
    void swap(int[] arr, int left, int right){
        int temp = arr[left];
        arr[left] = arr[right];
        arr[right] = temp;
    }
}
