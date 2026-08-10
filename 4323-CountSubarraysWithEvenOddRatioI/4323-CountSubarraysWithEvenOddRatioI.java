// Last updated: 8/10/2026, 6:27:14 PM
class Solution {
    public int countRatioSubarrays(int[] nums, int a, int b) {
        int c=0;
        int n=nums.length;
        for(int i=0;i<n;i++){
            int evenc=0;
            int oddc=0;
            for(int j=i;j<n;j++){
                if(nums[j]%2==0){
                    evenc++;
                }
                else{
                    oddc++;
                }
                if((long) evenc*b<=(long)oddc*a){
                    c++;
                }
            }
        }
        return c;
    }
}