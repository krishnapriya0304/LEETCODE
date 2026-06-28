class Solution {
    public static int elementSum(int[] nums){
        int sum1=0;
        for(int i=0;i<nums.length;i++){
            sum1=sum1+nums[i];
        }
        return sum1;
    }
    public static int digitSum(int n){
        int sum2=0;
        while(n!=0){
            int digit=n%10;
            sum2=sum2+digit;
            n=n/10;
        }
        return sum2;
    }
    public int differenceOfSum(int[] nums) {
        int totalSum=0;
        for(int i=0;i<nums.length;i++){
            int sum=digitSum(nums[i]);
            totalSum=totalSum+sum;
        }
        int sum=elementSum(nums);
        return sum-totalSum;
    }
}
