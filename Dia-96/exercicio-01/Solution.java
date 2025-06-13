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