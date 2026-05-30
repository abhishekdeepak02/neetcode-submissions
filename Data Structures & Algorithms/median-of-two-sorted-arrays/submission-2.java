class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {

        int l1 = nums1.length;
        int l2 = nums2.length;

        int n = l1+l2;
        int mid2 = n/2;
        int mid1 = -1;

        if (n%2 == 0){
            mid1 = mid2-1;
        } else {
            mid2 = n/2;
        }

        int index = 0;
        int val1 = -1;
        int val2 = -1;
        int i = 0; 
        int j = 0;

        while(i < l1 && j < l2) {
            if(nums1[i] < nums2[j]) {
                if(index == mid1) {
                    val1 = nums1[i];
                }
                if (index == mid2) {
                    val2 = nums1[i];
                }
                i++;
                index++;
            } else {
                if(index == mid1) {
                    val1 = nums2[j];
                }
                if (index == mid2) {
                    val2 = nums2[j];
                }
                j++;
                index++;
            }

            
        }

        while (i < l1) {
                if(index == mid1) {
                    val1 = nums1[i];
                }
                if (index == mid2) {
                    val2 = nums1[i];
                }
                i++;
                index++;
        }
        while(j < l2) {
                if(index == mid1) {
                    val1 = nums2[j];
                }
                if (index == mid2) {
                    val2 = nums2[j];
                }
                j++;
                index++;
            }
            
        
        if (n%2 != 0) {
            return (double)val2;
        } else {
            return (double) (val1+ val2)/2;
        }
        
    }
}
