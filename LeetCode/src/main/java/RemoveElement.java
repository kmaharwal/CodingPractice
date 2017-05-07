public class removeElement {
    public int removeElementVal(int[] nums, int val) {
        int len = nums.length;
        int i = 0, j = 0;
        while (i < nums.length){
            if (nums[i] == val){
                 i = i+1;
                 len = len -1;
            } else{
                if (i > j){
                    nums[j]=nums[i];
                }
                i = i+1;
                j = j+1;
            }
            
        }
        return len;
        
        
    }
}
