// Last updated: 8/10/2026, 6:27:12 PM
class Solution {
    public int minAdjacentSwaps(int[] nums, int a, int b) {
        long swaps=0;
        long c1=0;
        long c2=0;
        long MOD=1000000007;
        for(int num:nums){
            if(num<a){
                swaps=(swaps+c1+c2)%MOD;
            }
            else if(num>=a && num<=b){
                swaps=(swaps+c2)%MOD;
                c1++;
            }
            else{
                c2++;
            }
        }
        return (int)swaps;
    }
}