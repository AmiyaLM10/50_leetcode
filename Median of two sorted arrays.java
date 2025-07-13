class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int n1 = nums1.length;
        int n2 = nums2.length;
        int n3 = n1 + n2;
        int[] arr = new int[n3];

        for (int i = 0; i < n1; i++) {
            arr[i] = nums1[i];
        }
        for (int i = 0; i < n2; i++) {
            arr[i + n1] = nums2[i];
        }
        insertionSort(arr);
        if (n3 % 2 == 0) {
            return (arr[n3 / 2 - 1] + arr[n3 / 2]) / 2.0;
        } else {
            return arr[n3 / 2];
        }
    }
    public static void insertionSort(int[] arr) {
        for (int i = 1; i < arr.length; i++) {
            int key = arr[i];
            int j = i - 1;
            while (j >= 0 && arr[j] > key) {
                arr[j + 1] = arr[j];
                j = j - 1;
            }
            arr[j + 1] = key;
        }
    }
}
