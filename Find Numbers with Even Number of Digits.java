class Solution {
    public static int digitCount(int num){
        int count=0;
        while(num!=0){
            count++;
            num=num/10;
        }
        return count;
    }
    public int findNumbers(int[] nums) {
        int total=0;
        for(int i=0;i<nums.length;i++){
            int count=digitCount(nums[i]);
            if(count%2==0){
                total++;
            }
        }
        return total;
    }
}
