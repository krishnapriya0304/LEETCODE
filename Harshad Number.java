class Solution {
    public static int sumOfDigit(int num){
        int sum=0;
        while(num!=0){
            int digit=num%10;
            sum=sum+digit;
            num=num/10;
        }
        return sum;
    }
    public int sumOfTheDigitsOfHarshadNumber(int x) {
        int sum=sumOfDigit(x);
        if(x%sum==0){
            return sum;
        }
        return -1;
    }
}
