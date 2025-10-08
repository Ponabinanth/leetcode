class Solution {
    public boolean isPalindrome(int x) {
        int sum = 0;
        int a = x;
        while(x!= 0)
        {
            int n = x%10;
            sum = sum *10+n;
            x= x/10;
        }
        if(a<0)
        {
            return false;
        }
        if(a==sum) 
        {
            return true;
        }
        return false;
    }
}