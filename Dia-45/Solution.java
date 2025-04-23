class Solution {
    public int[] relativeSortArray(int[] arr1, int[] arr2) {
        int ordered = 0;
        for (int i = 0; i < arr2.length; i++) {
            for (int j = ordered; j < arr1.length; j++) {
                if (arr1[j] == arr2[i]) {
                    swap(arr1, j, ordered);
                    ordered++;
                }
            }
        }
        for (int i = ordered; i < arr1.length; i++) {
            for (int j = i + 1; j < arr1.length; j++) {
                if (arr1[i] > arr1[j]) {
                    swap(arr1, i, j);
                }
            }
        }
        return arr1;
    }
    public void swap(int[] arr, int a, int b){
        int aux = arr[a];
        arr[a] = arr[b];
        arr[b] = aux;
    } 
}