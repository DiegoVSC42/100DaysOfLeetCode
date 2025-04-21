class Solution {
    public int[] sortArray(int[] nums) {
        quickSort(nums, 0, nums.length - 1);
        return nums;
    }
    public void quickSort(int[] nums, int low, int high){
        if(low < high){
            int j = partition(nums, low, high);
            quickSort(nums, low, j - 1);
            quickSort(nums, j + 1, high);
        }
    }
    public int partition(int nums[],int low, int high){
        int pivot = nums[low];
        int i = low;
        int j = high + 1;
        while(i < j){ 
            do{
                i++;
            }while(i <= high && nums[i] < pivot);
            do{
                j--;
            }while(j >= low && nums[j] > pivot);
            if(i < j){
                swap(nums, i, j);
            }
        }
        swap(nums, low, j);
        return j;
    }

    public void swap(int[] nums, int a,int b){
        int aux = nums[a];
        nums[a] = nums[b];
        nums[b] = aux;
    }
}