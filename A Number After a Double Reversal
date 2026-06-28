class Solution {
    public boolean isSameAfterReversals(int num) {
        int rev1=0,rev=0,temp=num;
        while(num!=0){
            int digit=num%10;
            rev1=rev1*10+digit;
            num=num/10;
        }
        while(rev1!=0){
            int digit=rev1%10;
            rev=rev*10+digit;
            rev1=rev1/10;
        }
        return rev==temp;
    }
}
