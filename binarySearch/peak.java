/* A peak element is an element that is greater than its neighbors.

Given an input array where num[i] ≠ num[i+1], find a peak element and return its index.

The array may contain multiple peaks, in that case return the index to any one of the peaks is fine.

You may imagine that num[-1] = num[n] = -∞.

For example, in array [1, 2, 3, 1], 3 is a peak element and your function should return the index number 2. */


public class Solution {
    public int findPeakElement(int[] nums) {
        if(nums==null || nums.length==0)
            return -1;
        
        int lo=0; 
        int hi=nums.length-1;
        
        while(lo+1<hi)
        {
            int mid=(lo+hi)/2;
            if(nums[mid-1]<nums[mid]&&nums[mid+1]<nums[mid])
                return mid;
            else if(nums[mid+1]>nums[mid])
                lo=mid;
            else
                hi=mid;
                
        }
        
        return nums[lo]>nums[hi]?lo:hi;
        
    }
}