// Median of Two Sorted Arrays

class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int[] result = new int[nums1.length + nums2.length];
        System.arraycopy(nums1,0,result,0,nums1.length);
        System.arraycopy(nums2,0,result,nums1.length,nums2.length);
        Arrays.sort(result);
        return calculateMedian(result);
    }
    public double calculateMedian(int[] arr){
        if(arr.length % 2 == 0){
            double left = arr[arr.length / 2 - 1];
            double right = arr[(arr.length / 2)]; 
            return (left + right) / 2;
        }
        return arr[arr.length/2];
    }
}

// Max Number of K-Sum Pairs

class Solution {
    public int maxOperations(int[] nums, int k) {
        Arrays.sort(nums);
        int i = 0;
        int j = nums.length-1;
        int result = 0;
        while(i < j){
            int current = nums[i] + nums[j];
            if(current == k){
                result++;
                i++;
                j--;
            }
            else if(current < k) i++;
            else j--;
        }
        return result;
    }
}