public class searchInsertPosition {
    public int searchInsert(int[] nums, int target) {
        // int i=0;
        // for ( i = 0; i < nums.length; i++){
        //     if (nums[i] == target || nums[i] > target){
        //         return i;
        //     }
        // }
        // return i;
        int low = 0, high = nums.length-1;
        while(low<=high){
            int mid = (low+high)/2;
            if(nums[mid] == target) return mid;
            else if(nums[mid] > target) high = mid-1;
            else low = mid+1;
        }
        return low;
    }
}
