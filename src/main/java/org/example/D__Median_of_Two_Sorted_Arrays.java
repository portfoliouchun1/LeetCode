package org.example;

public class D__Median_of_Two_Sorted_Arrays {

    public static double findMedianSortedArrays(int[] nums1, int[] nums2) {
        double result=0;
        int size=nums1.length+nums2.length;
        for(int i=0;i<size;i++){
            if(nums1.length>i){
                result+=nums1[i];
            }
            if(nums2.length>i){
                result+=nums2[i];
            }
        }
        return result/size;
    }
// todo   nums1 = [1,3], nums2 = [2]
// todo   Output: 2.00000

// todo   nums1 = [1,2], nums2 = [3,4]
// todo   Output: 2.50000
    static void main() {
//        int[] nums1 = {1,3}, nums2 = {2};
        int[] nums1={1,2}, nums2={3,4};
        System.out.println(findMedianSortedArrays(nums1,nums2));
    }

}
