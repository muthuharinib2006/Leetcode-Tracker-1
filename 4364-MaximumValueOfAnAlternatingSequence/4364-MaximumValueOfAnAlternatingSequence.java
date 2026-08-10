// Last updated: 8/10/2026, 6:26:55 PM
class Solution {
    public long maximumValue(int n, int s, int m) {
        if(n==1)
            return s;
        return(long) s+ m +(long)((n-2)/2)*(m-1);
    }
}