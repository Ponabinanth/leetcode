class Solution {
    public int sumOfTheDigitsOfHarshadNumber(int x) {
        int num = x;
        int sum = 0;
        while (x != 0) {
            int last = x % 10;
            sum += last;
            x /= 10;
        }
        if (num % sum == 0)
            return sum;
        return -1;   
    }
}