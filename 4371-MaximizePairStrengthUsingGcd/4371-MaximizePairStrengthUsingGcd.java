// Last updated: 8/10/2026, 6:26:58 PM
class Solution {
    public long maxPairStrength(int[] nums) {
        long maxStrength=0;
        int n=nums.length;
        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                long a=nums[i];
                long b=nums[j];
                long g=gcd(a,b);

                long currentStrength=(a*b)/(g*g);
                maxStrength=Math.max(maxStrength,currentStrength);
            }
        }
        return maxStrength;
    }
    private long gcd(long a,long b){
        while(b!=0){
            long temp=b;
            b=a%b;
            a=temp;
        }
        return a;
    }
}